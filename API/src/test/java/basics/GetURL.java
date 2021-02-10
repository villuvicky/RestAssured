package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class GetURL {
	
	@Test
	void GetURLFunactionWithoutBDD() {
		
		Response response=get("https://reqres.in/api/users?page=2");
		
		String body=response.getBody().asString();
		System.out.println(body);
		
		String header=response.getHeader("content-type");
		System.out.println(header);
		
		int status_code= response.getStatusCode();
		System.out.println(status_code);
		
		Assert.assertEquals(status_code, 200);
	}
	
	@Test()
	void GetURLwithBDD() {
		given()
		   .get("https://reqres.in/api/users?page=2").
		then()
		   .statusCode(200).
		   body("data.id[0]", equalTo(7));
		
		
	}

}
