Feature: My feature Use And But
  Blabla...

  Scenario: Scenario 1 Use And But
    Given blabla...
    # Noncompliant [[sc=5;ec=10]] {{Replace this redundant Given prefix with And or But.}}
    Given blabla...
    When blabla...
    Then blabla...

  Scenario Outline: Scenario 2 Use And But
    Given blabla...
    # Noncompliant [[sc=5;ec=10]] {{Replace this redundant Given prefix with And or But.}}
    Given blabla...
    When blabla...
    Then blabla...<number>
    Examples:
      | number |
      | 1      |
      | 2      |

  Scenario: Scenario 3 Use And But
    Given blabla...
    And blabla...
    When blabla...
    # Noncompliant [[sc=5;ec=9]] {{Replace this redundant When prefix with And or But.}}
    When blabla...
    Then blabla...

  Scenario: Scenario 4 Use And But
    Given blabla...
    When blabla...
    Then blabla...

  Scenario: Scenario 5 Use And But
    And blabla...
    Given blabla...
    When blabla...
    Then blabla...
