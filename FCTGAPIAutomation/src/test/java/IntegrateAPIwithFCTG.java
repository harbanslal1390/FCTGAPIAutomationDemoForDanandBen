import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class IntegrateAPIwithFCTG {
	@Test
	public void verifyGetMethod()
	{
	Response res=given().contentType(ContentType.JSON).when().get("https://reqres.in/api/users?page=2");
	System.out.println(res.statusCode());
	System.out.println(res.asString());
	}

}
