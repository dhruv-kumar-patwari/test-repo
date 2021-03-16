package com.zemoso.interactor;

import com.zemoso.entity.BowlingType;

public class FastBowler implements BowlingType {
    @Override
    public void bowl() {
        System.out.println("I am a fast bowler");
    }
}
