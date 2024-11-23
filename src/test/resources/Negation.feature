Feature: Negation
Scenario Outline: Negate a number
    Given a number, <num>
    When it is negated
    Then the negation result is <result>
    Examples:
        | num | result |
        | 1 | -1 |
        | -1.123456789012345678 | 1.123456789012345678 |
        | 0 | 0 |
        | -10 | 10 |
