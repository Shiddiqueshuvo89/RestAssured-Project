package test;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteAPI {

	@Test
	public void testDelete() {
		
	baseURI = "https://reqres.in/api";
	
	when().
	delete("/api/users/2").
	then().
	statusCode(204).
	log().all();
		
	}
	    
	
	
	
	
}
