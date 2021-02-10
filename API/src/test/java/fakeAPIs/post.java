package fakeAPIs;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class post {
	@Test
	void Test01() {

		Map <String, Object>  maps= new HashMap<String, Object>();

		maps.put("name", "Kannan");
		maps.put("job", "Farmer");
		JSONObject json= new JSONObject(maps);
		baseURI="http://localhost:3000";
		given().
		header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
		body(json.toJSONString()).
		when().post("/users").
		then().statusCode(201).log().all();

	}

}
