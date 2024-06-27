package api.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.deviceEndpoint;
import api.payload.DeviceDataPojo;
import api.payload.DevicePojo;
import io.restassured.response.Response;

public class DeviceDDTest {
	

	DevicePojo devicePayload ;
	DeviceDataPojo deviceData ;
	
	@Test(priority = 1 , dataProvider = "allData", dataProviderClass = DataProvider.class)
	public void getExcelTestdata(String name,int year,double price,String cpu_model,String hard_disk_size)
	{
		
		devicePayload = new DevicePojo();
		deviceData = new DeviceDataPojo();
		
		deviceData.setCpu_model(cpu_model);
		deviceData.setHard_disk_size(hard_disk_size);
		deviceData.setPrice(price);
		deviceData.setYear(year);
		
		devicePayload.setName(name);  
		devicePayload.setData(deviceData);
		
        Response response =  deviceEndpoint.createNewDevice(devicePayload);
		
		//log response
		response.then().log().all();
		
		//validation 
		Assert.assertEquals(response.getStatusCode(),200);

		
	}
	
	

}
