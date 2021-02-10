package basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class OrangeHRM {

	
	@Test
	void ValidCreds() {
		
		given().auth().basic("eve.holt@reqres.in", "cityslicka")
		   .get("https://reqres.in/api/login").then().statusCode(200);
		
		
	}
	
	
	@Test
	void InvalidCreds() {
		
		given().auth().basic("peter@klaven","")
		   .post("https://reqres.in/api/login").then().statusCode(400);
		
		
	}
}
