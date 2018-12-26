package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageHelper extends PageBase {
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(),'Create Account')]")
    WebElement createAccountButton;


    public LoginPageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver,
                loginButton,
                45);
        waitUntilElementIsLoaded(driver,
                createAccountButton,
                45);
    }

    public void enterValueToFieldEmail(String email) {
        WebElement email_field = driver.findElement(By
                .xpath("//input[@formcontrolname='email']"));
        email_field.click();
        email_field.sendKeys(email);
    }

    public void enterValueToFieldPassword(String pass) {
        WebElement password_field = driver.findElement(By
                .xpath("//input[@formcontrolname='password']"));
        password_field.click();
        password_field.sendKeys(pass);

    }

    public void pressLogInButton() {
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Log in')]"),
                20);
        WebElement login_button = driver.findElement(By
                .xpath("//span[contains(text(),'Log in')]"));
        login_button.click();
    }

    public String getAlertText() {
        waitUntilElementIsLoaded(driver,
                By.xpath("//div[@class='alert alert-danger ng-star-inserted']"),
                20);
        WebElement alertText = driver.findElement(By.xpath("//div[@class='alert alert-danger ng-star-inserted']"));
        return alertText.getText();
    }
}
