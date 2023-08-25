@smokeTest
Feature: Validating login functionality across W3Schools

Scenario: Login with correct username and password

Given Navigate to W3Schools website
When I enter the username
And I enter my password
And Click on login
Then Login should be successful



