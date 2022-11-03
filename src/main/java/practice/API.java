package practice;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API {

	private static String token;

	public static void main(String[] args) {

		RestAssured.baseURI = "https://boratech.herokuapp.com";
		RequestSpecification request = RestAssured.given();

		Map<String, String> mapBody = new HashMap<String, String>();
		mapBody.put("email", "Jose@gmail.com");
		mapBody.put("password", "123456");

		request.header("Content-Type", "application/json");
		request.body(mapBody);

		Response response = request.post("/api/auth");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);

		JsonPath jsonPath = response.jsonPath();
		token = jsonPath.get("token");
		System.out.println("Token:" + token);

	}
}