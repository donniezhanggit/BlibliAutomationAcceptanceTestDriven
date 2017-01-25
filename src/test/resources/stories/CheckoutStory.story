Meta:

Narrative:
As a user
I want to checkout my order after shopping
So that I buy and pay for it

Scenario: checkout after shop
Given complete form to checkout
When submitting checkout form
Then continue checkout

Given choose payment method
When finish checkout submit
