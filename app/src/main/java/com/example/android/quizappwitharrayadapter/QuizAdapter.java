package com.example.android.quizappwitharrayadapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class QuizAdapter extends ArrayAdapter<Quiz>
{
    public QuizAdapter(Activity context, ArrayList<Quiz> quizList)
    {
        super(context, 0, quizList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Quiz currentQuiz = getItem(position);

        TextView questionNumber = (TextView) listItemView.findViewById(R.id.question_number);
        questionNumber.setText(currentQuiz.getQuestionNumber());
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentQuiz.getTitle());
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentQuiz.getImage());
        TextView intro = (TextView) listItemView.findViewById(R.id.intro);
        intro.setText(currentQuiz.getIntro());
        TextView question = (TextView) listItemView.findViewById(R.id.question);
        question.setText(currentQuiz.getQuestion());
        RadioButton hypothesis1 = listItemView.findViewById(R.id.hypothesis1);
        RadioButton hypothesis2 = listItemView.findViewById(R.id.hypothesis2);
        RadioButton hypothesis3 = listItemView.findViewById(R.id.hypothesis3);
        RadioButton hypothesis4 = listItemView.findViewById(R.id.hypothesis4);
        return listItemView;
    }
}