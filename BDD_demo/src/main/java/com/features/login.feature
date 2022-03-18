Feature: JBK offline application

Scenario: loginTest

Given User should be on login page
When User enters valid credentials
Then User will be on Homepage

Scenario: JBK logo test

Given User should be on login page
Then User should see JBK logo