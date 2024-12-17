package com.suii.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1;
    String s1,s2;
    String s3="wrong credentials";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.user);
        et2=findViewById(R.id.pas);
        b1=findViewById(R.id.log);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (et1.getText().toString().equals("admin") && et2.getText().toString().equals("12345"))
               {
                   Intent iu = new Intent(getApplicationContext(), Second.class);
                   startActivity(iu);
               }
               else
               {
                   Toast.makeText(getApplicationContext(), s3, Toast.LENGTH_LONG).show();
               }


            }
        });
    }
}