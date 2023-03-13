package Selenium_Training;

import library.ExcelDataConfig_ForAnyDataType;
import library.ExcelDataConfig_ForString;

public class ReadExcel2 
{

	// this code will use both excel data config library
	
	public static void main(String[] args) throws Exception 
	{
		
		ExcelDataConfig_ForString obj = new ExcelDataConfig_ForString("C:\\Users\\14506215\\eclipse-workspace\\Tools\\ReadData.xlsx");
		System.out.println(obj.getData(0, 5, 1));
		
		
		ExcelDataConfig_ForAnyDataType obj1 = new ExcelDataConfig_ForAnyDataType("C:\\Users\\14506215\\eclipse-workspace\\Tools\\ReadData.xlsx");
		System.out.println(obj1.getData(0, 7, 1));
	
	}

}
