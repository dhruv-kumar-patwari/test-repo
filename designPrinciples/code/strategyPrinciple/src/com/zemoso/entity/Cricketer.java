package com.zemoso.entity;

import com.zemoso.entity.BattingType;
import com.zemoso.entity.BowlingType;
import com.zemoso.entity.KeepingType;

public class Cricketer {
    private BattingType battingStyle;
    private BowlingType bowlingStyle;
    private KeepingType keepingStyle;

    public Cricketer(BattingType battingStyle, BowlingType bowlingStyle, KeepingType keepingStyle) {
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
        this.keepingStyle = keepingStyle;
    }

    public Cricketer(){
    }

    public void bat(){
        battingStyle.bat();
    }

    public void bowl(){
        bowlingStyle.bowl();
    }

    public void keepWickets(){
        keepingStyle.keepWickets();
    }

    public void setBattingStyle(BattingType battingStyle) {
        this.battingStyle = battingStyle;
    }

    public void setBowlingStyle(BowlingType bowlingStyle) {
        this.bowlingStyle = bowlingStyle;
    }

    public void setKeepingStyle(KeepingType keepingStyle) {
        this.keepingStyle = keepingStyle;
    }
}
