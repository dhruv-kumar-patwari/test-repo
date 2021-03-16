package com.zemoso;

import com.zemoso.entity.Cricketer;
import com.zemoso.interactor.*;

public class Main {

    public static void main(String[] args) {
		callingGill();
		callingJadeja();
	}

	private static void callingGill() {
		Cricketer shubmanGill = new Cricketer();
		shubmanGill.setBattingStyle(new TopOrderBatter());
		shubmanGill.setBowlingStyle(new NotABowler());
		shubmanGill.setKeepingStyle(new NotAKeeper());
		shubmanGill.bat();
		shubmanGill.bowl();
		shubmanGill.keepWickets();
	}

	private static void callingJadeja() {
		Cricketer ravindraJadeja = new Cricketer(new LowerOrderBatter(), new SpinBowler(), new NotAKeeper());
		ravindraJadeja.bat();
		ravindraJadeja.bowl();
		ravindraJadeja.keepWickets();
		ravindraJadeja.setBattingStyle(new MiddleOrderBatter());
		ravindraJadeja.bat();
	}
}
