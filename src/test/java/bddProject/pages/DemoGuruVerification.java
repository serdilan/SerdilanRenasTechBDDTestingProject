package bddProject.pages;

import bddProject.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoGuruVerification extends BrowserUtils {
    public DemoGuruVerification() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement verificationText;

    public void setVerificationText(String expected) {
        Assert.assertEquals(verificationText.getText(),expected);

    }
}
