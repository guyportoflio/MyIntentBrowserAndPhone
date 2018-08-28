package com.example.presly.myintentbrowserandphone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startBrowser = (Button)findViewById(R.id.start_browser);
        startBrowser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.example.com"));
                startActivity(i);
            }
        });

        Button startPhone = (Button)findViewById(R.id.start_browser);
        startPhone.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:9510300000"));
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       // inflate the menu, this adds items to action
        // bar if present
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
