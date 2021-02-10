package fakeAPIs;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class get {
	
	
	@Test
	void test01() {
		
		
		baseURI="http://localhost:3000";
		given().get("posts").then().statusCode(200).log().all();
	}

}
