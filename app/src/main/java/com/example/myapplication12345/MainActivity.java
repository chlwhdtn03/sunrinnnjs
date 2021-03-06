package com.example.myapplication12345;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
        Button btn3 = findViewById(R.id.software);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),sofrware1.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.protect);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),protect1.class);
                startActivity(intent);
            }
        });

        Button btn4= findViewById(R.id.design);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),design1.class);
                startActivity(intent);
            }
        });

        Button btn5=findViewById(R.id.it);
                btn5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(),it.class);
                        startActivity(intent);
                    }
                });

                Button wk1 = findViewById(R.id.sunrinwk);
                wk1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), "선린위키에 오신것을 환영합니다", Toast.LENGTH_SHORT).show();
                        finish();
                       Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sunrinwiki.layer7.kr/index.php/%EB%8C%80%EB%AC%B8"));
                       startActivity(intent);
                    }
                });
                Button bb = findViewById(R.id.bamboo);
                bb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), "선린대나무숲에 오신것을 환영합니다.", Toast.LENGTH_SHORT).show();
                        finish();
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sunrinbamboo/"));
                        startActivity(intent);
                    }
                });
    }
}