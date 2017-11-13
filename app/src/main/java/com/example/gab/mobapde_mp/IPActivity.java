package com.example.gab.mobapde_mp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IPActivity extends AppCompatActivity {
    // widgets
    EditText et_ip;
    Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip);

        // Instantiate widgets
        et_ip = (EditText) findViewById(R.id.et_ip);
        btn_ok = (Button) findViewById(R.id.btn_ok);

        // click ok, pass IP address as extra, move to MainActivity
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), MainActivity.class);
                i.putExtra("ip", et_ip.getText().toString());
                startActivity(i);
            }
        });
    }
}
