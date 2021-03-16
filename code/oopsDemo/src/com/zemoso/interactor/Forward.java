package com.zemoso.interactor;

import com.zemoso.entity.CanPlayAs;

public class Forward implements CanPlayAs {

    @Override
    public void playAs() {
        System.out.println("I play as a Forward");
    }
}
