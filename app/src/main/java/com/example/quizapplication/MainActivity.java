package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout math = findViewById(R.id.mathLayout);
        final LinearLayout science = findViewById(R.id.scienceLayout);
        final LinearLayout techonology = findViewById(R.id.technologyLayout);
        final LinearLayout history = findViewById(R.id.historyLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                selectedTopicName = "math";

                math.setBackgroundResource(R.drawable.round_back_white_stroke);

                science.setBackgroundResource(R.drawable.round_back_white10);
                techonology.setBackgroundResource(R.drawable.round_back_white10);
                history.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

       science.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){

               selectedTopicName = "science";

               science.setBackgroundResource(R.drawable.round_back_white_stroke);

               math.setBackgroundResource(R.drawable.round_back_white10);
               techonology.setBackgroundResource(R.drawable.round_back_white10);
               history.setBackgroundResource(R.drawable.round_back_white10);

           }
       });

        techonology.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                selectedTopicName = "technology";

                techonology.setBackgroundResource(R.drawable.round_back_white_stroke);

                science.setBackgroundResource(R.drawable.round_back_white10);
                math.setBackgroundResource(R.drawable.round_back_white10);
                history.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        history.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                selectedTopicName = "history";

                history.setBackgroundResource(R.drawable.round_back_white_stroke);

                science.setBackgroundResource(R.drawable.round_back_white10);
                techonology.setBackgroundResource(R.drawable.round_back_white10);
                math.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        startBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please select a topic", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent (MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });

    }
}