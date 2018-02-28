package com.example.android.quizappwitharrayadapter;

public class Quiz
{
    private String mQuestionNumber;
    private String mTitle;
    private int mImage;
    private String mIntro;
    private String mQuestion;
    private String mHypothesis1;
    private String mHypothesis2;
    private String mHypothesis3;
    private String mHypothesis4;
    private String mAnswer;
    private String mComment;

    Quiz(String questionNumber, String title, int image, String intro, String question, String hypothesis1, String hypothesis2,
         String hypothesis3, String hypothesis4, String answer, String comment)
    {
        this.mQuestionNumber = questionNumber;
        this.mTitle = title;
        this.mImage = image;
        this.mIntro = intro;
        this.mQuestion = question;
        this.mHypothesis1 = hypothesis1;
        this.mHypothesis2 = hypothesis2;
        this.mHypothesis3 = hypothesis3;
        this.mHypothesis4 = hypothesis4;
        this.mAnswer = answer;
        this.mComment = comment;
    }

    public String getQuestionNumber() { return mQuestionNumber; }

    public String getTitle() { return mTitle; }

    public int getImage()
    {
        return mImage;
    }

    public String getIntro() { return mIntro; }

    public String getQuestion() { return mQuestion; }

    public String getHypothesis1()
    {
        return mHypothesis1;
    }

    public String getHypothesis2()
    {
        return mHypothesis2;
    }

    public String getHypothesis3()
    {
        return mHypothesis3;
    }

    public String getHypothesis4()
    {
        return mHypothesis4;
    }

    public String getAnswer()
    {
        return mAnswer;
    }

    public String getComment()
    {
        return mComment;
    }
}