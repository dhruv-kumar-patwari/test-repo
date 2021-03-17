package com.zemoso.interactor;

import com.zemoso.entity.CanPlayAs;
import com.zemoso.entity.Player;

public class Cricketer extends Player{

    public Cricketer(CanPlayAs role) {
        super(role);
    }

    @Override
    public void play() {
        System.out.println("Playing Cricket!");
    }
    @Override
    public void playAs() {
        role.playAs();
    }
}
