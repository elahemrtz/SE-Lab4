Feature: Division
Scenario Outline: Divide two numbers
    Given two numbers for division, <num1> and <num2>
    When they are divided together
    Then the division result is <result>
    Examples:
        | num1 | num2 | result |
        | 0 | 5 | 0 |
        | 1 | 1 | 1 |
        | 1 | 5 | 0.2 |
        | 5 | 1 | 5 |
        | 5 | -5 | -1 |
        | -5 | -5 | 1 |
        | 6 | 4 | 1.5 |
        | -5 | -10 | 0.5 |
        | 9 | 9 | 1 |
        | -10.5 | 2.25 | -4.666666666666667 |
        | -1.5 | -6 | 0.25 |
