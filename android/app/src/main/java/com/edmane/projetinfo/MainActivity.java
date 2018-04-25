package com.edmane.projetinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.edmane.projetinfo.Locate;

public class MainActivity extends AppCompatActivity {
    EditText distance = null;
    CheckBox mega = null;
    Button envoyer = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        envoyer = (Button) findViewById(R.id.calcul);
        mega = (CheckBox) findViewById(R.id.mega);
        distance = (EditText) findViewById(R.id.distance);
        envoyer.setOnClickListener(envoyerListener);
        distance.addTextChangedListener(textWatcher);
    }

    private OnClickListener envoyerListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
                String d = distance.getText().toString();
                Intent main2Activity = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(main2Activity);
        }
    };

    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }
        @Override
        public void afterTextChanged(Editable s) {

        }
    };







}

