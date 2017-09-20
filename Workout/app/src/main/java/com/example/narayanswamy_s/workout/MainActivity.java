package com.example.narayanswamy_s.workout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {



    static WorkOutHelper wk;
    public static int user_level=0;
    public static int workout_index=0;

    TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wk=new WorkOutHelper();
        myText = (TextView)findViewById(R.id.myText);
        myText.setText(wk.workout_array[user_level].workout_list[workout_index]);
    }

    public void onButtonClick(View v){
        if(workout_index<2 && user_level < 2) {
            workout_index++;
        }
        else if(workout_index == 2 && user_level < 2){
            user_level++;
            workout_index=0;
        }
        if(user_level < 2 ){
            Intent myIntent = new Intent(MainActivity.this,TimerClass.class);
            startActivity(myIntent);
        }

    }
}
