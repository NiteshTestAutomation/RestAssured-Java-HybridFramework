package api.endpoints;

import java.util.*;
import static io.restassured.RestAssured.given;
import api.payload.DevicePojo;
import api.utilities.ReadConfigFile;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class deviceEndpoint {

    static ResourceBundle getUrl()
    {
    	//loaded property file
    	ResourceBundle routes = ResourceBundle.getBundle("config");
		return routes;
    	
    }
	
	//Create New Device Post Method
	public static Response createNewDevice(DevicePojo payload)
	{
		String postUrl = getUrl().getString("post_url");
				
		Response response =
				
		given()
            .accept(ContentType.JSON)
            .contentType(ContentType.JSON)
            .body(payload)
            
		.when()
		     .post(postUrl);
		     
		return response;
		
	}
}
