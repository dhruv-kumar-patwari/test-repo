package com.zemoso.interactor;

import com.zemoso.entity.BowlingType;

public class NotABowler implements BowlingType {
    @Override
    public void bowl() {
        System.out.println("I don't bowl");
    }
}
