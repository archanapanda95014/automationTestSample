#Author: panda_archana@yahoo.com
@email
Feature: Email features for login, read, compose and send messages

  @login
  Scenario Outline: login to the email system
    Given Access the email system given in "<email>".
    When Enter the "<login>" and "<password>" and submit.
    Then Verify login is successful.

    Examples: 
      | email                    | login                      | password  |
      | https://mail.google.com/ | archanatest95014@gmail.com | archana1! |
