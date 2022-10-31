Feature: Login

Scenario: login with valid credentials

Given user is on login apge
Then user enter username and password
|Jose@gmail.com | 123456 |
Then user click login button
And user should navigated to dashboard page
