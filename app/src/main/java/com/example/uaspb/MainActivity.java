package com.example.uaspb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newslist(View view) {
        Intent intent = new Intent(MainActivity.this, newslist.class);
        startActivity(intent);
    }

    public void galery(View view) {
        Intent intent = new Intent(MainActivity.this, galery.class);
        startActivity(intent);
    }

    public void aboutus(View view) {
        Intent intent = new Intent(MainActivity.this, aboutus.class);
        startActivity(intent);
    }

    public void feed(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:nbilaauliap@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback for Just App");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    //public void contactus(View view){
      //  Intent intent = new Intent(Intent.ACTION_SENDTO);
        //intent.setData(Uri.parse("mailto: riahara777@gmail.com"));
        //intent.putExtra(Intent.EXTRA_SUBJECT, "Write Your Feedback Here");
        //if (intent.resolveActivity(getPackageManager()) !=null){
          //  startActivity(intent);
       // }
    //}
}