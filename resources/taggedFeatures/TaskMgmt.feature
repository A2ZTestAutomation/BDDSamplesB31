
Feature: Task Management
CRUD Operations for Task

Scenario: Create a task
Given User is logged in
When User create a task

@RegressionTest
Scenario: Update a task
Given User is logged in
When User update a task

Scenario: Delete a task
Given User is logged in
When User delete a task