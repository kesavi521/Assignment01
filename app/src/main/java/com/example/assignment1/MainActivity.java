package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int count=0;
    Button b;
    Button b1;
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        b1=findViewById(R.id.button2);
        t1=findViewById(R.id.textView2);
        t2=findViewById(R.id.textView3);
        t3=findViewById(R.id.textView4);
    }

    public void show(View view) {
        Toast.makeText(this,"increasing age...",Toast.LENGTH_LONG).show();
    }

    public void incr(View view) {
        count++;
        t2.setText(Integer.toString(count));
        if(count>18)
        {
            String s="hey you are eligible to vote!!";
            t3.setText(s);
            if(count>21)
            {
                String s1="Woah You are independent now..!";
                t3.setText(s1);
            }
        }

        Random r=new Random();
        int a= Color.rgb(r.nextInt(256),r.nextInt(256),r.nextInt(256));
        t2.setTextColor(a);
    }

}
