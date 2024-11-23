package calculator;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DivisionStepDefs {
    private Calculator calculator = new Calculator();

    private double num1, num2, result;

    @Given("two numbers for division, {double} and {double}")
    public void two_numbers_for_division_and(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @When("they are divided together")
    public void they_are_divided_together() {
        this.result = calculator.divide(this.num1, this.num2);
    }

    @Then("the division result is {double}")
    public void the_division_result_is(double expectedResult) {
        assertEquals(expectedResult, this.result, 0);
    }
}