
package com.example.mrpeter1.challang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class challengekeduaudemy extends AppCompatActivity {
 Button pindahgambar, buttonbaru;
 ImageView imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challengekeduaudemy);
        pindahgambar = findViewById(R.id.pindahgambar);
        imageView2 = findViewById(R.id.imageView2);

        pindahgambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent pindahdirec = new Intent(challengekeduaudemy.this,pindahgambar.class); // kenapa biki variabel gotosign?
//                startActivity(pindahdirec); // saat klik dia akan keSignAct activity
                imageView2.setImageResource(R.drawable.cat1);
            }
        });
    }

}
