package com.example.contentproviderdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PackageManagerCompat;

import android.Manifest;
import android.app.Activity;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        private static final int REQUEST_CONTACT_ASK_PERMISSIONS = 1001;
        private static final int REQUEST_SMS_ASK_PERMISSIONS =1002;

        Button btn1, btn2;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            addControl();
            addEvents();
        }
        private void addEvents(){
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    xuLyMoHinhDanhBa();
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    xuLyMoHinhTinNhan();
                }
            });
        }

        private void xuLyMoHinhDanhBa(){

        }

        private void xuLyMoHinhTinNhan(){
            Intent intent = new Intent(MainActivity.this, DanhBa.class);
            intent.setClassName("com.example.contentproviderdemo","com.example.DanhBa");
            startActivity(intent);
        }

        private void addControl(){
            btn1 = findViewById(R.id.btn1);
            btn2 = findViewById(R.id.btn2);
        }
    }
