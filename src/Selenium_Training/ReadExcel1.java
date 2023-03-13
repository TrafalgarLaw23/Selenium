package Selenium_Training;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 
{

	public static void main(String[] args) throws Exception 
	{
		File src = new File("C:\\Users\\14506215\\eclipse-workspace\\Tools\\ReadData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int lastRowNumber = sheet1.getLastRowNum();
		
		System.out.println(lastRowNumber);
		//System.out.println(lastRowNumber+1);
		
		for(int i=1; i<=lastRowNumber; i++) // try with i=1
		{
			String Data = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(Data);
			
		}
		wb.close();

	}  

}
