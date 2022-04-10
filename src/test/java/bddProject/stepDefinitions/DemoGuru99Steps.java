package bddProject.stepDefinitions;

import bddProject.pages.DemoGuru99Payment;
import bddProject.pages.DemoGuruPaymentProcess;
import bddProject.pages.DemoGuruVerification;
import bddProject.utils.BrowserUtils;
import bddProject.utils.ConfigurationsReader;
import bddProject.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class DemoGuru99Steps extends BrowserUtils {
    DemoGuru99Payment demoGuru99Payment=new DemoGuru99Payment();
    DemoGuruPaymentProcess demoGuruPaymentProcess=new DemoGuruPaymentProcess();
    @Given("The user wants to see payment gateway website")
    public void the_user_wants_to_see_payment_gateway_website() {
        Driver.getDriver();
        driver.get(ConfigurationsReader.getProperties("url"));
        BrowserUtils.setWaitTime();
        driver.manage().window().maximize();
        System.out.println("The website is launched");
    }
    @When("The user wants to  verify header as {string}")
    public void the_user_wants_to_verify_header_as(String expectedHeader) {
       demoGuru99Payment.setHeader(expectedHeader);
    }

    @When("The user wants to to verify that the toy price as {string}")
    public void the_user_wants_to_to_verify_that_the_toy_price_as(String expectedPrice) {
        demoGuru99Payment.setPrice(expectedPrice);
        System.out.println("price verification has passed");
    }
    @When("The user wants to see URL should contain as {string}")
    public void the_user_wants_to_see_url_should_contain_as(String expectedUrl) {
        demoGuru99Payment.verifyUrl(expectedUrl);
        System.out.println("url verification has passed");
    }

    @When("The user wants to buy elephant toy as")
    public void the_user_wants_to_buy_elephant_toy_as(Map<String, String> dataTable) {
    demoGuru99Payment.setToyQuantity(dataTable.get("Quantity"));
    demoGuru99Payment.setBuyNow();
    }
    @Then("The user wants to enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String,String> dataTable) {

        demoGuruPaymentProcess.setcardNumber(dataTable.get("CNumber"));
        demoGuruPaymentProcess.setMonth(dataTable.get("EMonth"));
        demoGuruPaymentProcess.setYear(dataTable.get("EYear"));
        demoGuruPaymentProcess.setCvvCode(dataTable.get("CVV"));
    }
    @Then("The user wants to pay now")
    public void the_user_wants_to_pay_now() {
demoGuruPaymentProcess.setPayButton();
    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String expected) {
        DemoGuruVerification verification=new DemoGuruVerification();
        verification.setVerificationText(expected);
    }
    @When("The user wants to buy elephant toy as {string}")
    public void the_user_wants_to_buy_elephant_toy_as(String quantity) {
        demoGuru99Payment.setToyQuantity(quantity);
        demoGuru99Payment.setBuyNow();
    }



}
