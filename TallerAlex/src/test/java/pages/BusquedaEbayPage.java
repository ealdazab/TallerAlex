package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BusquedaEbayPage {
    WebDriver driver;
    public BusquedaEbayPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private By campoProducto = By.xpath("//*[@id='gh-ac']");
    private By btnBuscar = By.xpath("//input[@type='submit']");




    public void go_url(String url) {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Long.parseLong(String.valueOf(40)), TimeUnit.SECONDS);
        driver.get(url);
    }

    public void busqueda_producto(String producto) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(campoProducto));
        driver.findElement(campoProducto).sendKeys(producto);
        driver.findElement(btnBuscar).click();
        Thread.sleep(5000);




    }
}
