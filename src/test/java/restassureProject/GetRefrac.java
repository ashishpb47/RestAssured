package restassureProject;

import io.restassured.RestAssured;

public class GetRefrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured
			.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/{id}")
			.pathParam("id", 9)
		.when()
			.get()
		.then()
			.log()
			.all()
			.statusCode(200);
		
	}

}
