Meta:

Narrative:
As a new user
I want to register
So that I can do more things in the website

Scenario: The user now want to sign up as new user
Given open and access home page
Given register new user

Scenario: The user now want to buy a product
Given search product
When add to cart
Then cart will be added
Scenario: checkout after shop

Given complete form to checkout
When submitting checkout form
Then continue checkout

Given choose payment method
When finish checkout submit
