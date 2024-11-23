Feature: Add
Scenario Outline: Add two numbers
    Given two numbers for addition, <num1> and <num2>
    When they are added together
    Then the addition result is <result>
    Examples:
        | num1 | num2 | result |
        | 0 | 0 | 0 |
        | 0 | 5 | 5 |
        | 5 | 0 | 5 |
        | 1 | 1 | 2 |
        | 1 | 5 | 6 |
        | 5 | 1 | 6 |
        | 5 | -5 | 0 |
        | -5 | -5 | -10 |
        | 6 | 4 | 10 |
        | -5 | -10 | -15 |
        | 9 | 9 | 18 |
        | -10.5 | 2.25 | -8.25 |
        | -1.5 | -1.55555 | -3.05555 |
