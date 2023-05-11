package com.lulo.orange.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangeLoginPage {
    public static final Target TEXTO_USUARIO=Target.the("Campo para ingresar usuario").locatedBy("//input[@name='username']");
    public static final Target TEXTO_CONTRASENIA=Target.the("Campo para ingresar la contraseña").located(By.name("password"));
    public static final Target BUTTON_LOGIN=Target.the("Boton de logueo").locatedBy("//button[contains(@class,'login-button')]");
    public static final Target NOMBRE_USUARIO=Target.the("Nombre de usuario").locatedBy("//p[@class='oxd-userdropdown-name']");
}
