package com.boostcommerce.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Task {
    double timeInSecond;

    public Wait(int timeInSecond) {
        this.timeInSecond = timeInSecond;
    }

    public Wait(double timeInSecond) {
        this.timeInSecond = timeInSecond;
    }

    public static Performable aBit(int timeInSecond) {
        return Tasks.instrumented(Wait.class, timeInSecond);
    }
    public static Performable aBit(double timeInSecond) {
        return Tasks.instrumented(Wait.class, timeInSecond);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        double time = timeInSecond * 1000;
        try {
            Thread.sleep((long)time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
