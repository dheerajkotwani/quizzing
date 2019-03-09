package com.example.quizzing;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class finish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

    }
    public void start(View view)
    {
        Button b=findViewById(R.id.but);
        b.setBackgroundColor(Color.GREEN);
        Intent intent=new Intent(finish.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);


    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(finish.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    public void git(View view)
    {
        goToUrl("http://github.com/dheerajkotwani");
    }
    private void goToUrl(String url){
        Uri uriUrl=Uri.parse(url);
        Intent launchBrowser=new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void call(View view)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:8604609572"));
        startActivity(intent);
    }
    public void mail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: dheeraj.kotwani41@gmail.com"));
        intent.putExtra(Intent.EXTRA_EMAIL,"dheeraj.kotwani41@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
