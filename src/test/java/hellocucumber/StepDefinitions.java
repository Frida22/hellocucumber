package hellocucumber;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;


public class StepDefinitions {
    RequestSpecification requestSpecification;
    ValidatableResponse response;


    @Given("google link")
    public void google_link() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://www.google.com/")
                .build(); {
        }

    }

    @When("request link")
    public void request_link() {
        response = given(requestSpecification)
                .when()
                .get()
                .then()
                .statusCode(200);

    }

    @Then("does it work")
    public void does_it_work() {
        Assert.assertEquals(200,200);

    }
}
