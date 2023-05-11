package com.lulo.orange.task;

import com.lulo.orange.ui.OrangeLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Loguearse implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Admin").into(OrangeLoginPage.TEXTO_USUARIO));
        actor.attemptsTo(Enter.theValue("admin123").into(OrangeLoginPage.TEXTO_CONTRASENIA));
        actor.attemptsTo(Click.on(OrangeLoginPage.BUTTON_LOGIN));
    }

    public static Loguearse enOrange(){
        return Tasks.instrumented(Loguearse.class);
    }
}
