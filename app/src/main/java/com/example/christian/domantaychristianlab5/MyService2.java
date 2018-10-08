package com.example.christian.domantaychristianlab5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MyService2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }



    public void process(View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.act1)
        {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.btnMap)
        {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.566013, 121.031184"));
            chooser = Intent.createChooser(i, "Choose map application:");
            startActivity(chooser);
        }
    }
}
