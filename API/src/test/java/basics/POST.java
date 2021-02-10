package basics;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;


import java.util.HashMap;
import java.util.Map;


public class POST {


	@Test
	void Test01() {

		Map <String, Object>  maps= new HashMap<String, Object>();

		maps.put("name", "Vicky K");
		maps.put("job", "Tester");

		JSONObject json= new JSONObject(maps);

		given().
		header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
		body(json.toJSONString()).
		when().post("https://reqres.in/api/users").
		then().statusCode(201).log().all();;

	}
}
