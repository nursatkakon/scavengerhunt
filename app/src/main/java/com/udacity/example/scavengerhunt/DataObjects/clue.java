package com.udacity.example.scavengerhunt.DataObjects;


public class clue {
    private String mClue;
    private int mId;

    public clue(String mClue, int mId){
        this.mClue=mClue;
        this.mId=mId;
    }
    public String getClue(){
        return mClue;
    }
    public int getId(){
        return mId;
    }
}
