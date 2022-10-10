Feature: checkout 


Background: user is logged in 

	Given user is on home page 
	When user click sign in button in dashboard 
	Then user navigated to sign in page 
	And user enter 'Mujaytbudu@gmail.com' as email and 'Mm0231321..' as password 
	Then user click sign in button 
	Then user should be able to sign in 
	
	
Scenario: user should be able to check out their items 

When user click T-SHIRTS in my account page
Then user should navigated to T-SHIRTS page
And user click Faded Short Sleeve T-Shirts
Then user proceed to checkout

