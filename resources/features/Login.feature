Feature: User Login

#Scenario: Valid Login
#Given User is on Login Page
#When User enter credentials
#Then Should display Home Page

#Scenario: Valid Login
#Given User is on Login Page
#When User enter "tomsmith" and "SuperSecretPassword!"
#Then Should display Home Page  


#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enter "<username>" and "<password>"
#Then Should display Home Page  

#Examples:
#| username | password |
#	| tomsmith | SuperSecretPassword! |
#  | testuser1 | welcome123 |
#	| testuser2 | welcome123 |
	
		

Scenario: Valid Login
Given User is on Login Page
When User enter credentials
	| username | password |
	| tomsmith | SuperSecretPassword! | 
	
Then Should display Home Page  
	 | You logged into a secure area! |
