package com.sanangel.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.sanangel.ui.FacturacionUI.BTN_CARRITO;

public class CantidadEnCarrito implements Question {
    private Integer cantidad;

    public CantidadEnCarrito(int cantidad) {
        this.cantidad = cantidad;
    }

    public static CantidadEnCarrito esIgualA(int cantidad) {
        return new CantidadEnCarrito(cantidad);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String productosCantidad = actor.asksFor(Text.of(BTN_CARRITO)).trim();
        int cantidadActual = Integer.parseInt(productosCantidad);
        return cantidadActual == this.cantidad;
    }
}
