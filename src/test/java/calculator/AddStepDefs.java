package calculator;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddStepDefs {
    private Calculator calculator = new Calculator();

    private double num1, num2, result;

    @Given("two numbers for addition, {double} and {double}")
    public void two_numbers_for_addition_and(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @When("they are added together")
    public void they_are_added_together() {
        this.result = calculator.add(this.num1, this.num2);
    }

    @Then("the addition result is {double}")
    public void the_addition_result_is(double expectedResult) {
        assertEquals(expectedResult, this.result, 0);
    }
}