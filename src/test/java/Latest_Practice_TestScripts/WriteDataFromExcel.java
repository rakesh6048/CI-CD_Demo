package Latest_Practice_TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteDataFromExcel {
	
	@Test(priority = 0, enabled = false)
	public void writeDataFromExcel() { 
		
		try {
			
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//ExcelTestData//TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		FileOutputStream fout = new FileOutputStream(System.getProperty("user.dir") + "//ExcelTestData//TestData1.xlsx");
		wb.write(fout);
		
		fout.flush();
		fout.close();
			
		}catch(Exception e) {
			
		}
		
	}
	
	@Test(priority = 1, enabled = true)
	public void craeteSheetInExcelAndWrite() throws InvalidFormatException, IOException {
		
		Row r =null;
		Cell c;
		
		try {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//ExcelTestData//TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.createSheet("EmpDetails3");
		
		//Cell col1 =s.getRow(0).getCell(0);
		//col1.setCellValue("Address");
		
		r = s.createRow(0);
		c = r.createCell(1);
		c.setCellValue("Address");
		
		FileOutputStream fout = new FileOutputStream(System.getProperty("user.dir") + "//ExcelTestData//TestData.xlsx");
		wb.write(fout);
		
		Sheet s1 = wb.createSheet("EmpDetails3");
		
		r = s.createRow(0);
		c = r.createCell(2);
		c.setCellValue("Email");
		
		/*Sheet s1 = wb.createSheet("EmpDetails4");
		r = s1.createRow(0);
		c = r.createCell(1);
		c.setCellValue("Address");*/
		
		/*r = s.createRow(0);
		c = r.createCell(1);
		c.setCellValue("Address");
		
		r = s.createRow(0);
		c = r.createCell(2);
		c.setCellValue("Email");*/
		
		/*Cell col1 =s.getRow(5).getCell(0);
		col1.setCellValue("Name");
		Cell col2 =s.getRow(5).getCell(1);
		col2.setCellValue("Address");
		Cell val1 =s.getRow(1).getCell(0);
		val1.setCellValue("Rakesh");
		Cell val2 =s.getRow(1).getCell(1);
		col1.setCellValue("Delhi");
		Cell val3 =s.getRow(2).getCell(0);
		val3.setCellValue("Mohan");
		Cell val4 =s.getRow(2).getCell(1);
		val4.setCellValue("Mumbai");
		Cell val5 =s.getRow(3).getCell(0);
		val5.setCellValue("Sohan");
		Cell val6 =s.getRow(3).getCell(1);
		val6.setCellValue("Colcuta");*/
		
		FileOutputStream fout1 = new FileOutputStream(System.getProperty("user.dir") + "//ExcelTestData//TestData.xlsx");
		wb.write(fout1);
		
		fout.flush();
		fout.close();
		fout1.flush();
		fout1.close();
		
		}catch(Exception e) {
			System.out.println(e);
		}	
	}
}
