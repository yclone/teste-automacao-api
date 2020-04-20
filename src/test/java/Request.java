
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Request {
	
	@Test
	public void testRequest() {
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		int status = response.getStatusCode();
		assertEquals(status, 200);
	}
}
