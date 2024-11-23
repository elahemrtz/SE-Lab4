Feature: Sqrt
Scenario Outline: Sqrt a number
    Given a number for sqrt, <num>
    When it is sqrt
    Then the sqrt result is <result>
    Examples:
        | num | result |
        | 0.0 | 0.0 |
        | 1.0 | 1.0 |
        | 4.0 | 2.0 |
        | 64.0 | 8.0 |
        | 2.25 | 1.5 |
