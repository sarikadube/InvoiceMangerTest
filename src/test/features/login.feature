Feature: As a user I should login

  Scenario: Valid login with valid data
    Given The web page url "http://3.13.126.58/AMS3.0/auth/login"
    When I enter username "admin.gic123"
    And I  enter password  "admin123"
    When I clieck login button
    Then I should login
