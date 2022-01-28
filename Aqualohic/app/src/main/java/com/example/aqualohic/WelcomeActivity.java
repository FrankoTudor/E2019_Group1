package com.example.aqualohic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void onButtonSignUpClicked(View view){

    }
    public void onButtonSignInClicked(View view){
  Intent intent= new Intent(WelcomeActivity.this, SignInActivity.class);
    startActivity(intent);
    }
}