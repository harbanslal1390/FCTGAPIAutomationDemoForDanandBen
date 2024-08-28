import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class IntegrateAPIwithFCTG {
	public static Response res;
	@Test(priority = 1)
	public void verifyGetMethod()
	{
	res=given().contentType(ContentType.JSON).when().get("https://reqres.in/api/users/2");
	System.out.println(res.statusCode());
	
	}
	@Test(priority = 2 )
	public void verifyResBody()
	{
	System.out.println(res.asString());;
	
	}
	

}
