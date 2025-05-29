package com.sanangel.ui;

import net.serenitybdd.screenplay.targets.Target;

public class InicioUI {
    public static final Target OPT_CATEGORIA = Target.the("Seleccionar una categoria")
            .locatedBy("//header[@class='desktop-header']//li/a[contains(text(), '{0}')]");

    public static final Target BTN_BUSCAR = Target.the("Boton para abrir el buscador")
            .locatedBy("//header[@class='desktop-header']//div[@class='header_search']");
}
