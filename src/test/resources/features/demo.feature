# Home work:
#  - load allo.ua
#  - search for something (phone, etc)
#  - phone/etc name must be passed from cucumber scenario
#  - Add step: check if X goods name is in database
#  - For each goods that is NOT in DB - store its name and price
#  - For each goods which name IS in DB - check if price did not change. If price changed - update it in DB.

Feature: My demo

#  Scenario: step params
#    Given Generate account first name "Willy" last name "Wonka"
#    Given With age 1
#    Given Data table list example
#      | string_1 |
#      | string_2 |
#      | string_3 |
#      | string_4 |
#      | string_5 |
#      | string_6 |


  Scenario: My scenario 1
    Given I request 3 random people from service as "mob_1"
    Given I store "mob_1" people to DB
    Given I pick random person form DB as "random_person_1"
    Given I load google page
    When I set google page search to "random_person_1" first and last name
    Then Google has "random_person_1" first and last name in search input

  Scenario: My scenario 2
    Given Create custom person as "customer_1"
      | FirstName | Billy |
      | LastName  | Kid   |
      | Gender    | male  |
      | Title     | Mr    |
      | Nat       | US    |
    Given I load google page
    When I set google page search to "customer_1" first and last name
    Then Google has "customer_1" first and last name in search input

  Scenario: test that fails at random 1
    Given Random failure

  Scenario: test that fails at random 2
    Given Random failure

  Scenario: test that fails at random 3
    Given Random failure

  Scenario: test that fails at random 4
    Given Random failure

  Scenario: test that fails at random 5
    Given Random failure

  Scenario: test that fails at random 6
    Given Random failure

  Scenario: test that fails at random 7
    Given Random failure

  @severity=blocker
  Scenario: test that fails at random 8
    Given Random failure

  @severity=trivial
  Scenario: test that fails at random 9
    Given Random failure

  @severity=trivial
  Scenario: test that fails at random 10
    Given Random failure

  @severity=critical
  Scenario: test that fails at random 11
    Given Random failure

  @severity=critical
  Scenario: test that fails at random 12
    Given Random failure