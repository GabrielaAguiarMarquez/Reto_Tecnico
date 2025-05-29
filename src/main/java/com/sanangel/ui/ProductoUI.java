package com.sanangel.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductoUI {
    public static final Target TXT_CANTIDAD = Target.the("Escribir la cantidad de productos")
            .locatedBy("//input[@name='quantity']");
    public static final Target BTN_ANIADIR = Target.the("Añadir producto al carrito")
            .locatedBy("//button[@type='submit']");
}
