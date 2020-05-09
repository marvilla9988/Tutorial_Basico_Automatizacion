package Paginas;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BasePage {

    static Logger log = LoggerFactory.getLogger(BasePage.class);
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);

    }

        public static void closeBrowser(){driver.close();}
    public static void navigateTo(String url){driver.get(url);}

    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

   public String FindText(String locator){
        String text = driver.findElement(By.xpath(locator)).getText();
        return text;
    }

    public void clickElement(String locator){
        Find(locator).click();
    }

    public void sendKeysTo(String locator, String KeysToSend){
        Find(locator).clear();
        Find(locator).sendKeys(KeysToSend);
    }
}
