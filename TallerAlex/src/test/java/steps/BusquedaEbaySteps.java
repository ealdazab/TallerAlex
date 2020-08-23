package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.BaseDriver;
import pages.BusquedaEbayPage;

public class BusquedaEbaySteps extends BaseDriver {

    BusquedaEbayPage busquedaEbayPage = new BusquedaEbayPage(driver);

    @Given("ingreso a la web de {string}")
    public void ingreso_a_la_web_de(String url) {
        busquedaEbayPage.go_url(url);
    }

    @When("realizo una busqueda de {string}")
    public void realizo_una_busqueda_de(String producto) throws InterruptedException {
        busquedaEbayPage.busqueda_producto(producto);
    }

    @When("elijo la talla {int}")
    public void elijo_la_talla(Integer int1) {

    }

    @When("elijo la marca {string}")
    public void elijo_la_marca(String string) {

    }

    @Then("visualizo los resultados")
    public void visualizo_los_resultados() {

    }

    @Then("obtengo el precio")
    public void obtengo_el_precio() {

    }

}
