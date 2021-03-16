package com.zemoso.interactor;

import com.zemoso.entity.BattingType;

public class LowerOrderBatter implements BattingType {
    @Override
    public void bat() {
        System.out.println("I am a lower order batter");
    }
}
