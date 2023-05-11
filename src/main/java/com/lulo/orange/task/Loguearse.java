package com.lulo.orange.task;

import com.lulo.orange.ui.OrangeLoginPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
@AllArgsConstructor
public class Loguearse implements Task {

    private String usuario;
    private String password;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(OrangeLoginPage.TEXTO_USUARIO));
        actor.attemptsTo(Enter.theValue(password).into(OrangeLoginPage.TEXTO_CONTRASENIA));
        actor.attemptsTo(Click.on(OrangeLoginPage.BUTTON_LOGIN));
    }

    public static Loguearse enOrange(String usuario, String password){
        return Tasks.instrumented(Loguearse.class, usuario, password);
    }
}
