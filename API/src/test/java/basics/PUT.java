package basics;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PUT {
	@Test
	void Test01() {

		Map <String, Object>  maps= new HashMap<String, Object>();

		maps.put("name", "Vicky K");
		maps.put("job", "Tester");

		JSONObject json= new JSONObject(maps);

		given().
		header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
		body(json.toJSONString()).
		when().put("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();

	}
}
