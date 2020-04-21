package com.student.tests;

import org.junit.Test;

import com.student.requests.RequestFactory;
import com.student.specs.SpecificationFactory;

import io.qameta.allure.AllureId;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class CrudTest extends TestBase{
	
	RequestFactory requests = new RequestFactory();
	
@Test
@Feature("Some feature")
@Severity(SeverityLevel.CRITICAL)
@Story("Story")
@AllureId("AllureId123")
@Attachment("OneAttchemnt")
@Description("This is the Description")
@Epic("Epic1")
@TmsLink("WWW.google.com")
@Issue("issueid")
@Link("Patel")
@Owner("Vinay")



public void getAllStudents()
{
	 requests.getAllStudents()
	 .then()
	 .spec(SpecificationFactory.getGenericResponseSpec());
}

/*@Test
public void Test001()
{
	RestAssured.baseURI="http://localhost/student";
	RestAssured.port=8085;
	
	given()
	.when()
	.get("/list")
	.then()
	.log()
	.all();
	
}*/

}
