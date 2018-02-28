package com.example.android.quizappwitharrayadapter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity
{
    public static final String EXTRA_MESSAGE = "message";
    public static final String EXTRA_ARRAY = "array";
    String name;
    ScrollView scrollView;
    RadioGroup radioGroupQ1;
    RadioGroup radioGroupQ2;
    RadioGroup radioGroupQ4;
    RadioGroup radioGroupQ5;
    RadioGroup radioGroupQ6;
    RadioGroup radioGroupQ7;
    RadioGroup radioGroupQ8;
    RadioGroup radioGroupQ10;
    RadioButton radioButtonQ1Hyp1;
    RadioButton radioButtonQ1Hyp2;
    RadioButton radioButtonQ1Hyp3;
    RadioButton radioButtonQ1Hyp4;
    RadioButton radioButtonQ2Hyp1;
    RadioButton radioButtonQ2Hyp2;
    RadioButton radioButtonQ2Hyp3;
    RadioButton radioButtonQ2Hyp4;
    CheckBox checkBoxQ3Hyp1;
    CheckBox checkBoxQ3Hyp2;
    CheckBox checkBoxQ3Hyp3;
    CheckBox checkBoxQ3Hyp4;
    RadioButton radioButtonQ4Hyp1;
    RadioButton radioButtonQ4Hyp2;
    RadioButton radioButtonQ4Hyp3;
    RadioButton radioButtonQ4Hyp4;
    RadioButton radioButtonQ5Hyp1;
    RadioButton radioButtonQ5Hyp2;
    RadioButton radioButtonQ5Hyp3;
    RadioButton radioButtonQ5Hyp4;
    RadioButton radioButtonQ6Hyp1;
    RadioButton radioButtonQ6Hyp2;
    RadioButton radioButtonQ6Hyp3;
    RadioButton radioButtonQ6Hyp4;
    RadioButton radioButtonQ7Hyp1;
    RadioButton radioButtonQ7Hyp2;
    RadioButton radioButtonQ7Hyp3;
    RadioButton radioButtonQ7Hyp4;
    RadioButton radioButtonQ8Hyp1;
    RadioButton radioButtonQ8Hyp2;
    RadioButton radioButtonQ8Hyp3;
    RadioButton radioButtonQ8Hyp4;
    EditText editTextQ9;
    RadioButton radioButtonQ10Hyp1;
    RadioButton radioButtonQ10Hyp2;
    RadioButton radioButtonQ10Hyp3;
    RadioButton radioButtonQ10Hyp4;
    int correctAnswers;
    int[] arrayOfAnswers;
    String message;

    private static Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ArrayList<Quiz> quizList = new ArrayList<>();

        quizList.add(new Quiz("1", this.getString(R.string.q1_title), R.drawable.nasa, this.getString(R.string.q1_intro), this.getString(R.string.q1_question), this.getString(R.string.q1_hyp1), this.getString(R.string.q1_hyp2), this.getString(R.string.q1_hyp3), this.getString(R.string.q1_hyp4), "1", ""));
        quizList.add(new Quiz("2", this.getString(R.string.q2_title), R.drawable.cocoa, this.getString(R.string.q2_intro), this.getString(R.string.q2_question), this.getString(R.string.q2_hyp1), this.getString(R.string.q2_hyp2), this.getString(R.string.q2_hyp3), this.getString(R.string.q2_hyp4), "2", this.getString(R.string.q2_comment)));
        quizList.add(new Quiz("3", this.getString(R.string.q3_title), R.drawable.species, this.getString(R.string.q3_intro), this.getString(R.string.q3_question), this.getString(R.string.q3_hyp1), this.getString(R.string.q3_hyp2), this.getString(R.string.q3_hyp3), this.getString(R.string.q3_hyp4), "24",""));
        quizList.add(new Quiz("4", this.getString(R.string.q4_title), R.drawable.antibiotics, this.getString(R.string.q4_intro), this.getString(R.string.q4_question), this.getString(R.string.q4_hyp1), this.getString(R.string.q4_hyp2), this.getString(R.string.q4_hyp3), this.getString(R.string.q4_hyp4), "3", this.getString(R.string.q4_comment)));
        quizList.add(new Quiz("5", this.getString(R.string.q5_title), R.drawable.cities, this.getString(R.string.q5_intro), this.getString(R.string.q5_question), this.getString(R.string.q5_hyp1), this.getString(R.string.q5_hyp2), this.getString(R.string.q5_hyp3), this.getString(R.string.q5_hyp4), "3", this.getString(R.string.q5_comment)));
        quizList.add(new Quiz("6", this.getString(R.string.q6_title), R.drawable.waste, this.getString(R.string.q6_intro), this.getString(R.string.q6_question), this.getString(R.string.q6_hyp1), this.getString(R.string.q6_hyp2), this.getString(R.string.q6_hyp3), this.getString(R.string.q6_hyp4), "1", this.getString(R.string.q6_comment)));
        quizList.add(new Quiz("7", this.getString(R.string.q7_title), R.drawable.leds, this.getString(R.string.q7_intro), this.getString(R.string.q7_question), this.getString(R.string.q7_hyp1), this.getString(R.string.q7_hyp2), this.getString(R.string.q7_hyp3), this.getString(R.string.q7_hyp4), "2", ""));
        quizList.add(new Quiz("8", this.getString(R.string.q8_title), R.drawable.energywildlife, this.getString(R.string.q8_intro), this.getString(R.string.q8_question), this.getString(R.string.q8_hyp1), this.getString(R.string.q8_hyp2), this.getString(R.string.q8_hyp3), this.getString(R.string.q8_hyp4), "2", this.getString(R.string.q8_comment)));
        quizList.add(new Quiz("9", this.getString(R.string.q9_title), R.drawable.arctic, this.getString(R.string.q9_intro), this.getString(R.string.q9_question), this.getString(R.string.q9_hyp1), this.getString(R.string.q9_hyp2), this.getString(R.string.q9_hyp3), this.getString(R.string.q9_hyp4), "1", this.getString(R.string.q9_comment)));
        quizList.add(new Quiz("10", this.getString(R.string.q10_title), R.drawable.bikecommuting, this.getString(R.string.q10_intro), this.getString(R.string.q10_question), this.getString(R.string.q10_hyp1), this.getString(R.string.q10_hyp2), this.getString(R.string.q10_hyp3), this.getString(R.string.q10_hyp4), "3",""));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        QuizAdapter adapter = new QuizAdapter(this, quizList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Get the name of the user from the previous activity
        name = getIntent().getStringExtra("name");

        // Initialize views
        initializeViews();
    }

    /**
     * This method initializes all the views.
     */
    public void initializeViews()
    {
        scrollView = findViewById(R.id.scroll_view);
        radioGroupQ1 = findViewById(R.id.radio_group_q1);
        radioGroupQ2 = findViewById(R.id.radio_group_q2);
        radioGroupQ4 = findViewById(R.id.radio_group_q4);
        radioGroupQ5 = findViewById(R.id.radio_group_q5);
        radioGroupQ6 = findViewById(R.id.radio_group_q6);
        radioGroupQ7 = findViewById(R.id.radio_group_q7);
        radioGroupQ8 = findViewById(R.id.radio_group_q8);
        radioGroupQ10 = findViewById(R.id.radio_group_q10);
        radioButtonQ1Hyp1 = findViewById(R.id.radio_q1_h1);
        radioButtonQ1Hyp2 = findViewById(R.id.radio_q1_h2);
        radioButtonQ1Hyp3 = findViewById(R.id.radio_q1_h3);
        radioButtonQ1Hyp4 = findViewById(R.id.radio_q1_h4);
        radioButtonQ2Hyp1 = findViewById(R.id.radio_q2_h1);
        radioButtonQ2Hyp2 = findViewById(R.id.radio_q2_h2);
        radioButtonQ2Hyp3 = findViewById(R.id.radio_q2_h3);
        radioButtonQ2Hyp4 = findViewById(R.id.radio_q2_h4);
        checkBoxQ3Hyp1 = findViewById((R.id.check_q3_h1));
        checkBoxQ3Hyp2 = findViewById((R.id.check_q3_h2));
        checkBoxQ3Hyp3 = findViewById((R.id.check_q3_h3));
        checkBoxQ3Hyp4 = findViewById((R.id.check_q3_h4));
        radioButtonQ4Hyp1 = findViewById(R.id.radio_q4_h1);
        radioButtonQ4Hyp2 = findViewById(R.id.radio_q4_h2);
        radioButtonQ4Hyp3 = findViewById(R.id.radio_q4_h3);
        radioButtonQ4Hyp4 = findViewById(R.id.radio_q4_h4);
        radioButtonQ5Hyp1 = findViewById(R.id.radio_q5_h1);
        radioButtonQ5Hyp2 = findViewById(R.id.radio_q5_h2);
        radioButtonQ5Hyp3 = findViewById(R.id.radio_q5_h3);
        radioButtonQ5Hyp4 = findViewById(R.id.radio_q5_h4);
        radioButtonQ6Hyp1 = findViewById(R.id.radio_q6_h1);
        radioButtonQ6Hyp2 = findViewById(R.id.radio_q6_h2);
        radioButtonQ6Hyp3 = findViewById(R.id.radio_q6_h3);
        radioButtonQ6Hyp4 = findViewById(R.id.radio_q6_h4);
        radioButtonQ7Hyp1 = findViewById(R.id.radio_q7_h1);
        radioButtonQ7Hyp2 = findViewById(R.id.radio_q7_h2);
        radioButtonQ7Hyp3 = findViewById(R.id.radio_q7_h3);
        radioButtonQ7Hyp4 = findViewById(R.id.radio_q7_h4);
        radioButtonQ8Hyp1 = findViewById(R.id.radio_q8_h1);
        radioButtonQ8Hyp2 = findViewById(R.id.radio_q8_h2);
        radioButtonQ8Hyp3 = findViewById(R.id.radio_q8_h3);
        radioButtonQ8Hyp4 = findViewById(R.id.radio_q8_h4);
        editTextQ9 = findViewById(R.id.edit_q9_h);
        radioButtonQ10Hyp1 = findViewById(R.id.radio_q10_h1);
        radioButtonQ10Hyp2 = findViewById(R.id.radio_q10_h2);
        radioButtonQ10Hyp3 = findViewById(R.id.radio_q10_h3);
        radioButtonQ10Hyp4 = findViewById(R.id.radio_q10_h4);
    }

    /**
     * This method is called when the grade button is clicked.
     */
    public void gradeQuiz(View view)
    {
        findNumberOfCorrectAnswers();
        buildMessage();
        displayToast(message);
    }

    /**
     * This method calculates the number of correct answers.
     */
    public void findNumberOfCorrectAnswers()
    {
        //List<Quiz> quizList = QuizCreation.getQuizList();
        correctAnswers = 0;

        // Identify the correct answers
        if (radioButtonQ1Hyp1.isChecked()) correctAnswers++;
        if (radioButtonQ2Hyp2.isChecked()) correctAnswers++;
        if ((checkBoxQ3Hyp2.isChecked() && checkBoxQ3Hyp4.isChecked()) && (!checkBoxQ3Hyp1.isChecked() && !checkBoxQ3Hyp3.isChecked()))
            correctAnswers++;
        if (radioButtonQ4Hyp1.isChecked()) correctAnswers++;
        if (radioButtonQ5Hyp3.isChecked()) correctAnswers++;
        if (radioButtonQ6Hyp1.isChecked()) correctAnswers++;
        if (radioButtonQ7Hyp2.isChecked()) correctAnswers++;
        if (radioButtonQ8Hyp2.isChecked()) correctAnswers++;
        if (editTextQ9.getText().toString().equals("8")) correctAnswers++;
        if (radioButtonQ10Hyp3.isChecked()) correctAnswers++;
    }

    /**
     * This method builds the message that appears in the toast and in the email body.
     */
    public void buildMessage()
    {
        message = "";
        //Log.v("QuizActivity", name);
        if (name.length() > 0)
        {
            message = getResources().getString(R.string.message_line1, name);
        }
        message += getResources().getString(R.string.message_line2, correctAnswers);
        if (correctAnswers != 10)
            message += getResources().getString(R.string.message_line3, (10 - correctAnswers));
    }

    /**
     * This method resets the radio buttons, check boxes and edit texts of the quiz.
     */
    public void resetQuiz(View view)
    {
        radioGroupQ1.clearCheck();
        radioGroupQ2.clearCheck();
        radioGroupQ4.clearCheck();
        radioGroupQ5.clearCheck();
        radioGroupQ6.clearCheck();
        radioGroupQ7.clearCheck();
        radioGroupQ8.clearCheck();
        radioGroupQ10.clearCheck();
        checkBoxQ3Hyp1.setChecked(false);
        checkBoxQ3Hyp2.setChecked(false);
        checkBoxQ3Hyp3.setChecked(false);
        checkBoxQ3Hyp4.setChecked(false);
        editTextQ9.setText("");
        scrollView.fullScroll(ScrollView.FOCUS_UP);
        editTextQ9.clearFocus();
        //correctAnswers = 0;
    }

    /**
     * This method is called when the results button is clicked.
     */
    public void goToResults(View view)
    {
        createArrayOfAnswers();
        buildMessage();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_ARRAY, arrayOfAnswers);
        startActivity(intent);
    }

    /**
     * This method displays the toast.
     *
     * @param message is the message that appears in the toast
     */
    public void displayToast(String message)
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    /**
     * This method creates an array of int with the resource id's that will be used in the next activity.
     */
    public void createArrayOfAnswers()
    {
        arrayOfAnswers = new int[13];
        arrayOfAnswers[0] = radioGroupQ1.getCheckedRadioButtonId();
        arrayOfAnswers[1] = radioGroupQ2.getCheckedRadioButtonId();
        if (checkBoxQ3Hyp1.isChecked()) arrayOfAnswers[2] = R.id.check_q3_h1;
        if (checkBoxQ3Hyp2.isChecked()) arrayOfAnswers[3] = R.id.check_q3_h2;
        if (checkBoxQ3Hyp3.isChecked()) arrayOfAnswers[4] = R.id.check_q3_h3;
        if (checkBoxQ3Hyp4.isChecked()) arrayOfAnswers[5] = R.id.check_q3_h4;
        arrayOfAnswers[6] = radioGroupQ4.getCheckedRadioButtonId();
        arrayOfAnswers[7] = radioGroupQ5.getCheckedRadioButtonId();
        arrayOfAnswers[8] = radioGroupQ6.getCheckedRadioButtonId();
        arrayOfAnswers[9] = radioGroupQ7.getCheckedRadioButtonId();
        arrayOfAnswers[10] = radioGroupQ8.getCheckedRadioButtonId();
        try
        {
            arrayOfAnswers[11] = Integer.parseInt(editTextQ9.getText().toString());
        } catch (NumberFormatException e)
        {
            Log.v("QuizActivity", "NumberFormatExcption");
        }
        arrayOfAnswers[12] = radioGroupQ10.getCheckedRadioButtonId();
    }
}