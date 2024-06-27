package api.testcases;

import org.testng.Assert;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import api.endpoints.deviceEndpoint;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DeviceTest extends BaseTest{

	@Test(priority = 1)
	public void createNewDevice()
	{
		Response response =  deviceEndpoint.createNewDevice(devicePayload);
		
		//log response
		response.then().log().all();
		
		//validation 
		Assert.assertEquals(response.getStatusCode(),200);
		Logger.info("Asserted API Response Status code 200");
		
		JsonPath JsonpathView = response.getBody().jsonPath();
		
		String id = JsonpathView.getString("id");
		String createdAt = JsonpathView.getString("createdAt");
		
		//assertion
		Assert.assertFalse(id.equals(null));
		Logger.info("Asserted Id field is not Null ");
		Logger.info("ID "+id);
		
		//assertion
		Assert.assertFalse(createdAt.equals(null));
		Logger.info("Asserting createdAt field is not Null");
		Logger.info("createdAt "+createdAt);
		
		String responseData = response.getBody().asPrettyString();
		//response
		Logger.info(responseData);
		
		Logger.info("Create New Device API Post Request executed Successfully");
		
	}
	
}
