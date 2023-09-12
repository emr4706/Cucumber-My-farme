package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css="")
    public WebElement username;

    @FindBy(css="")
    public WebElement password;

    @FindBy(css="")
    public WebElement loginButton;


}
