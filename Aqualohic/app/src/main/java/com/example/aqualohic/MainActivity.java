package com.example.aqualohic;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TextView textView= findViewById(R.id.Aqua);
        textView.animate().translationX(1000).setDuration(100).setStartDelay(4000);

        Thread thread=new Thread(){

            public void run(){
                try{
                    Thread.sleep(4000);
                }
                catch (Exception e){
                      e.printStackTrace();
                }

                finally {
                    Intent intent = new Intent(MainActivity. this, WelcomeActivity.class);
                    startActivity(intent);


                }
            }
        };
        thread.start();
    }
}