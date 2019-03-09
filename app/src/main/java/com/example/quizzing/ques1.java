package com.example.quizzing;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class ques1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques1);
    }




    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(ques1.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);

    }


    public void incorrect(View view)
    {view.setBackgroundColor(Color.RED);
        Toast.makeText(ques1.this,"Incorrect",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(ques1.this,tryagain.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

        startActivity(intent);
    }
    public void correct(View view)
    {
        Button b=findViewById(R.id.optionc);
        b.setBackgroundColor(Color.GREEN);
        Toast.makeText(ques1.this,"Score 10",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(ques1.this,ques2.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
