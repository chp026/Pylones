package Pylones.PageObject;

import Pylones.BaseClass.DriverFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends DriverFactory {

    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    WebElement signinButton;
    public void signIn(){
        signinButton.click();
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;
    public void emailMethod(String arg1, String arg2){
        email.sendKeys(arg1);
        password.sendKeys(arg2);
        password.sendKeys(Keys.ENTER);
    }
}
