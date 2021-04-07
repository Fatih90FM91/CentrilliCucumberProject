Feature: Dashboard functionality

  Background: user is on the dashboard
    When the user is on the  webpage
    Then the user enters the manufuser information

  Scenario:Dashboard List
    Then user verify dashboard list :Discuss,Calendar,Notes,Contacts,Website,Manufacturing,Events,Employees,Leaves,Expenses,Maintenance,Dashboards




 Scenario: Dropdown List
   When user should be able to see dropdown list
   Then In dropdown list should be these
   |Documentation|
   |Support      |
   |Preferences  |
   |My Odoo.com account|
   |Log out            |