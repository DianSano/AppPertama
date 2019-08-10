package com.jodemy.apppertama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mNama;
    EditText mUsia;
    String sNama;
    String sUsia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNama = findViewById(R.id.et_nama);
        mUsia = findViewById(R.id.et_usia);

    }

    public void kirim(View v) {
        sNama = mNama.getText().toString();
        sUsia = mUsia.getText().toString();
        Intent intent = new Intent(this, ActivityKedua.class);

        startActivity(intent);
    }
}
