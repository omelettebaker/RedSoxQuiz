package com.charliej.yoon.redsoxquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    //  This method is called when the "Easy" button is pressed on the Intro page.  It opens
//    easy quiz activity.
    public void easyQuiz(View view) {
        Intent intent = new Intent(this, EasyQuizActivity.class);
        startActivity(intent);
    }

//  This method is called when the "Difficult" button is pressed on the Intro page.  It opens
//    difficult quiz activity.

    public void difficultQuiz(View view) {
        Intent intent = new Intent(this, DifficultQuizActivity.class);
        startActivity(intent);
    }
}
