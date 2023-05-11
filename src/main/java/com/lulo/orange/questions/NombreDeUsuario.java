package com.lulo.orange.questions;

import com.lulo.orange.ui.OrangeLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class NombreDeUsuario implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(OrangeLoginPage.NOMBRE_USUARIO).answeredBy(actor).toString();
    }

    public static NombreDeUsuario enPantalla(){
        return new NombreDeUsuario();
    }
}
