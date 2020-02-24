Feature: Create Annual cover
	The user should be able to complete the annual cover purchase process
	
Scenario: purchase annual cover, positive scenario

	Given User navigates to test website
	And User click on Annual Cover button
	And User set needed cover as Europe
	When User add partner to his cover

	Then Button next is enabled
	Given User click on 'Next' button
	Given User set First Name and Last name as "Kamil Lisowicz"
	And User set "40" age
	When The user declares that he has no major health problems in the last 12 months

	Then Button next is enabled
	Given User click on 'Next' button

	Given User set partner first name and last name as "Mateusz Kuron"
	And User set "34" partner age
	And The user declares that partner has no major health problems in the last 12 months

	Then Button next is enabled
	Given User click on 'Next' button

	Given User click on Let's do this button

	Given User indicates that he wants to cover one gadget
	Then Button next is enabled
	Given User click on 'Next' button

	Given User indicates that his baggage is worth about 500
	Then Button next is enabled
	Given User click on 'Next' button

	Given User indicates that he need cencelation worth about 500
	Then Button next is enabled
	Given User click on 'Next' button

	Given User want a £100 excess
	Then Button next is enabled
	Given User click on 'Next' button

	Then Button next is enabled
	Given User click on 'Next' button

	Given User add winter cover

	Then Button next is enabled
	Given User click on 'Next' button

	Given User click on 'View more details' button

	Then Button next is enabled
	Given User click on 'Next' button

	Given User click on confirm details button

	Given User accept privacy policy
	And User accept terms policy

	Then Button next is enabled
	Given User click on 'Next' button
	
	Given User set email "kamillisowicz@gmail.com" wher policy will be send
	And User set partner email "koler109@gmail.com"
	Then Button 'Process to payment' should be enabled

	Given User click on button 'Process to payment'
	And User click on Card Payment

	Given User close popup window
	And User set Card number as "4242424242424242"
	And User set expiration date as "2222"
	And User set CVC as "222"
	When User set postcode as "22222"

	Then Button next is enabled
	Given User click on 'Next' button

	Then User see text: 'Time to download...'
	And User close browser
