package com.sanangel.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FacturacionUI {
    public static final Target BTN_CARRITO = Target.the("Validar que sean 7 productos")
            .locatedBy("//header[@class='desktop-header']//ul[@class='navmenu__cartitems']//span[@class='navmenu__circle' and text()='7']");
}
