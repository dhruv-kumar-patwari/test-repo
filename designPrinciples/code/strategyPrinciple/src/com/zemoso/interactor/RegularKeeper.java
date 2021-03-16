package com.zemoso.interactor;

import com.zemoso.entity.KeepingType;

public class RegularKeeper implements KeepingType {
    @Override
    public void keepWickets() {
        System.out.println("I keep regularly");
    }
}
