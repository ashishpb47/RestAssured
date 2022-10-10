package restassureProject;

import io.restassured.RestAssured;

public class Bdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking")
				.body("{\r\n"
					+ "    \"firstname\" : \"Bharat\",\r\n"
					+ "    \"lastname\" : \"HSP\",\r\n"
					+ "    \"totalprice\" : 110,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Lunch\"\r\n"
					+ "}")
				.contentType("application/json")
			.when()
				.post()
			.then()
			.statusCode(200);
		
			
			
	}

}
