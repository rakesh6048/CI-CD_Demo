package Latest_Practice_TestScripts;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) {
		
		//Need poi jar add to pom.xml
		
		Row r=null;
		Cell c;
		try {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//ExcelTestData//TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("WorkFlowData");
		
		r=s.getRow(0);
		/*c=r.getCell(1);
		System.out.println(c.getStringCellValue());*/
		
		int totalNumberOfRow = s.getLastRowNum();
		int totalNumberOfColumn = r.getLastCellNum();
		
		for(int i=0;i<totalNumberOfRow;i++){
		  for(int j=0;j<totalNumberOfColumn;j++) {
			  System.out.print(new DataFormatter().formatCellValue(s.getRow(i).getCell(j))+" ");
		  }
		  System.out.println();
		}
					
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
