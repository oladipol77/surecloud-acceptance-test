@QATask
Feature: Log In


  Scenario Outline: Login to SureCloud using valid Credentials
    Given user is on the SureCloud login page
    When user enter "<Email>" "<Password>"
    And user clicks on LOG IN button
    Then SureCloud home page should be displayed


    Examples:
      | Email                        | Password           |
      | test-candidate@surecloud.com | supersecretpassword |



    Scenario Outline:
      Given user is on the SureCloud login page
      When user enter "<Email>" "<Password>"
      And user clicks on LOG IN button
      Then error message invalid username or password should be displayed

      Examples:
      |Email|Password|
      |test-candidate+1@surecloud.com|supersecretpassword1|