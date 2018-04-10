package com.nackir.android.topquizz.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.nackir.android.topquizz.R;

public class GameActivity extends AppCompatActivity {

    private TextView gQuestionText;
    private Button gAnswer1Btn;
    private Button gAnswer2Btn;
    private Button gAnswer3Btn;
    private Button gAnswer4Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // Référencement des éléments graphiques
        gQuestionText = (TextView) findViewById(R.id.activity_game_question_text);
        gAnswer1Btn = (Button) findViewById(R.id.activity_game_answer1_btn);
        gAnswer2Btn = (Button) findViewById(R.id.activity_game_answer2_btn);
        gAnswer3Btn = (Button) findViewById(R.id.activity_game_answer3_btn);
        gAnswer4Btn = (Button) findViewById(R.id.activity_game_answer4_btn);

    }

}
