Feature: Manage todo list as a todoMVC user

Background:
	Given I am on twitter login page 

Scenario: Login Process
	When I login with username "8087688615" and password "Indrasen@123"
	#Then I expect error for invalid login.
	 
#Scenario: Mark items as completed from todo list
#	When I add following items in todo list:
#	| Lunch   |
#	| Grocery |
#	| Laundry |	
#	And I mark following items as completed from todo list
#	| Lunch   |
#	| Laundry |
#	And I click on "Completed" section
#	Then I expect following items to be available in "Completed" section
#	| Lunch   |
#	| Laundry |	  
#	
#Scenario: Move items from completed to active section
#	When I add following items in todo list:
#	| Study   |
#	| Cycling |
#	| Sleep   |	
#	And I mark following items as completed from todo list
#	| Study   |
#	| Cycling |
#	And I click on "Completed" section
#	And I move following items from "Completed" to "Active" section
#	| Study   |
#	And I click on "Active" section
#	Then I expect following items to be available in "Active" section
#	| Study |
#	| Sleep |	  
#
#Scenario: Clear completed items from todo list
#	When I add following items in todo list:
#	| Movie   |
#	| Gym 	  |
#	| Lunch   |	
#	And I mark following items as completed from todo list
#	| Gym   |
#	| Lunch |
#	And I click on "Completed" section
#	And I clear completed items
#	And I click on "All" section
#	Then I expect following items to be available in "All" section
#	| Movie |	  
#
#	