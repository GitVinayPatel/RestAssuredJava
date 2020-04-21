package com.student.tests;

import org.junit.Test;


import com.student.requests.RequestFactory;
import com.student.specs.SpecificationFactory;


import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;

@Story("This is a GET ALL Employee testing story")
public class GetAllEmployees extends TestBase {
	
		RequestFactory requests = new RequestFactory();
		
		@Test
		@Story("This is a GET ALL Employee API testing story")
		@DisplayName("This a test to GET ALL Employee from the database")
		@Feature("This a test to get all emloyees from the database")
		
		public void getAllEmployes() {
			
			
			requests.getAllEmployees()
					.then()
					.spec(SpecificationFactory.getGenericResponseSpec())
					.log()
					.all()
					.statusCode(200);
				
		}

}
