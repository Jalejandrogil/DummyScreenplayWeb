package com.lulo.orange.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OrangeCreacionUsuario {

    public static final Target BUTTON_ADMIN=Target.the("Boton menu Admin").locatedBy("//span[.='Admin']");
    public static final Target BUTTON_ADD_USER=Target.the("Boton agregar usuario").locatedBy("//button[.=' Add ']");
    public static final Target LABEL_USER_ROLE=Target.the("Label seleccionar rol usuario").locatedBy("//label[.='User Role']//following::div[1]");
    public static final Target OPTION_USER_ROLE=Target.the("Opcion rol del usuario").locatedBy("//label[.='User Role']//following::div[1]//span[.='{0}']");
}
