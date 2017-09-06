package com.muj.android.oneiros.backend;

/**
 * Created by Siddharth on 30-08-2017.
 */

public class Event {
    String Name;
    String Details;
    String Rules;
    int MinParticipant;
    int MaxParticipant;
    int Fees;
    int FeesMode;
    String JudgingCriteria;
    String Duration;

    Event(String Name,String Details,String Rules,int MinParticipant,int MaxParticipant,int Fees,int FeesMode,String JudgingCriteria,String Duration){
        this.Name=Name;
        this.Details=Details;
        this.Rules=Rules;
        this.MinParticipant=MinParticipant;
        this.MaxParticipant=MaxParticipant;
        this.Fees=Fees;
        this.FeesMode=FeesMode;
        this.JudgingCriteria=JudgingCriteria;
        this.Duration=Duration;
    }
}
