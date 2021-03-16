package com.zemoso.interactor;

import com.zemoso.entity.BattingType;

public class TopOrderBatter implements BattingType {
    @Override
    public void bat() {
        System.out.println("I am a top order Batter");
    }
}
