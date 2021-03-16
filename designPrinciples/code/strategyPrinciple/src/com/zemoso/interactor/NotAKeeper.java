package com.zemoso.interactor;

import com.zemoso.entity.KeepingType;

public class NotAKeeper implements KeepingType {
    @Override
    public void keepWickets() {
        System.out.println("I am not a keeper");
    }
}
