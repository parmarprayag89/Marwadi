package com.example.marwadi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class singupActivity extends AppCompatActivity {

    TextView name,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_singup);

      name = findViewById(R.id.singup_email);
      password = findViewById(R.id.singup_pass);


      Bundle bundle = getIntent().getExtras();

      String semail = bundle.getString("name");
      String spassword = bundle.getString("password");
      name.setText(semail);
      password.setText(spassword);





    }
}