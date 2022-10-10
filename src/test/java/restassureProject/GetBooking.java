package restassureProject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RequestSpecification requestSpecification = RestAssured.given().log().all();
		requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
		requestSpecification.basePath("booking/{id}");
		requestSpecification.pathParam("id", 10);
		Response response = requestSpecification.get();
		ValidatableResponse validatableResponse = response.then().log().all();
		validatableResponse.statusCode(200);
		
		
	}

}
