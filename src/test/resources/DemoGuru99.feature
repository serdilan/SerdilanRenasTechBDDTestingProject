Feature: Payment Gateway testing

  @smoke @tc1_verifyHeader
  Scenario: Verify that the user can order a product
    Given The user wants to see payment gateway website
    When The user wants to  verify header as "Mother Elephant With Babies Soft Toy"

  @smoke @tc2
  Scenario: Verify that the user can verify toy price
    Given The user wants to see payment gateway website
    When The user wants to to verify that the toy price as "$20"

  @smoke @tc3
  Scenario: Verify that the user can order a product
    Given The user wants to see payment gateway website
    When The user wants to see URL should contain as "payment-gateway"

  @regression@tc4
  Scenario: Verify that the user can order a product
    Given The user wants to see payment gateway website
    When The user wants to buy elephant toy as
    |Quantity|5|
    Then The user wants to enter payment information as
      |CNumber|1112225554445555|
      |EMonth |12              |
      |EYear  |2026            |
      |CVV    |777             |
    Then The user wants to pay now
    And The user wants to verify message as "Payment successfull!"
  @Scenario_Outline @tc5 @regression
  Scenario Outline: Verify that the user can order a products
    Given The user wants to see payment gateway website
    When The user wants to buy elephant toy as "<Quantity>"
    Then The user wants to enter payment information as
      |CNumber|1112225554445555|
      |EMonth |12              |
      |EYear  |2026            |
      |CVV    |777             |
    Then The user wants to pay now
    Then The user wants to verify message as "Payment successfull!"
    Examples:
    |Quantity|
    |5       |
    |8       |
    |2       |
    |9       |
    |4       |





