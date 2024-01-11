package com.classwork.mon3dz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      button = findViewById(R.id.btn_galery);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(Intent.ACTION_SEND);
              intent.setType("plain/text");
              intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "some@email.address" });
              intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
              intent.putExtra(Intent.EXTRA_TEXT, "mail body");
              startActivity(Intent.createChooser(intent, "bro"));
          }
      });

    }
}