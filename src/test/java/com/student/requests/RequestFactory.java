package com.student.requests;

import com.employee.pojo.Employee;
import com.student.tests.TestBase;

import io.qameta.allure.Step;
import io.restassured.response.Response;

public class RequestFactory extends TestBase{
	
	RestClient restClient = new RestClient();
	
	@Step("getting All Students")
	public Response getAllStudents()
	{
		Response response = restClient.doGetRequest("/list");
		return response;
	}
	
	@Step("getting All Employees")
	public Response getAllEmployees()
	{
		Response response = restClient.doGetRequest("api/users?page=2");
		return response;
	}
	

	@Step("Creating Employees")
	public Response CreateEmployees()
	{
		Employee empBody = new Employee();
		String Job="leader";
		String Name="morpheus";
		empBody.setJob(Job);
		empBody.setName(Name);
		
		
		
		Response response = restClient.doPostRequest("api/users", empBody);
		return response;
	}
	

	

}
