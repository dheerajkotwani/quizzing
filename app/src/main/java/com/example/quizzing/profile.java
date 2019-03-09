package com.example.quizzing;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(profile.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    public void git(View view) {
        goToUrl("http://github.com/dheerajkotwani");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void call(View view) {
        view.setBackgroundColor(Color.MAGENTA);
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:8604609572"));
        startActivity(intent);
    }

    public void mail(View view) {
        view.setBackgroundColor(Color.MAGENTA);
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: dheeraj.kotwani41@gmail.com"));
        intent.putExtra(Intent.EXTRA_EMAIL, "dheeraj.kotwani41@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void insta(View view)
    {

        Button b=findViewById(R.id.but);
        b.setBackgroundResource(R.drawable.colorgreen);
        Uri uri = Uri.parse("http://instagram.com/_u/dheeraj_kotwani");
        Intent i= new Intent(Intent.ACTION_VIEW,uri);

        i.setPackage("com.instagram.android");

        try {
            startActivity(i);
        } catch (ActivityNotFoundException e) {

            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/dheeraj_kotwani")));
        }
    }
    public void std(View view)
    {   view.setBackgroundColor(Color.MAGENTA);
        Uri gmmIntentUri = Uri.parse("geo:28.612246,77.360162");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
    public void adr(View view)
    {   view.setBackgroundColor(Color.MAGENTA);
        Uri gmmIntentUri = Uri.parse("geo:28.610224,77.356807");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }

}
