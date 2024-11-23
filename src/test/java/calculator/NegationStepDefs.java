package calculator;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegationStepDefs {
    private Calculator calculator = new Calculator();

    private double num, result;

    @Given("a number for negation, {double}")
    public void a_number_for_negation(double num) {
        this.num = num;
    }

    @When("it is negated")
    public void it_is_negated() {
        this.result = calculator.negate(this.num);
    }

    @Then("the negation result is {double}")
    public void the_negation_result_is(double expectedResult) {
        assertEquals(expectedResult, this.result, 0.00000001);
    }
}