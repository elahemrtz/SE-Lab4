Feature: Minus
Scenario Outline: Minus two numbers
    Given two numbers for minus, <num1> and <num2>
    When they are minusd together
    Then the minus result is <result>
    Examples:
        | num1 | num2 | result |
        | 0 | 0 | 0 |
        | 0 | 5 | -5 |
        | 5 | 0 | 5 |
        | 1 | 1 | 0 |
        | 1 | 5 | -4 |
        | 5 | 1 | 4 |
        | 5 | -5 | 10 |
        | -5 | -5 | 0 |
        | 6 | 4 | 2 |
        | -5 | -10 | 5 |
        | 9 | 9 | 0 |
        | -10.5 | 2.25 | -12.75 |
        | -1.5 | -1.25 | -0.25 |
