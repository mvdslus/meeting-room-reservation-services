#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: user can find the existens of a room
	users search for room by location or a minimum capicity. The system shows them if these rooms exist.

@tag1
Scenario: User can find a room an exisiting location
Given the room with location "1.22" exists
When user serarches for room with location "1.22" 
Then room is displayed
    | name       | location | capacity | facility   |
    | " Berlin"  |  5       | 10      	|"beamer" |


