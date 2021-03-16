package com.zemoso.interactor;

import com.zemoso.entity.BattingType;

public class MiddleOrderBatter implements BattingType {
    @Override
    public void bat() {
        System.out.println("I am a middle order batter");
    }
}
