package com.classwork.mon3dz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button button;
private EditText et_odin;
private EditText et_dva;
private EditText et_three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      button = findViewById(R.id.btn_galery);
      et_odin = findViewById(R.id.et_odin);
      et_dva = findViewById(R.id.et_2);
      et_three = findViewById(R.id.et_three);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(Intent.ACTION_SEND);
              intent.setType("email/*");
              intent.putExtra(Intent.EXTRA_EMAIL, new String[] { et_odin.getText().toString()});
              intent.putExtra(Intent.EXTRA_SUBJECT, et_dva.getText().toString());
              intent.putExtra(Intent.EXTRA_TEXT, et_three.getText().toString());
              startActivity((intent));
          }
      });

    }
}