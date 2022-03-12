package utility;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static loggerUtil.LogManager.*
;public class RequestUtility {
	
	public static Response getRequest(String endpoint) {
		logger().info("Endpoint: "+endpoint);
		Response response= RestAssured.given()
		.contentType(ContentType.JSON)
		.baseUri(TestEnv.BASEURL.label)
		.when()
		.get(endpoint);
		return response;
	}
	
	public static Response postRequest(Object pojo,String endpoint) {
		logger().info("payload: "+pojo+" endpoint: "+endpoint);
		Response response=RestAssured.given()
		.contentType(ContentType.JSON)
		.baseUri(TestEnv.BASEURL.label)
		.body(pojo)
		.when()
		.post(endpoint);
		return response;
	}
	 public static Response deleterequest(String endpoint)
	 {
		 logger().info("endpoint: "+endpoint);
		Response response= RestAssured.given()
		    .baseUri(TestEnv.BASEURL.label)
		    .when()
		    .delete(endpoint);
		 return response;
	 }
	 
	 public static Response updaterequest(Object pojo ,String endpoint)
	 {
		 
		 Response response=RestAssured.given()
					.contentType(ContentType.JSON)
					.baseUri(TestEnv.BASEURL.label)
					.body(pojo)
					.when()
					.put(endpoint);
					return response;
	  }
	 
	 
	 public static Response postRequest(String jsonFilePath,String endpoint) 
	 {
		 
	  File file =new File(jsonFilePath);
			Response response=RestAssured.given()
			.contentType(ContentType.JSON)
			.baseUri(TestEnv.BASEURL.label)
			.body(file)
			.when()
			.post(endpoint);
			return response;
	 }

}
