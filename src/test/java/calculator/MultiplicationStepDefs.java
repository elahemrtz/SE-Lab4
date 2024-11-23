package calculator;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiplicationStepDefs {
    private Calculator calculator = new Calculator();

    private double num1, num2, result;

    @Given("two numbers, {double} and {double}")
    public void two_numbers_and(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @When("they are multiplied together")
    public void they_are_multiplied_together() {
        this.result = calculator.multiply(this.num1, this.num2);
    }

    @Then("the result is {double}")
    public void the_result_is(double expectedResult) {
        assertEquals(expectedResult, this.result, 0);
    }
    // @Before
    // public void setUp() {
    // this.calculator = new Calculator();
    // }

    // @Given("^two numbers, (-?\\d+) and (-?\\d+)$")
    // public void givenTwoNumbers(double num1, double num2) {
    // this.num1 = num1;
    // this.num2 = num2;
    // }

    // @When("^they are multiplied together$")
    // public void theyAreMultipliedTogether() {
    // this.result = calculator.multiply(this.num1, this.num2);
    // }

    // @Then("^the result is (-?\\d+)$")
    // public void theResultIs(double expectedResult) {
    // assertEquals(expectedResult, this.result, 0);
    // }
}