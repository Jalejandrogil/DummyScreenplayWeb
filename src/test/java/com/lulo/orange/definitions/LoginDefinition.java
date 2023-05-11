package com.lulo.orange.definitions;

import com.lulo.orange.questions.NombreDeUsuario;
import com.lulo.orange.task.Loguearse;
import com.lulo.orange.utils.MyDriver;
import io.cucumber.java.After;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class LoginDefinition {

    @Dado("{string} quiere loguearse en la pagina de Orange")
    public void jorgeQuiereLoguearseEnLaPaginaDeOrange(String name) {
        OnStage.setTheStage(OnlineCast.ofStandardActors());
        OnStage.theActorCalled(name);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriver.web().enLaPagina("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")));
    }
    @Cuando("el se loguea")
    public void elSeLoguea() {
        OnStage.theActorInTheSpotlight().attemptsTo(Loguearse.enOrange());
    }
    @Entonces("el podra ver el nombre {string}")
    public void elPodraVerElNombreAdmin(String nombre) {
        OnStage.theActorInTheSpotlight().should(seeThat(NombreDeUsuario.enPantalla(), is(nombre)));
    }
    @After
    public void after(){
        //OnStage.theActorInTheSpotlight().
    }
}
