package com.example.fakelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText usershow,pwshow;
    private Button btn1;
    private TextView muestra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usershow = findViewById(R.id.et_id);
        pwshow= findViewById(R.id.editpw);
        btn1= findViewById(R.id.butid);
        muestra= findViewById(R.id.texshowid);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestra.setText(usershow.getText());

            }
        });

        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                muestra.setText(pwshow.getText());
                return false;
            }
        });

    }
}
