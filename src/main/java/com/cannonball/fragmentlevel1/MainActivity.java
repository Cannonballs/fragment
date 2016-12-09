package com.cannonball.fragmentlevel1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1= (Button) findViewById(R.id.btn1);
        Button btn2= (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        firstFragment firstFragment =new firstFragment();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.frame,firstFragment);
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn1){
            firstFragment firstFragment =new firstFragment();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();
            transaction.replace(R.id.frame,firstFragment);
            transaction.commit();
        }else {
            secondFragment secondFragment =new secondFragment();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();
            transaction.replace(R.id.frame,secondFragment);
            transaction.commit();
        }
    }
}
