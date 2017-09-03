Feature: Test Facebook Smoke scenario

    Scenario: Test loging with credentials 
    Given open chrome and start application
    When i enter valid user name and valid password 
    Then user should be login sucessfully 
    And Close browser  