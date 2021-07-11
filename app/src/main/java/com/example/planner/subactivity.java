package com.example.planner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class subactivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    EditText inputToDo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subactivity);

        btn1=findViewById(R.id.mon);
        btn2=findViewById(R.id.tue);
        btn3=findViewById(R.id.wed);
        btn4=findViewById(R.id.thu);
        btn5=findViewById(R.id.fri);
        btn6=findViewById(R.id.sat);
        btn7=findViewById(R.id.sun);
        //Button saveButton = findViewById(R.id.saveButton);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                monfragment monfragment=new monfragment();
                transaction.replace(R.id.frame, monfragment);
                transaction.commit();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                tuefragment tuefragment=new tuefragment();
                transaction.replace(R.id.frame, tuefragment);
                transaction.commit();

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                wedfragment wedfragment=new wedfragment();
                transaction.replace(R.id.frame, wedfragment);
                transaction.commit();

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                thufragment thufragment=new thufragment();
                transaction.replace(R.id.frame, thufragment);
                transaction.commit();

            }
        });        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                frifragment frifragment=new frifragment();
                transaction.replace(R.id.frame, frifragment);
                transaction.commit();

            }
        });        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                satfragment satfragment=new satfragment();
                transaction.replace(R.id.frame, satfragment);
                transaction.commit();

            }
        });        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                sunfragment sunfragment=new sunfragment();
                transaction.replace(R.id.frame, sunfragment);
                transaction.commit();

            }
        });
        /*saveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                Toast.makeText(getApplicationContext(),"추가되었습니다.",Toast.LENGTH_SHORT).show();

            }
        });*/






    }


}