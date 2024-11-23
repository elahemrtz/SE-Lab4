Feature: Multiplication
Scenario Outline: Multiply two numbers
    Given two numbers, <num1> and <num2>
    When they are multiplied together
    Then the result is <result>
    Examples:
        | num1 | num2 | result |
        | 0 | 0 | 0 |
        | 0 | 5 | 0 |
        | 5 | 0 | 0 |
        | 1 | 1 | 1 |
        | 1 | 5 | 5 |
        | 5 | 1 | 5 |
        | 5 | -5 | -25 |
        | -5 | -5 | 25 |
        | 6 | 4 | 24 |
        | -5 | -10 | 50 |
        | 9 | 9 | 81 |
