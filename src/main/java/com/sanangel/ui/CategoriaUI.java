package com.sanangel.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CategoriaUI {
    public static final Target TTL_PRODUCTO = Target.the("Seleccionar el producto dentro de la categoria")
            .locatedBy("//h2[@class='woocommerce-loop-product__title' and contains(text(), 'Vendimia 50')]");
}
