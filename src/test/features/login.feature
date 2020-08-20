
Feature: As a user I should login

  Scenario: Valid login with valid data
    Given The web page url "http://3.13.126.58/AMS3.0/auth/login"
    When I enter username "admin.gic123"
    And I  enter password  "admin123"
    When I click login button
    And  i enter url "http://3.13.126.58/AMS3.0/home"
    And user cliks on the drop down "customers"
#     And user clicks on "list customer"
    And add user for firt customer
    And user enter first name "ramesh"
    And user enter last name "jha"
    And user enter phone number"07653452551"
    And user enter email id "ramesh@123"
    And user enter password "Krishna123"
    And user confirm password"Krishna"
    And user click on Add User




