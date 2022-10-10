Feature: Sign in 

Scenario: Sign in with valid credentials

Given user is on home page
When user click sign in button in dashboard
Then user navigated to sign in page
And user enter 'Mujaytbudu@gmail.com' as email and 'Mm0231321..' as password
Then user click sign in button
Then user should be able to sign in