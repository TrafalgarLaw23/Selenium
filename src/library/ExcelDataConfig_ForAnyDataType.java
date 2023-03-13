package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig_ForAnyDataType {
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public ExcelDataConfig_ForAnyDataType(String ExcelPath) throws IOException {

		File src = new File(ExcelPath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);

	}

	public String getData(int sheetnum, int row, int column) {
		
		  DataFormatter objDefaultFormat = new DataFormatter(); 
		  
		  CreationHelper b=wb.getCreationHelper(); 
		  
		  FormulaEvaluator objFormulaEvaluator =b.createFormulaEvaluator(); 
		  
		  sheet1 = wb.getSheetAt(sheetnum);
		  
		  XSSFCell data = sheet1.getRow(row).getCell(column);
		  
		  objFormulaEvaluator.evaluate(data); // This will evaluate the cell,
		  //And any type of cell will return string value
		  
		  String val =objDefaultFormat.formatCellValue(data,objFormulaEvaluator);
		  
		  return val;	
	}

}
