Feature: regression_ABitAboutYou
	Multiple regresion scenarios for page "A bit about you"

	Background:
	Given User navigates to test website
	And User click on Annual Cover button
	And User set needed cover as Europe
	When User add partner to his cover
	Then Button next is enabled
	Given User click on 'Next' button

	Scenario Outline: medical condition, positive

		Given User set First Name and Last name as "<Username>"
		And User set "<Age>" age
		When The user declares that he has no major health problems in the last 12 months

		Then Button next is enabled
		And TextBox about error in Age field not displayed
		And TextBox about error in Name field not displayed
		Then User close browser

		Examples:
			| Username 		| Age |
			| Adam Raz    	| 18    |
			| Adam Dwa		| 30    |
			| Adam Trzy		| 46    |

	Scenario Outline: medical condition, negative name

		Given User set First Name and Last name as "<Username>"
		And User set "<Age>" age
		When The user declares that he has no major health problems in the last 12 months

		Then Button next is disabled
		And TextBox about error in Name field displayed
		Then User close browser

		Examples:
			| Username 			| Age |
			| Adam @#%$^$   	| 30  |
			| @#$$$^			| 30  |
			| a a a a a			| 30  |

	Scenario Outline: medical condition, negative age

		Given User set "<Age>" age
		And User set First Name and Last name as "<Username>"
		When The user declares that he has no major health problems in the last 12 months

		Then Button next is disabled
		And TextBox about error in Age field displayed
		Then User close browser

		Examples:
			| Username 		| Age |
			| Adam Jeden    | 12  |
			| Adam Dwa		| 48  |
			| Adam Trzy		| 8   |

	Scenario: medical condition, user sick
		Given User set First Name and Last name as "Kamil Lisowicz"
		And User set "18" age
		When The user declares that he has health problems

		Then Button next is enabled
		And TextBox about error in Age field not displayed
		And TextBox about error in Name field not displayed

		When User click on 'Next' button
		Then User see text: 'We are sorry...'


