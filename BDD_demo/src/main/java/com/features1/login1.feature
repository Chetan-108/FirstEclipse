Feature: JBK offline application

@jbk
Scenario Outline: loginTest

Given User should be on login1 page

When  User enters "<userName>" and "<password>"

Then  User will be on Home page

Examples:
|userName|password|

|kiran@gmail.com|123456 |

|mangesh@gmail.com|qwerty |


@jbk1
Scenario: JBK logo test

Given User should be on login1 page

Then user should see JBK logo


