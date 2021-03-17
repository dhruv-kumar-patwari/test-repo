package com.zemoso.interactor;

import com.zemoso.entity.CanPlayAs;
import com.zemoso.entity.Player;

public class Footballer extends Player{

    public Footballer(CanPlayAs role) {
        super(role);
    }

    @Override
    public void play() {
        System.out.println("Playing Football!");
    }
    @Override
    public void playAs() {
        role.playAs();
    }

    public void scorePenalty(){
        System.out.println("I can score penalty kicks");
    }
}
