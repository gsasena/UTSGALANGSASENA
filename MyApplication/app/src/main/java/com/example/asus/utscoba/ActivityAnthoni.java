package com.example.asus.utscoba;

import android.Manifest;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Asus on 06/11/2017.
 */


public class ActivityAnthoni extends Activity {
    Button b1;
    private Button button;

    String[] perangkat = {};

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.anthoni);

        b1=(Button)findViewById(R.id.telepon);
        call();

        // setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, perangkat));

        button = (Button) findViewById(R.id.telepon);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:08961234567"));

                if (ActivityCompat.checkSelfPermission(ActivityAnthoni.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }
        });

    }


    private void call() {
        Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("0000000000"));
        try{
            startActivity(in);
        }

        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"Activity Anthoni",Toast.LENGTH_SHORT).show();
        }
    }


    public void browser(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gmail.com"));
        startActivity(browserIntent);
    }


    /*
    public void telp(View view){
        Intent intent = new Intent(android.content.Intent.ACTION_CALL);
        intent.setData(Uri.parse("telp : +123456 "));
        if(ActivityCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            return;

        }
        startActivity(intent);
    }*/





    /*
    public void onListItemClick(ListView parent, View v, int urutan, long id) {

        Object detail = this.getListAdapter().getItem(urutan);

        String tampil = detail.toString();

        Intent i = null;

        if(tampil=="<< Kembali")

        {
            i = new Intent(ActivityAnthoni.this, MainActivity.class);

            startActivity(i);

        }

        else

        {

            Toast.makeText(this, "Anda Memilih : " + tampil, Toast.LENGTH_SHORT).show();

        }

    }
    */


}

