package com.zemoso.interactor;

import com.zemoso.entity.CanPlayAs;

public class Batter implements CanPlayAs {

    @Override
    public void playAs() {
        System.out.println("I am a batsman");
    }
}
