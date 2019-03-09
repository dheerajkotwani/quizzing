package com.example.quizzing;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ques5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques5);

    }




    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(ques5.this,MainActivity.class);
        startActivity(intent);
    }

    public void incorrect(View view)
    {
        view.setBackgroundColor(Color.RED);
        Toast.makeText(ques5.this,"Incorrect",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(ques5.this,tryagain.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

        startActivity(intent);
    }
    public void correct(View view)
    {
        Button b=findViewById(R.id.optiond);
        b.setBackgroundColor(Color.GREEN);
        Toast.makeText(ques5.this,"Score 50",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(ques5.this,finish.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
