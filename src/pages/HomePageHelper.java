package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Inka on 23-Dec-18.
 */
public class HomePageHelper extends PageBase{

    public HomePageHelper(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(),'Create Account')]")
    WebElement createAccountButton;

    @FindBy (className = "mat-stroked-button")
    WebElement goToEventButton;


    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver,
                loginButton,
                45);
        waitUntilElementIsLoaded(driver,
                createAccountButton,
                45);
    }

    public String getGoToEventButtonName() {

        return goToEventButton.getText();
    }

    public void pressGoToEventButton() {

        goToEventButton.click();
    }

    public void pressLoginButton() {
        waitUntilElementIsLoaded(driver,
                loginButton,
                45);

        loginButton.click();
    }
}
