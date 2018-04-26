package com.example.techkshetra.passdataapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView=(TextView)findViewById(R.id.textView_result);
        Bundle bundle= getIntent().getExtras();

        textView.setText(bundle.getString("name"));

    }
}
