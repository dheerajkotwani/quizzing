package com.example.quizzing;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Boolean.FALSE;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
        public void onBackPressed() {
            super.onBackPressed();
            Intent intent=new Intent(login.this,MainActivity.class);
            startActivity(intent);
        }
        EditText a,b,mText;
        String c="",d="";
        boolean e;
        public void login(View view){
            a=(EditText) findViewById(R.id.text1);
            b=(EditText) findViewById(R.id.text2);
            c=a.getText().toString();
            d=b.getText().toString();
            e= Patterns.EMAIL_ADDRESS.matcher(d).matches();
            if(c.isEmpty())
            {
                Toast.makeText(login.this, "Enter All Details", Toast.LENGTH_LONG).show();
            }
            else if(e==FALSE) {
                Toast.makeText(login.this, "Enter Valid Email", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this,"Welcome "+c,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(login.this, ques1.class);
                startActivity(intent);

                Button b=findViewById(R.id.login);
                b.setBackgroundColor(Color.GREEN);
            }
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
