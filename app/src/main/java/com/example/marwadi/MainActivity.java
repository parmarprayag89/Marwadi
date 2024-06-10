package com.example.marwadi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

  Button btn;

  EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.main_button);
        email = findViewById(R.id.main_email);
        password = findViewById(R.id.main_pass);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,singupActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("name",email.getText().toString());
                bundle.putString("password",password.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}