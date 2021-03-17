package com.zemoso;

import com.zemoso.entity.Player;
import com.zemoso.interactor.Batter;
import com.zemoso.interactor.Cricketer;
import com.zemoso.interactor.Footballer;
import com.zemoso.interactor.Forward;

public class Main {

    public static void main(String[] args) {
        Footballer sunilChetri = new Footballer(new Forward());
        Cricketer suryaKumar = new Cricketer(new Batter());

        sunilChetri.playAs();
        suryaKumar.playAs();

        sunilChetri.updateSalaryTo(1.2);
        suryaKumar.updateSalaryTo(0.5, 3);
    }
}
