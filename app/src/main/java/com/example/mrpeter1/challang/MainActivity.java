package com.example.mrpeter1.challang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button buttonaja, buttonbaru;
    Button pencetdong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonaja = findViewById(R.id.buttonaja);
        buttonbaru = findViewById(R.id.buttonbaru);
        pencetdong = findViewById(R.id.pencetdong);

//        buttonbaru.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent challengeudemy = new Intent(MainActivity.this,challengekeduaudemy.this);
////                startActivity(challengeudemy);
////                Intent challengestart = new Intent(MainActivity.this,challengekeduaudemy.class); // kenapa biki variabel gotosign?
////                startActivity(challengestart); // saat klik dia akan keSignAct activity
//            }
//        });

        buttonbaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"hi there ", Toast.LENGTH_SHORT).show();

                Intent challengestart = new Intent(MainActivity.this,challengekeduaudemy.class); // kenapa biki variabel gotosign?
              startActivity(challengestart); // saat klik dia akan keSignAct activity

            }
        });

//        pencetdong.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(getApplicationContext(),"hi there ", Toast.LENGTH_SHORT).show();
//
////                Log.i("username", textuser.getText().toString() );
////                Log.i("password", textpassword.getText().toString() );
//                Log.i("INFO", "BUTTON TERTEKAN" );
//
//
//
//            }
//        });

    }
}
