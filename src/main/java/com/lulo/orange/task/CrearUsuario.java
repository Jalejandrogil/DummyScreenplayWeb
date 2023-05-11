package com.lulo.orange.task;

import com.lulo.orange.ui.OrangeCreacionUsuario;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class CrearUsuario implements Task {
    @Step("{0} Crea usuario en Orange")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OrangeCreacionUsuario.BUTTON_ADMIN));
        actor.attemptsTo(Click.on(OrangeCreacionUsuario.BUTTON_ADD_USER));
        actor.attemptsTo(Click.on(OrangeCreacionUsuario.LABEL_USER_ROLE));
        actor.attemptsTo(Click.on(OrangeCreacionUsuario.OPTION_USER_ROLE.of("Admin")));
    }
    public static CrearUsuario enOrange(){
        return Tasks.instrumented(CrearUsuario.class);
    }
}
