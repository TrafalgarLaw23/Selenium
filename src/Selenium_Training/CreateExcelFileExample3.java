package Selenium_Training;
import java.io.File;
import java.io.FileOutputStream;

import  org.apache.poi.hssf.usermodel.HSSFRow;
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
public class CreateExcelFileExample3  
{  
public static void main(String[]args)   
{  
try   
{  
//declare file name to be create   
//String src = "D:\\Balance.xls"; 
File src = new File("D:\\Balance.xls");
FileOutputStream fos = new FileOutputStream(src); 
//creating an instance of HSSFWorkbook class  
XSSFWorkbook wb = new XSSFWorkbook(); 
//invoking creatSheet() method and passing the name of the sheet to be created   
XSSFSheet sheet = wb.createSheet("January");   
//creating the 0th row using the createRow() method  
XSSFRow rowhead = sheet.createRow((short)0);  
//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
rowhead.createCell(0).setCellValue("S.No.");  
rowhead.createCell(1).setCellValue("Customer Name");  
rowhead.createCell(2).setCellValue("Account Number");  
rowhead.createCell(3).setCellValue("e-mail");  
rowhead.createCell(4).setCellValue("Balance");  
//creating the 1st row  
XSSFRow row = sheet.createRow((short)1);  
//inserting data in the first row  
row.createCell(0).setCellValue("1");  
row.createCell(1).setCellValue("John William");  
row.createCell(2).setCellValue("9999999");  
row.createCell(3).setCellValue("william.john@gmail.com");  
row.createCell(4).setCellValue("700000.00");  
wb.write(fos);  
//closing the Stream  
fos.close();  
//closing the workbook  
wb.close();  
//prints the message on the console  
System.out.println("Excel file has been generated successfully.");  
}   
catch (Exception e)   
{  
e.printStackTrace();  
}  
}  
}  