Feature:Payment methods on Panasonic

In order to buy product
As a Guest Customer
I want to use my various credit cards

Scenario: Buying product with Credit Card

Given I go to "QA-URL" on "Mozilla"
And I enter in "HomePage_searchField" as "DMC-G7HK"
And I click on "HomePage_searchButton"
Then "ProductPage_productID" displayed on page should be "DMC-G7HK"