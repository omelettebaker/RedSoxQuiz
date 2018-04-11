package com.charliej.yoon.redsoxquiz;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class EasyQuizActivity extends AppCompatActivity {

    // Define constants for KEYS to store whether radio buttons are checked.
    private static final String KEY_ANSWER_1A = "KEY_1A";
    private static final String KEY_ANSWER_1B = "KEY_1B";
    private static final String KEY_ANSWER_1C = "KEY_1C";
    private static final String KEY_ANSWER_1D = "KEY_1D";
    private static final String KEY_ANSWER_2A = "KEY_2A";
    private static final String KEY_ANSWER_2B = "KEY_2B";
    private static final String KEY_ANSWER_2C = "KEY_2C";
    private static final String KEY_ANSWER_2D = "KEY_2D";
    private static final String KEY_ANSWER_3A = "KEY_3A";
    private static final String KEY_ANSWER_3B = "KEY_3B";
    private static final String KEY_ANSWER_5A = "KEY_5A";
    private static final String KEY_ANSWER_5B = "KEY_5B";
    private static final String KEY_ANSWER_5C = "KEY_5C";
    private static final String KEY_ANSWER_5D = "KEY_5D";
    private static final String KEY_ANSWER_7A = "KEY_7A";
    private static final String KEY_ANSWER_7B = "KEY_7B";
    private static final String KEY_ANSWER_7C = "KEY_7C";
    private static final String KEY_ANSWER_7D = "KEY_7D";
    private static final String KEY_ANSWER_8A = "KEY_8A";
    private static final String KEY_ANSWER_8B = "KEY_8B";
    private static final String KEY_ANSWER_8C = "KEY_8C";
    private static final String KEY_ANSWER_8D = "KEY_8D";
    private static final String KEY_ANSWER_9A = "KEY_9A";
    private static final String KEY_ANSWER_9B = "KEY_9B";
    private static final String KEY_ANSWER_9C = "KEY_9C";
    private static final String KEY_ANSWER_9D = "KEY_9D";
    private static final String KEY_ANSWER_10A = "KEY_10A";
    private static final String KEY_ANSWER_10B = "KEY_10B";
    private static final String KEY_ANSWER_10C = "KEY_10C";
    private static final String KEY_ANSWER_10D = "KEY_10D";
    private static final String KEY_CHECKBOX_4A = "KEY_BOX_4A";
    private static final String KEY_CHECKBOX_4B = "KEY_BOX_4B";
    private static final String KEY_CHECKBOX_4C = "KEY_BOX_4C";
    private static final String KEY_CHECKBOX_4D = "KEY_BOX_4D";
    private static final String KEY_CHECKBOX_6A = "KEY_BOX_6A";
    private static final String KEY_CHECKBOX_6B = "KEY_BOX_6B";
    private static final String KEY_CHECKBOX_6C = "KEY_BOX_6C";
    private static final String KEY_CHECKBOX_6D = "KEY_BOX_6D";
    // Define variable for the number of correct answers the user scores.
    int score;
    // Define variables for the radio groups.
    RadioGroup easyAnswer1;
    RadioGroup easyAnswer2;
    RadioGroup easyAnswer3;
    RadioGroup easyAnswer5;
    RadioGroup easyAnswer7;
    RadioGroup easyAnswer8;
    RadioGroup easyAnswer9;
    RadioGroup easyAnswer10;

    // Define constants for use as KEYS in savedInstanceState bundle. It will store which radio
    // button is checked in each radio group and whether each of the checkboxes are checked.
//    private static final String KEY_ANSWER_GROUP_1 = "KEY_ANS_GROUP_1";
//    private static final String KEY_ANSWER_GROUP_2 = "KEY_ANS_GROUP_2";
//    private static final String KEY_ANSWER_GROUP_3 = "KEY_ANS_GROUP_3";
//    private static final String KEY_ANSWER_GROUP_5 = "KEY_ANS_GROUP_5";
//    private static final String KEY_ANSWER_GROUP_7 = "KEY_ANS_GROUP_7";
//    private static final String KEY_ANSWER_GROUP_8 = "KEY_ANS_GROUP_8";
    // Define variables for radio button answers.
    RadioButton easyAnswer1A;
    RadioButton easyAnswer1B;
    RadioButton easyAnswer1C;
    RadioButton easyAnswer1D;
    RadioButton easyAnswer2A;
    RadioButton easyAnswer2B;
    RadioButton easyAnswer2C;
    RadioButton easyAnswer2D;
    RadioButton easyAnswer3A;
    RadioButton easyAnswer3B;
    RadioButton easyAnswer5A;
    RadioButton easyAnswer5B;
    RadioButton easyAnswer5C;
    RadioButton easyAnswer5D;
    RadioButton easyAnswer7A;
    RadioButton easyAnswer7B;
    RadioButton easyAnswer7C;
    RadioButton easyAnswer7D;
    RadioButton easyAnswer8A;
    RadioButton easyAnswer8B;
    RadioButton easyAnswer8C;
    RadioButton easyAnswer8D;
    RadioButton easyAnswer9A;
    RadioButton easyAnswer9B;
    RadioButton easyAnswer9C;
    RadioButton easyAnswer9D;
    RadioButton easyAnswer10A;
    RadioButton easyAnswer10B;
    RadioButton easyAnswer10C;
    RadioButton easyAnswer10D;
    // Define Checkbox buttons for the possible answers for questions 4 and 6.
    CheckBox easyAnswerCheckBox4A;
    CheckBox easyAnswerCheckBox4B;
    CheckBox easyAnswerCheckBox4C;
    CheckBox easyAnswerCheckBox4D;
    CheckBox easyAnswerCheckBox6A;
    CheckBox easyAnswerCheckBox6B;
    CheckBox easyAnswerCheckBox6C;
    CheckBox easyAnswerCheckBox6D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_quiz);
        initializeViews();
    }

    // Method for initializing variables to their corresponding views defined in the XML layout.
    private void initializeViews() {

        easyAnswer1 = findViewById(R.id.easyAnswerGroup1);
        easyAnswer2 = findViewById(R.id.easyAnswerGroup2);
        easyAnswer3 = findViewById(R.id.easyAnswerGroup3);
        easyAnswer5 = findViewById(R.id.easyAnswerGroup5);
        easyAnswer7 = findViewById(R.id.easyAnswerGroup7);
        easyAnswer8 = findViewById(R.id.easyAnswerGroup8);
        easyAnswer9 = findViewById(R.id.easyAnswerGroup9);
        easyAnswer10 = findViewById(R.id.easyAnswerGroup10);

        easyAnswer1A = findViewById(R.id.easyAnswer1A);
        easyAnswer1B = findViewById(R.id.easyAnswer1B);
        easyAnswer1C = findViewById(R.id.easyAnswer1C);
        easyAnswer1D = findViewById(R.id.easyAnswer1D);

        easyAnswer2A = findViewById(R.id.easyAnswer2A);
        easyAnswer2B = findViewById(R.id.easyAnswer2B);
        easyAnswer2C = findViewById(R.id.easyAnswer2C);
        easyAnswer2D = findViewById(R.id.easyAnswer2D);

        easyAnswer3A = findViewById(R.id.easyAnswer3A);
        easyAnswer3B = findViewById(R.id.easyAnswer3B);

        easyAnswer5A = findViewById(R.id.easyAnswer5A);
        easyAnswer5B = findViewById(R.id.easyAnswer5B);
        easyAnswer5C = findViewById(R.id.easyAnswer5C);
        easyAnswer5D = findViewById(R.id.easyAnswer5D);

        easyAnswer7A = findViewById(R.id.easyAnswer7A);
        easyAnswer7B = findViewById(R.id.easyAnswer7B);
        easyAnswer7C = findViewById(R.id.easyAnswer7C);
        easyAnswer7D = findViewById(R.id.easyAnswer7D);

        easyAnswer8A = findViewById(R.id.easyAnswer8A);
        easyAnswer8B = findViewById(R.id.easyAnswer8B);
        easyAnswer8C = findViewById(R.id.easyAnswer8C);
        easyAnswer8D = findViewById(R.id.easyAnswer8D);

        easyAnswer9A = findViewById(R.id.easyAnswer9A);
        easyAnswer9B = findViewById(R.id.easyAnswer9B);
        easyAnswer9C = findViewById(R.id.easyAnswer9C);
        easyAnswer9D = findViewById(R.id.easyAnswer9D);

        easyAnswer10A = findViewById(R.id.easyAnswer10A);
        easyAnswer10B = findViewById(R.id.easyAnswer10B);
        easyAnswer10C = findViewById(R.id.easyAnswer10C);
        easyAnswer10D = findViewById(R.id.easyAnswer10D);


        easyAnswerCheckBox4A = findViewById(R.id.easyAnswer4A);
        easyAnswerCheckBox4B = findViewById(R.id.easyAnswer4B);
        easyAnswerCheckBox4C = findViewById(R.id.easyAnswer4C);
        easyAnswerCheckBox4D = findViewById(R.id.easyAnswer4D);

        easyAnswerCheckBox6A = findViewById(R.id.easyAnswer6A);
        easyAnswerCheckBox6B = findViewById(R.id.easyAnswer6B);
        easyAnswerCheckBox6C = findViewById(R.id.easyAnswer6C);
        easyAnswerCheckBox6D = findViewById(R.id.easyAnswer6D);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);

        outState.putBoolean(KEY_ANSWER_1A, easyAnswer1A.isChecked());
        outState.putBoolean(KEY_ANSWER_1B, easyAnswer1B.isChecked());
        outState.putBoolean(KEY_ANSWER_1C, easyAnswer1C.isChecked());
        outState.putBoolean(KEY_ANSWER_1D, easyAnswer1D.isChecked());

        outState.putBoolean(KEY_ANSWER_2A, easyAnswer2A.isChecked());
        outState.putBoolean(KEY_ANSWER_2B, easyAnswer2B.isChecked());
        outState.putBoolean(KEY_ANSWER_2C, easyAnswer2C.isChecked());
        outState.putBoolean(KEY_ANSWER_2D, easyAnswer2D.isChecked());

        outState.putBoolean(KEY_ANSWER_3A, easyAnswer3A.isChecked());
        outState.putBoolean(KEY_ANSWER_3B, easyAnswer3B.isChecked());

        outState.putBoolean(KEY_ANSWER_5A, easyAnswer5A.isChecked());
        outState.putBoolean(KEY_ANSWER_5B, easyAnswer5B.isChecked());
        outState.putBoolean(KEY_ANSWER_5C, easyAnswer5C.isChecked());
        outState.putBoolean(KEY_ANSWER_5D, easyAnswer5D.isChecked());

        outState.putBoolean(KEY_ANSWER_7A, easyAnswer7A.isChecked());
        outState.putBoolean(KEY_ANSWER_7B, easyAnswer7B.isChecked());
        outState.putBoolean(KEY_ANSWER_7C, easyAnswer7C.isChecked());
        outState.putBoolean(KEY_ANSWER_7D, easyAnswer7D.isChecked());

        outState.putBoolean(KEY_ANSWER_8A, easyAnswer8A.isChecked());
        outState.putBoolean(KEY_ANSWER_8B, easyAnswer8B.isChecked());
        outState.putBoolean(KEY_ANSWER_8C, easyAnswer8C.isChecked());
        outState.putBoolean(KEY_ANSWER_8D, easyAnswer8D.isChecked());

        outState.putBoolean(KEY_ANSWER_9A, easyAnswer9A.isChecked());
        outState.putBoolean(KEY_ANSWER_9B, easyAnswer9B.isChecked());
        outState.putBoolean(KEY_ANSWER_9C, easyAnswer9C.isChecked());
        outState.putBoolean(KEY_ANSWER_9D, easyAnswer9D.isChecked());

        outState.putBoolean(KEY_ANSWER_9A, easyAnswer9A.isChecked());
        outState.putBoolean(KEY_ANSWER_9B, easyAnswer9B.isChecked());
        outState.putBoolean(KEY_ANSWER_9C, easyAnswer9C.isChecked());
        outState.putBoolean(KEY_ANSWER_9D, easyAnswer9D.isChecked());

        outState.putBoolean(KEY_ANSWER_10A, easyAnswer10A.isChecked());
        outState.putBoolean(KEY_ANSWER_10B, easyAnswer10B.isChecked());
        outState.putBoolean(KEY_ANSWER_10C, easyAnswer10C.isChecked());
        outState.putBoolean(KEY_ANSWER_10D, easyAnswer10D.isChecked());


        // Store whether the checkboxes are checked.
        outState.putBoolean(KEY_CHECKBOX_4A, easyAnswerCheckBox4A.isChecked());
        outState.putBoolean(KEY_CHECKBOX_4B, easyAnswerCheckBox4B.isChecked());
        outState.putBoolean(KEY_CHECKBOX_4C, easyAnswerCheckBox4C.isChecked());
        outState.putBoolean(KEY_CHECKBOX_4D, easyAnswerCheckBox4D.isChecked());

        outState.putBoolean(KEY_CHECKBOX_6A, easyAnswerCheckBox6A.isChecked());
        outState.putBoolean(KEY_CHECKBOX_6B, easyAnswerCheckBox6B.isChecked());
        outState.putBoolean(KEY_CHECKBOX_6C, easyAnswerCheckBox6C.isChecked());
        outState.putBoolean(KEY_CHECKBOX_6D, easyAnswerCheckBox6D.isChecked());


    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        // Restores RadioButton state, checked or unchecked.
        easyAnswer1A.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_1A));
        easyAnswer1B.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_1B));
        easyAnswer1C.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_1C));
        easyAnswer1D.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_1D));

        easyAnswer2A.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_2A));
        easyAnswer2B.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_2B));
        easyAnswer2C.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_2C));
        easyAnswer2D.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_2D));

        easyAnswer3A.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_3A));
        easyAnswer3B.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_3B));

        easyAnswer5A.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_5A));
        easyAnswer5B.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_5B));
        easyAnswer5C.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_5C));
        easyAnswer5D.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_5D));

        easyAnswer7A.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_7A));
        easyAnswer7B.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_7B));
        easyAnswer7C.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_7C));
        easyAnswer7D.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_7D));

        easyAnswer8A.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_8A));
        easyAnswer8B.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_8B));
        easyAnswer8C.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_8C));
        easyAnswer8D.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_8D));

        easyAnswer9A.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_9A));
        easyAnswer9B.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_9B));
        easyAnswer9C.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_9C));
        easyAnswer9D.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_9D));

        easyAnswer10A.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_10A));
        easyAnswer10B.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_10B));
        easyAnswer10C.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_10C));
        easyAnswer10D.setChecked(savedInstanceState.getBoolean(KEY_ANSWER_10D));

        // Restores CheckBox state, checked or unchecked.
        easyAnswerCheckBox4A.setChecked(savedInstanceState.getBoolean(KEY_CHECKBOX_4A));
        easyAnswerCheckBox4B.setChecked(savedInstanceState.getBoolean(KEY_CHECKBOX_4B));
        easyAnswerCheckBox4C.setChecked(savedInstanceState.getBoolean(KEY_CHECKBOX_4C));
        easyAnswerCheckBox4D.setChecked(savedInstanceState.getBoolean(KEY_CHECKBOX_4D));

        easyAnswerCheckBox6A.setChecked(savedInstanceState.getBoolean(KEY_CHECKBOX_6A));
        easyAnswerCheckBox6B.setChecked(savedInstanceState.getBoolean(KEY_CHECKBOX_6B));
        easyAnswerCheckBox6C.setChecked(savedInstanceState.getBoolean(KEY_CHECKBOX_6C));
        easyAnswerCheckBox6D.setChecked(savedInstanceState.getBoolean(KEY_CHECKBOX_6D));
    }

    // This is the method called when the user presses the "Submit" button.
    public void submitTest(View v) {
        score = 0;

        // Define variables for the answers to the questions with radio groups.
        String quizAnswer1 = getResources().getString(R.string.easyAnswer1D);
        String quizAnswer2 = getResources().getString(R.string.easyAnswer2C);
        String quizAnswer3 = getResources().getString(R.string.easyAnswer3A);
        String quizAnswer5 = getResources().getString(R.string.easyAnswer5A);
        String quizAnswer7 = getResources().getString(R.string.easyAnswer7A);
        String quizAnswer8 = getResources().getString(R.string.easyAnswer8B);
        String quizAnswer9 = getResources().getString(R.string.easyAnswer9D);
        String quizAnswer10 = getResources().getString(R.string.easyAnswer10D);

        // Check to see if the quiz is complete.  If not, user is prompted to finish via a
        // Toast message. App does not continue until user answers all questions.
        if (!checkComplete()) {
            return;
        }

        // Check if user correctly answered the questions with radio buttons:
        checkRadioQuestions(easyAnswer1, quizAnswer1);
        checkRadioQuestions(easyAnswer2, quizAnswer2);
        checkRadioQuestions(easyAnswer3, quizAnswer3);
        checkRadioQuestions(easyAnswer5, quizAnswer5);
        checkRadioQuestions(easyAnswer7, quizAnswer7);
        checkRadioQuestions(easyAnswer8, quizAnswer8);
        checkRadioQuestions(easyAnswer9, quizAnswer9);
        checkRadioQuestions(easyAnswer10, quizAnswer10);

        // Check if question 4 is answered correctly.
        if (easyAnswerCheckBox4A.isChecked() && !easyAnswerCheckBox4B.isChecked() &&
                easyAnswerCheckBox4C.isChecked() && easyAnswerCheckBox4D.isChecked()) {
            score++;
        }

        // Check if question 6 is answered correctly.
        if (!easyAnswerCheckBox6A.isChecked() && easyAnswerCheckBox6B.isChecked() &&
                easyAnswerCheckBox6C.isChecked() && easyAnswerCheckBox6D.isChecked()) {
            score++;
        }

        quizFinishedToastMessage();
    }

    // This method checks to see if all the questions have been answered.  If any question has no
    // response, a toast will display telling the user to complete quiz.
    private boolean checkComplete() {
        if (easyAnswer1.getCheckedRadioButtonId() == -1) {
            incompleteQuizToastMessage();
            return false;

        } else if (easyAnswer2.getCheckedRadioButtonId() == -1) {
            incompleteQuizToastMessage();
            return false;

        } else if (easyAnswer3.getCheckedRadioButtonId() == -1) {
            incompleteQuizToastMessage();
            return false;

        } else if (easyAnswer5.getCheckedRadioButtonId() == -1) {
            incompleteQuizToastMessage();
            return false;

        } else if (easyAnswer7.getCheckedRadioButtonId() == -1) {
            incompleteQuizToastMessage();
            return false;

        } else if (easyAnswer8.getCheckedRadioButtonId() == -1) {
            incompleteQuizToastMessage();
            return false;

        } else if (easyAnswer9.getCheckedRadioButtonId() == -1) {
            incompleteQuizToastMessage();
            return false;

        } else if (easyAnswer10.getCheckedRadioButtonId() == -1) {
            incompleteQuizToastMessage();
            return false;

        } else if (!easyAnswerCheckBox4A.isChecked() && !easyAnswerCheckBox4B.isChecked() &&
                !easyAnswerCheckBox4C.isChecked() && !easyAnswerCheckBox4D.isChecked()) {
            incompleteQuizToastMessage();
            return false;

        } else if (!easyAnswerCheckBox6A.isChecked() && !easyAnswerCheckBox6B.isChecked() &&
                !easyAnswerCheckBox6C.isChecked() && !easyAnswerCheckBox6D.isChecked()) {
            incompleteQuizToastMessage();
            return false;

        }
        return true;
    }

    // If user presses submit button before answering all questions, a toast message appears. Toast uses
    // drawable as background and is centered vertically.
    private void incompleteQuizToastMessage() {

        Context context = getApplicationContext();
        CharSequence text = getText(R.string.incompleteQuizToast);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        View view = toast.getView();
        view.setBackgroundResource(R.drawable.rounded_button);
        TextView text2 = view.findViewById(android.R.id.message);
        text2.setTextColor(Color.parseColor("#ffffff"));

        toast.show();
    }

    // Toast message displaying the score.  Message will differ depending on the score.  Toast uses
    // drawable as background and is centered vertically.
    private void quizFinishedToastMessage() {

        if (score > 7) {
            CharSequence text;
            Context context = getApplicationContext();
            text = getString(R.string.finishedQuizToast, score);
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            View view = toast.getView();
            view.setBackgroundResource(R.drawable.toast_background);
            TextView text2 = view.findViewById(android.R.id.message);
            text2.setTextColor(Color.parseColor("#ffffff"));
//            text2.setTextColor(Color.parseColor(getResources().getString(R.color.white)));
            toast.show();

        } else {
//            Context context = getApplicationContext();
//            CharSequence text = getString(R.string.finishedQuizPoorToast, score);
//            int duration = Toast.LENGTH_LONG;
//            Toast toast = Toast.makeText(context, text, duration);
//            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//            View view = toast.getView();
//            view.setBackgroundResource(R.drawable.toast_background);
//            TextView text2 = findViewById(android.R.id.message);
//            text2.setTextColor(Color.parseColor("#ffffff"));
//            toast.show();
            CharSequence text;
            Context context = getApplicationContext();
            text = getString(R.string.finishedQuizPoorToast, score);
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            View view = toast.getView();
            view.setBackgroundResource(R.drawable.rounded_button);
            TextView text2 = view.findViewById(android.R.id.message);
            text2.setTextColor(Color.parseColor("#ffffff"));
//            text2.setTextColor(Color.parseColor(getResources().getString(R.color.white)));
            toast.show();
        }
    }

    // This method finds the checked radio button and compares its value to the answer.
    private void checkRadioQuestions(RadioGroup rg, String correctAnswer) {
        String userAnswer = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        if (userAnswer.equals(correctAnswer)) {
            score++;
        }
    }

    // This method clears all the checkboxes and radio buttons when "Replay" button is pressed.
    public void reset(View v) {
        easyAnswer1.clearCheck();
        easyAnswer2.clearCheck();
        easyAnswer3.clearCheck();
        easyAnswer5.clearCheck();
        easyAnswer7.clearCheck();
        easyAnswer8.clearCheck();
        easyAnswer9.clearCheck();
        easyAnswer10.clearCheck();

        easyAnswerCheckBox4A.setChecked(false);
        easyAnswerCheckBox4B.setChecked(false);
        easyAnswerCheckBox4C.setChecked(false);
        easyAnswerCheckBox4D.setChecked(false);
        easyAnswerCheckBox6A.setChecked(false);
        easyAnswerCheckBox6B.setChecked(false);
        easyAnswerCheckBox6C.setChecked(false);
        easyAnswerCheckBox6D.setChecked(false);
    }
}
