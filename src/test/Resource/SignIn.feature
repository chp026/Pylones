Feature:
@smoke
  Scenario:
    Given user is on the homepage of PYLONES
    When user clicks on Signin button
    Then user should be able to see Signin Page

@regression
  Scenario Outline: Tesing valid and invalid cases
    Given user is on the homepage of PYLONES
    When user clicks on Signin button
    And user types "<emails>" and "<password>"
    Then should be able to login into account
    Examples:
      | emails | password |
      |chp026@hotmail.com | Password123|

