package com.android.myes;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
public class Menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void lihat(View view) {
        Intent lihat = new Intent(this, MainActivity.class);
        startActivity(lihat);
    }
    public void add(View view) {
        Intent Add = new Intent(this, BuatBiodata.class);
        startActivity(Add);
    }
}