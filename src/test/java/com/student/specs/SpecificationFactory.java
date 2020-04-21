package com.student.specs;

import com.student.tests.TestBase;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import java.util.concurrent.TimeUnit;

public class SpecificationFactory extends TestBase {

	
	public static  synchronized ResponseSpecification getGenericResponseSpec()
	{
		ResponseSpecBuilder responseSpec;
		ResponseSpecification responseSpecification;
		
		responseSpec = new ResponseSpecBuilder();
		responseSpec.expectStatusCode(is(both(greaterThanOrEqualTo(200)).and(lessThanOrEqualTo(500))));
		//responseSpec.expectStatusCode(201);
		//responseSpec.expectHeader("Content-Type","application/json; charset=utf-8");
		//responseSpec.expectHeader("Transfer-Encoding","chunked");
		//responseSpec.expectResponseTime(lessThan(5L), TimeUnit.SECONDS);
		
		responseSpecification = responseSpec.build();
		
		return responseSpecification;
	}
	
public static synchronized RequestSpecification logPayloadResponseInfo() {
		
		RequestSpecBuilder logBuilder;
		RequestSpecification logSpecification;
		
		logBuilder = new RequestSpecBuilder();
		
		
		if(prop.getProperty("log").equals("ENABLE")) {
			
			logBuilder.addFilter(new AllureRestAssured());
			
		}
	
		logSpecification = logBuilder.build();
		return logSpecification;
		
	}
	
}
