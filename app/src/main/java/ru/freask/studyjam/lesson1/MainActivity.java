package ru.freask.studyjam.lesson1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
*  LESSON 1
* */

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    TextView text;
    EditText edit;
    Button but;

    final int r_but = R.id.but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        edit = (EditText) findViewById(R.id.edit);
        but = (Button) findViewById(R.id.but);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case r_but:
                text.setText(edit.getText().toString());
                break;
            default: break;
        }
    }
}
