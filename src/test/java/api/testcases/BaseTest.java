package api.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.github.javafaker.Faker;

import api.payload.DeviceDataPojo;
import api.payload.DevicePojo;

public class BaseTest {
	

	Faker faker;
	DevicePojo devicePayload ;
	DeviceDataPojo deviceData ;
	public static Logger Logger;
	
	@BeforeTest
	public void generateTestdata()
	{
	
		faker = new Faker();
		
		devicePayload = new DevicePojo();
		deviceData = new DeviceDataPojo();
		
		deviceData.setCpu_model("Apple");
		deviceData.setHard_disk_size("TB");
		deviceData.setPrice(20033.2);
		deviceData.setYear(2023);
		
		devicePayload.setName(faker.name().name());  
		devicePayload.setData(deviceData);
		
		//logger
		
		Logger = LogManager.getLogger("RestAssured-Java-HybridFramework");
		
	}
	

}
