Feature: Multiplication
Scenario Outline: Multiply two numbers
    Given two numbers for multiplication, <num1> and <num2>
    When they are multiplied together
    Then the multiplication result is <result>
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
        | -10.5 | 2.25 | -23.625 |
        | -1.5 | -1.55555 | 2.333325 |
