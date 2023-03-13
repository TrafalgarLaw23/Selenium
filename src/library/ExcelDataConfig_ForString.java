package library;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig_ForString {
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public ExcelDataConfig_ForString(String ExcelPath) throws Exception {

		File src = new File(ExcelPath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);

	}

	public String getData(int sheetnum, int row, int column) {
			sheet1 = wb.getSheetAt(sheetnum);
			String data = sheet1.getRow(row).getCell(column).getStringCellValue();
			return data;
	}

}
