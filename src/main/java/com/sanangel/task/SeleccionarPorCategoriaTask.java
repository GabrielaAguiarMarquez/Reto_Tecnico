package com.sanangel.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sanangel.ui.CategoriaUI.TTL_PRODUCTO;
import static com.sanangel.ui.InicioUI.OPT_CATEGORIA;
import static com.sanangel.ui.ProductoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarPorCategoriaTask implements Task {
    private String categoria;
    private int cantidad;

    public SeleccionarPorCategoriaTask(String categoria, int cantidad) {
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public static SeleccionarPorCategoriaTask agregarEnLaCategoria(String categoria, int cantidad){
        return new SeleccionarPorCategoriaTask(categoria, cantidad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPT_CATEGORIA.of(categoria)),
                Scroll.to(TTL_PRODUCTO),
                Click.on(TTL_PRODUCTO),

                // La dulce espera (porque si que se demora :v)...
                WaitUntil.the(TXT_CANTIDAD, isVisible()).forNoMoreThan(15).seconds(),
                Scroll.to(TXT_CANTIDAD),
                //borramos el 1 que viene por default, antes solo escribia 12, si me dio problemas xd
                Clear.field(TXT_CANTIDAD),
                Enter.theValue(String.valueOf(cantidad)).into(TXT_CANTIDAD),
                Click.on(BTN_ANIADIR)
        );
    }
}
