package Latest_Practice_TestScripts;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import gherkin.formatter.model.Row;

public class ReadDataHSSFXSSF {

	
	@Test(priority=0, enabled=true)

	public void readDataUsingHSSF() {
		try {
			
	    //Read data using HSSF
			
	    FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"//ExcelTestData//Book2.xls");
		HSSFWorkbook hwb = new HSSFWorkbook(fis);
		HSSFSheet s = hwb.getSheetAt(0);
		
		int numberOfRowCount = s.getLastRowNum();
		System.out.println("---------------------------Print excel data using HSSF-----------------------");
		for(int i=0;i<numberOfRowCount;i++) {
			
			int numberOfColumnCount = s.getRow(i).getLastCellNum();
			for(int j=0;j<numberOfColumnCount;j++) {
				System.out.print(new DataFormatter().formatCellValue(s.getRow(i).getCell(j))+" ");
			}
			System.out.println();
		}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}
	@Test(priority=1, enabled=true)
	public void readDataUsingXSSF() {
		
		try {
		
		//Read data using XSSF
		
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//ExcelTestData//TestData.xlsx");
		XSSFWorkbook xwb = new XSSFWorkbook(fis);
		XSSFSheet s = xwb.getSheetAt(0);
		
		int numberOfRowCount = s.getLastRowNum();
		
		System.out.println("---------------------------Print excel data using XSSF-----------------------");
		
		for(int i=0;i<numberOfRowCount;i++) {
			
			int numberOfColumnCount = s.getRow(i).getLastCellNum();
			for(int j=0;j<numberOfColumnCount;j++) {
				System.out.print(new DataFormatter().formatCellValue(s.getRow(i).getCell(j))+" ");
			}
			System.out.println();
		}		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
