Feature: Nopcommerce Registration

  @Register
  Scenario: Nopcommerce Valid Registration Test
    When User click on Register Link
    And User is one Register page and verify Register page Title
    And User enter Firstname and Lastname and Email and Password and ConfirmPassword and  click on Register button
