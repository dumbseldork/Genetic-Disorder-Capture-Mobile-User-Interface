package com.skam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInScreen extends AppCompatActivity {
    Button mbtnlogin;
    Button mbtnwatchme;
    EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_screen);
        mbtnlogin=(Button)findViewById(R.id.btnlogin);

        mbtnwatchme=(Button)findViewById(R.id.btnwatchme);
        mbtnwatchme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwatchme();
            }
        });

        username=(EditText) findViewById(R.id.txtuser);
        password=(EditText) findViewById(R.id.txtpass);


        mbtnlogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                login();
                }
            }
        );

    }
    public void login(){
        String user=username.getText().toString().trim();
        String pass=password.getText().toString().trim();
        if (user.equals("Admin")&& pass.equals("Admin"))
        {
            Toast.makeText(this, "Username and Password Accepted!", Toast.LENGTH_SHORT).show();
            openMain();

        }else{
            Toast.makeText(this,"Username or Password is Incorrect!", Toast.LENGTH_LONG).show();
        }
    }
    public void openMain(){
        Intent intent=new Intent(this,Main.class);
        startActivity(intent);
    }
    public void openwatchme(){
        Intent intent1=new Intent(this,watchme.class);
        startActivity(intent1);
    }
}