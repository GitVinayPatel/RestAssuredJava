package com.student.tests;

import static org.hamcrest.Matchers.hasItem;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import com.student.requests.RequestFactory;
import com.student.specs.SpecificationFactory;


import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import static org.hamcrest.Matchers.*;


@Story("This is a Create Employee testing story")
public class CreateEmployee extends TestBase {
	
	
		RequestFactory request = new RequestFactory();
		
		@Test
		@Story("This is a Create Employee API testing story")
		@DisplayName("This a test to Create Employee from the database")
		@Feature("This a test to Create emloyees from the database")
	
		public void createEmployees()
		{
			request.CreateEmployees()
			.then()
			.body("job", equalTo("leader"))
			.spec(SpecificationFactory.getGenericResponseSpec())
			.log()
			.all();
			
		}
	
		@Test
		@Story("This is a Create Employee API testing story")
		@DisplayName("This a test to Create Employee from the database")
		@Feature("This a test to Create emloyees from the database")
		
		public void createEmployees1()
		{
			request.CreateEmployees()
			.then()
			.body("name", equalTo("morpheus"))
			.spec(SpecificationFactory.getGenericResponseSpec());
		
		}
	
	
	

}
