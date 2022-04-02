Feature: Verifing Facebook Details
Scenario: Verifining Facebook login with valid credentials
	Given User in on Facebook page
	When User should enter username and password
	And User should click login button
	Then User should verify success msg
