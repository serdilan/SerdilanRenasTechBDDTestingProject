package bddProject.pages;

import bddProject.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoGuru99Payment extends BrowserUtils {
    public DemoGuru99Payment(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h2[.='Mother Elephant With Babies Soft Toy']")
    private WebElement header;
    @FindBy(xpath = "//h3[.='Price: $20']")
    private WebElement price;
    @FindBy(xpath = "//select[@name='quantity']")
    private WebElement toyQuantity;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNow;
    public void setHeader(String expectedHeader){
        Assert.assertEquals(header.getText(),expectedHeader);
        System.out.println("Header verification has passed");
    }
    public void setPrice(String expectedPrice){
        boolean veritfyPrice=price.getText().contains(expectedPrice);
        Assert.assertTrue(veritfyPrice);

        }
    public void verifyUrl(String expectedTitle){

        boolean verifyUrl=driver.getCurrentUrl().contains(expectedTitle);
        Assert.assertTrue(verifyUrl);
}
    public void setToyQuantity(String quantity){
        selectFromDropDown(toyQuantity,quantity);
}
    public void setBuyNow(){
        staticWait(2);
        buyNow.click();
    }
    }
