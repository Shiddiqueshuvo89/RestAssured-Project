package test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutAndPatch {

	@Test
	public void testPut() {
		
	Map<String, Object> map = new HashMap<String, Object>();
		
	
	JSONObject request= new JSONObject(map);
	
	request.put("Name", "Shiddique Shuvo");
	request.put("Job", "SQA Engineer");
		
	System.out.println(request.toJSONString());
	
	baseURI = "https://reqres.in/api";
	
	given().
	header("Content-Type","application/json").
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
	body(request.toJSONString()).
	when().
	put("/users/2").
	then().
	statusCode(200).
	log().all();
		
	}
	    
	
	@Test
	public void testPatch() {
		
	Map<String, Object> map = new HashMap<String, Object>();
		
	
	JSONObject request= new JSONObject(map);
	
	request.put("Name", "Shiddique Shuvo");
	request.put("Job", "SQA Engineer");
		
	System.out.println(request.toJSONString());
	
	baseURI = "https://reqres.in";
	
	given().
	header("Content-Type","application/json").
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
	body(request.toJSONString()).
	when().
	patch("/api/users/2").
	then().
	statusCode(200).
	log().all();
		
	}
	    
	
}
