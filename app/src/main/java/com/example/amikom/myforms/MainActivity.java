package com.example.amikom.myforms;

import android.content.Intent;
import android.provider.Settings;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtNama,txtEmail,txtPhone,txtPwd;
        Button btnSave;

        txtNama=(EditText)findViewById(R.id.txtNama);
        txtEmail=(EditText)findViewById(R.id.txtEmail);
        txtPhone=(EditText)findViewById(R.id.txtPhone);
        txtPwd=(EditText)findViewById(R.id.txtPwd);

        btnSave=(Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Nama",txtNama.getText().toString());
                Log.d("Email",txtEmail.getText().toString());
                Log.d("Phone",txtPhone.getText().toString());
                Log.d("Password",txtPwd.getText().toString());

Button lang = (Button) findViewById(R.id.button);
                lang.setOnClickListener(new View.OnClickListener(){
                 @Override
                    public void onClick(View view){
                     Intent intent=new Intent(Settings.ACTION_LOCALE_SETTINGS);
                     startActivity(intent);
                 }

                }
        });
    }
}
