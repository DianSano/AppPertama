package com.jodemy.apppertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //String datanama = getIntent().getStringExtra("nama").toString();
       // String datausia = getIntent().getStringExtra("usia").toString();
        TextView tvData = findViewById(R.id.tv_data);
        tvData.setText("Nama: " + getIntent().getStringExtra("nama") + "\n" +
                "Usia: " + getIntent().getStringExtra("usia"));
    }
}
