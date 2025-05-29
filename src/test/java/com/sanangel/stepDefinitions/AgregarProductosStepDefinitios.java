package com.sanangel.stepDefinitions;

import com.sanangel.task.SeleccionarPorBuscadorTask;
import com.sanangel.task.SeleccionarPorCategoriaTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarProductosStepDefinitios {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("que me encuentro en la página de {string}")
    public void queMeEncuentroEnLaPáginaDeSanangel(String url) {
        theActorCalled("Robot").wasAbleTo(Open.url(url));
    }
    @Cuando("agrego al carrito el primer producto con una cantidad de {int}")
    public void agregoAlCarritoElPrimerProductoConUnaCantidadDe(Integer cantidad) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarPorCategoriaTask.agregarEnLaCategoria("Rosas", cantidad)
        );
    }
    @Cuando("agrego al carrito el segundo producto con una cantidad de {int}")
    public void agregoAlCarritoElSegundoProductoConUnaCantidadDe(Integer cantidad) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarPorBuscadorTask.aniadirProductoBuscado("Atessa", cantidad)
        );
    }
    @Entonces("debería ver que el carrito contiene {int} productos")
    public void deberíaVerQueElCarritoContieneProductos(Integer siete) {

    }
}
