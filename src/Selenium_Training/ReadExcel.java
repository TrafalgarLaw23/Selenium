package Selenium_Training;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{

	public static void main(String[] args) throws Exception 
	{
		
		File src = new File("C:\\Users\\14506215\\eclipse-workspace\\Tools\\ReadData.xlsx");// give your excel path
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		String data = sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data);
		
		wb.close();
	}

}
