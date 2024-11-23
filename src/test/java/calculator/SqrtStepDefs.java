package calculator;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SqrtStepDefs {
    private Calculator calculator = new Calculator();

    private double num, result;

    @Given("a number for sqrt, {double}")
    public void a_number_for_sqrt(double num) {
        this.num = num;
    }

    @When("it is sqrt")
    public void it_is_sqrt() {
        this.result = calculator.sqrt(this.num);
    }

    @Then("the sqrt result is {double}")
    public void the_sqrt_result_is(double expectedResult) {
        assertEquals(expectedResult, this.result, 0.00000001);
    }
}