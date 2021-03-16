package com.zemoso.interactor;

import com.zemoso.entity.KeepingType;

public class PartTimeKeeper implements KeepingType {

    @Override
    public void keepWickets() {
        System.out.println("I am a Part time keeper");
    }
}
