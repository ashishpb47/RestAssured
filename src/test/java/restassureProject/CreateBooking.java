package restassureProject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RequestSpecification requestspecification = RestAssured.given();
		requestspecification.log().all();
		
		requestspecification.baseUri("https://restful-booker.herokuapp.com/");
		requestspecification.basePath("booking");
		requestspecification.body("{\r\n"
				+ "    \"firstname\" : \"Yuvi\",\r\n"
				+ "    \"lastname\" : \"Pathankot\",\r\n"
				+ "    \"totalprice\" : 110,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Lunch\"\r\n"
				+ "}");
		
		requestspecification.contentType("application/json");
		Response response = requestspecification.post();
		
		ValidatableResponse validatableresponse = response.then().log().all();
		validatableresponse.statusCode(200);
		
		
		
		
		
	}

}
