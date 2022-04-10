package bddProject.pages;

import bddProject.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoGuruPaymentProcess extends BrowserUtils {
    public DemoGuruPaymentProcess(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="card_nmuber")
    private WebElement cardNumber;
    @FindBy(id="month")
    private WebElement month;
    @FindBy(id="year")
    private WebElement year;
    @FindBy(id="cvv_code")
    private WebElement cvvCode;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement payButton;

    public void setcardNumber(String CardNumber){
        staticWait(1);
        cardNumber.sendKeys(CardNumber);
    }
    public void setMonth(String Month){
        staticWait(1);
        month.sendKeys(Month);
    }
    public void setYear(String Year){
        staticWait(1);
        year.sendKeys(Year);
    }
    public void setCvvCode(String CVVCODE){
        staticWait(1);
        cvvCode.sendKeys(CVVCODE);
    }

    public void setPayButton() {
        staticWait(1);
        payButton.click();
    }
}
