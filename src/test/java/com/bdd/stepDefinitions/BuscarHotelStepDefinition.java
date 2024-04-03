package com.bdd.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

import com.bdd.pages.BuscarHotelView;

public class BuscarHotelStepDefinition {

    private BuscarHotelView buscarHotelView() {
        return new BuscarHotelView();
    }

    @Given("ingreso a la aplicacion Airbnb")
    public void ingreso_a_la_aplicacion_airbnb() throws MalformedURLException {
        BuscarHotelView.setAndroidDriver();
    }

    @When("doy clic a buscador")
    public void doy_clic_a_buscador() {
        buscarHotelView().clicBuscador();
    }

    @When("doy clic a buscar destino")
    public void doy_clic_a_buscar_destino() {
        buscarHotelView().clicbuscarDestino();
    }

    @Then("escribo el destino {string}")
    public void escribo_el_destino(String sDestino) {
        buscarHotelView().escribirDestino(sDestino);
    }

}
