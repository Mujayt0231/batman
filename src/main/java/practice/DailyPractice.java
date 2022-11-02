package practice;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class DailyPractice {
	
	final private static String baseUrl = "https://boratech.herokuapp.com";
	
	public static void main(String[] args) {

		RestAssured.baseURI = baseUrl;
		RequestSpecification request = RestAssured.given();		
		request.header("Content-Type","application/json");
				
	}

}
