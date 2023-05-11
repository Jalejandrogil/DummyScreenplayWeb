package com.lulo.orange.definitions;

import com.lulo.orange.task.CrearUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class CreacionUsuarioDefinition {
    @Cuando("crea el usuario")
    public void creaElUsuario() {
        OnStage.theActorInTheSpotlight().attemptsTo(CrearUsuario.enOrange());
        // Write code here that turns the phrase above into concrete actions
    }
    @Entonces("al momento de logearse el podra ver su nombre en pantalla")
    public void alMomentoDeLogearseElPodraVerSuNombreEnPantalla() {
        // Write code here that turns the phrase above into concrete actions
    }
}
