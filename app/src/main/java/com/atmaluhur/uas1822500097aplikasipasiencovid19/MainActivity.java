package com.atmaluhur.uas1822500097aplikasipasiencovid19;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText cusername, cpassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cusername = (EditText) findViewById(R.id.username);
        cpassword = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.Login);

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String isusername = cusername.getText().toString();
                String ispassword = cpassword.getText().toString();

                if (isusername.equals("admin") && ispassword.equals("097"))
                {
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(this, DashboardActivity.class);
                    startActivity(i);
                }
                else
                {
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}
