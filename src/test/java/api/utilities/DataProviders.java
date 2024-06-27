package api.utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "allData")
	public String [][] allDataProvider()
	{
		String fileName = System.getProperty("user.dir"+"/TestData/DeviceTestData.xlsx");
		
		int totalRowCount = ReadExcelFileData.getRowCount(fileName, "Data");
	    int totalColumnCount = ReadExcelFileData.getColCount(fileName,"Data");
	    
	    String deviceData[][] = new String[totalRowCount-1][totalColumnCount];
	    
	    for(int rowNum=1; rowNum<totalRowCount; rowNum++)
	    {
	    	for(int colNum=0; colNum<totalColumnCount; colNum++)
	    	{
	    		deviceData[rowNum-1][colNum]= ReadExcelFileData.getCellValue(fileName, "Data", rowNum, colNum);
	    	}
	    }
	    return deviceData;
	}
	
}
