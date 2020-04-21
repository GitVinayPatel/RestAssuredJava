package com.student.tests;

import org.junit.BeforeClass;

import com.student.util.PropertyReader;


import io.restassured.RestAssured;

public class TestBase {
	
	public static PropertyReader prop;
	
	@BeforeClass
	public static void initURL()
	{
		prop = PropertyReader.getInstance();
		
		
		
		RestAssured.baseURI=prop.getProperty("baseURI");
		//RestAssured.port= Integer.valueOf(prop.getProperty("port"));  
		
		System.out.println(prop.getProperty("baseURI"));
	}

}
