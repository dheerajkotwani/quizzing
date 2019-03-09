package com.example.quizzing;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
    public void profile(View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(this, login.class);
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
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:8604609572"));
        startActivity(intent);
    }

    public void mail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: dheeraj.kotwani41@gmail.com"));
        intent.putExtra(Intent.EXTRA_EMAIL, "dheeraj.kotwani41@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}

