package Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory extends BasePage {
    @FindBy(id="boton")
    WebElement boton;

    public PageFactory(WebDriver driver) {
        super(driver);
        driver.get("www.google.com");
    }

    public static void initElements(WebDriver driver, BasePage basePage) {
    }
}
