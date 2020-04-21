package com.student.requests;

import com.student.tests.TestBase;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class RestClient extends TestBase {
	
	
	public Response doGetRequest(String requestPath)
	{
		System.out.println(requestPath);
		return given()
		.contentType(ContentType.JSON)
		.when()
		.get(requestPath);
		
	}

	
	public Response doPostRequest(String uri,Object body)
	{
		return given()
		.contentType(ContentType.JSON)
		.when()
		.body(body)
		.post(uri);
	}
	
}
