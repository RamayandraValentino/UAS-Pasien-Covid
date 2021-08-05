package com.atmaluhur.uas1822500097aplikasipasiencovid19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class TambahDataActivity extends AppCompatActivity {
    Button btnKembali;
    String[] kecamatan = {"Riau Silip", "Belinyu", "Sungailiat", "Pangkalpinang", "Pemali"};
    Spinner kcmt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);

        kcmt = (Spinner)findViewById(R.id.kcmt);

        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,kecamatan);

        btnKembali = (Button)findViewById(R.id.btnKembali);

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perintah untuk kembali kehalaman berikutnya
                startActivity(new Intent(TambahDataActivity.this,DashboardActivity.class));
                finish();

            }
        });
    }
}
