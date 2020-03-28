package com.example.testapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hi");

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.editText);
                showDialog(et.getText().toString());
            }
        });
    }

    public void showDialog(String inputValue){
        ExampleDialog ed = new ExampleDialog();
        ed.setValueToDisplay(inputValue);
        ed.show(getSupportFragmentManager(), "example");
    }
}
