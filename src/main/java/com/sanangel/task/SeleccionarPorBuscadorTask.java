package com.sanangel.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.sanangel.ui.InicioUI.BTN_BUSCAR;
import static com.sanangel.ui.InicioUI.TXT_PRODUCTO;
import static com.sanangel.ui.ProductoUI.BTN_ANIADIR;
import static com.sanangel.ui.ProductoUI.TXT_CANTIDAD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarPorBuscadorTask implements Task {
    private String producto;
    private int cantidad;

    public SeleccionarPorBuscadorTask(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public static SeleccionarPorBuscadorTask aniadirProductoBuscado(String producto, int cantidad) {
        return new SeleccionarPorBuscadorTask(producto, cantidad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BUSCAR),
                Enter.keyValues(producto).into(TXT_PRODUCTO).thenHit(Keys.ENTER),

                // La dulce espera (porque si que se demora :v)... Esto debo acomodarlo
                // Se repite mucho, pendiente -.-
                WaitUntil.the(TXT_CANTIDAD, isVisible()).forNoMoreThan(15).seconds(),
                Scroll.to(TXT_CANTIDAD),
                //borramos el 1 que viene por default, antes solo escribia 12, si me dio problemas xd
                Clear.field(TXT_CANTIDAD),
                Enter.theValue(String.valueOf(cantidad)).into(TXT_CANTIDAD),
                Click.on(BTN_ANIADIR)
        );
    }
}
