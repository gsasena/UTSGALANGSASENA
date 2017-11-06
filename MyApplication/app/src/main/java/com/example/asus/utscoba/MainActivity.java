package com.example.asus.utscoba;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity{

    String[] perangkat = { "Activity Anthoni", "Activity Ahmad", "Activity Maria"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, perangkat));
    }

    public void onListItemClick(ListView parent, View v, int urutan, long id) {
        Object detail = this.getListAdapter().getItem(urutan);
        String tampil = detail.toString();
        Intent i = null;
        if(tampil=="Activity Anthoni")
        {
            i = new Intent(MainActivity.this, ActivityAnthoni.class);
            startActivity(i);
        }else if(tampil=="Activity Ahmad")
        {

            i = new Intent(MainActivity.this, ActivityAhmad.class);

            startActivity(i);

        }

        else if(tampil=="Activity Maria")

        {

            i = new Intent(MainActivity.this, ActivityMaria.class);

            startActivity(i);

        }

    }
}


