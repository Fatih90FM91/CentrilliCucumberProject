Feature: Users should be able to login
  @login
  Scenario: Login as a manufuser
    Given the user is on the  webpage
    Then the user enters the manufuser information
    Then the user should be able to login as a "ManufacturingUser10"


Scenario Outline: Login as a Posmanager
  Given the user is on the  webpage
  Then the user should be able to write "<username>"
  Then the user should be able to write  the "<password>"
  And the user should be able to enter the button
  And the user should be able to verify on the page


  Examples:
    | username            | password |
    |posmanager10@info.com|posmanager|

