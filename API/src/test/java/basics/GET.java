package basics;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GET {

	@Test
	public void Test_01() {
		
		given().
		    get("https://reqres.in/api/users?page=2").
		then().
		    statusCode(200).body("data.id[2]", equalTo(9)).
		    body("data.first_name", hasItem("George")).
		log().all();
	}
	
}
