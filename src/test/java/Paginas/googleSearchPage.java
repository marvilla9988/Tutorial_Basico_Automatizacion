package Paginas;

import org.junit.Assert;

public class googleSearchPage extends BasePage {
    private String searchBox = "//input[@name='q']";
    private String searchButton = "//div[@class='tfB0Bf']//input[@name='btnK']";

    public googleSearchPage(){
       super(driver);
    }

    public void NavigateToGoogle(){

        navigateTo("https://www.google.com");
        Assert.assertEquals("Google",driver.getTitle());
    }

    public void enterSearchCriteria(String searchText){
        sendKeysTo(searchBox, searchText);
    }

    public void clickSearchGoogle(){
        clickElement(searchButton);
    }

    public void FindTextElement(){
        FindText(searchBox);
    }



}
