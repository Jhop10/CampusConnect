package com.example.admin1.firstlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.content.Intent;
public class Login extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signUp(View view){
        Intent startNewActivity = new Intent (this, signUpActivity.class);
        startActivity(startNewActivity);
    }

    public void learnMore(View view){
        Intent startNewActivity = new Intent (this, LearnMore.class);
        startActivity(startNewActivity);
    }

}
