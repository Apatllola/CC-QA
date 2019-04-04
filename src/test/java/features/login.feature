Feature: login
  As a website user
  I am able to perform login activities with appropriate error messages when failed to provide valid creds.

  Scenario Outline: : Verify that website user is able to login with valid credentials
    Given I have accessed "<websiteURL>"
    When I enter valid username "<userName>", password "<password>"
    Then I will see home page displayed

    Examples:
      |websiteURL                               |userName|password|
      |http://the-internet.herokuapp.com/login  |tomsmith|SuperSecretPassword!|

  Scenario Outline: : Verify that website user is able to login with invalid credentials
    Given I have accessed "<websiteURL>"
    When I enter in valid username "<userName>", password "<password>"
    Then I will see login error message

    Examples:
      |websiteURL                               |userName|password|
      |http://the-internet.herokuapp.com/login  |wrongtomsmith|WrongSuperSecretPassword!|



