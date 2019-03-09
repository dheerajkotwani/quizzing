package com.example.quizzing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class tryagain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tryagain);
    }




    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(tryagain.this,MainActivity.class);
        startActivity(intent);
    }


    public void tryag(View view)
    {
        Toast.makeText(tryagain.this,"Start",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(tryagain.this,ques1.class);
        startActivity(intent);
    }
    public void exit(View view)
    {
        finishAffinity();
    }
}