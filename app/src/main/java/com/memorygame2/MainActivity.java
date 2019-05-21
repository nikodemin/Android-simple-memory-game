package com.memorygame2;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener
{
    SharedPreferences prefs;
    String dataName = "MyData";
    String intName = "MyInt";
    int defaultInt = 0;
    public static int hiScore;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(this);

        prefs = getSharedPreferences(dataName,MODE_PRIVATE);
        hiScore = prefs.getInt(intName, defaultInt);
        TextView textHiScore =(TextView) findViewById(R.id.textScore);
        textHiScore.setText("Hi: "+hiScore);
    }

    @Override
    public void onClick(View v)
    {
        Intent i = new Intent(this,GameActivity.class);
        startActivity(i);
    }
}
