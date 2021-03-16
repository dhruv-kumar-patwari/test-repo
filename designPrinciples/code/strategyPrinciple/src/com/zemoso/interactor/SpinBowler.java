package com.zemoso.interactor;

import com.zemoso.entity.BowlingType;

public class SpinBowler implements BowlingType {
    @Override
    public void bowl() {
        System.out.println("I am a spin bowler");
    }
}
