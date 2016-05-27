package com.example.alumno.clase9;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   ActionBar ab = getSupportActionBar();
     //   ab.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        MenuItem searchItem = menu.findItem(R.id.campo_buscar);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);

        //Seteamos listener con "this"
        searchView.setOnQueryTextListener(this);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

       // switch (item.getItemId()){
       //     case android.R.id.home:{
       //         finish();// Simulo back
       //         break;
       //     }
       // }

        if(id == R.id.action_settings){
            Log.d("menu", "Click en settings");
            return true;
        }

        if(id == R.id.action_settings2){
            Log.d("menu","Click en settings2");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        Log.d("activity","Se presiono Enter, se busca:" + query);

        Intent i = new Intent(this,Main2Activity.class);
       // i.putExtra("valor1",2);
        i.putExtra("url",query);
        startActivity(i);

        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        Log.d("activity","Se presiono una tecla, se busca:" + newText);
        return false;
    }
}
