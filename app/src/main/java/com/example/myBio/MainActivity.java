package com.example.myBio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnadd;
    private TextView textprint;
    private TextView edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnadd=findViewById(R.id.button);
        textprint=findViewById(R.id.textView2);
        edit=findViewById(R.id.editText);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String p=edit.getText().toString();
                edit.setText("");
                textprint.setText(p);
                textprint.setVisibility(View.VISIBLE);

            }
        });


    }
}