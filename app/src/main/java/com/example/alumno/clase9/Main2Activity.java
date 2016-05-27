package com.example.alumno.clase9;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();
        Bundle extras = i.getExtras();

      //  int n = extras.getInt("valor1");
        String url = extras.getString("url");

        WebView v = (WebView)this.findViewById(R.id.webView1);
        WebSettings webSettings = v.getSettings();
        webSettings.setJavaScriptEnabled(true);
      //  v.loadData("<h1>UTN FRA</h1> <p>Laboratorio V</p>", "text/html charset=utf-8",null);
        v.loadUrl(url);

      //  Log.d("valor1", String.valueOf(new Integer(n)));
        Log.d("url",url);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (item.getItemId()){
            case android.R.id.home:{
                finish();// Simulo back
                break;
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
