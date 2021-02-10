package basics;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class DELETE {

	@Test
	void test01() {
		given().
		header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
		when().delete("https://reqres.in/api/users/2").
		then().statusCode(204).log().all();	
		
	}
}
