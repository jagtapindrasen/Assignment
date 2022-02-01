Feature: Manage todo list as a todoMVC user

Background:
	Given I am on twitter login page 
	When I login with username "8087688615" and password "Indrasen@1204"
	Then I expect user to be navigated to home page

#Scenario: Login Process
#	When Navigate profile page of logged user and upload a profile picture
	
#Scenario: Update BIO field
#	When user Update BIO field in profile section as "Selenium Automation user1"	
#	
#Scenario: Update Location field
#	When user Update Location field in profile section as "Mumbai1"		

#Scenario: Update website field
#	When user Update website filed in profile section as "twitter.com1"	
	
#Scenario: Fetch BIO field ,location and website details
#	When user Fetch BIO "Selenium Automation user1" and location "Mumbai1" and website "https://twitter.com1" and check if the submit values got updated

Scenario:  Retrieve the tweets
	When user open the twitter page of "The Times of India"