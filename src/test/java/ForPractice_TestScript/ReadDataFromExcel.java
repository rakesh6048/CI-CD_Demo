package ForPractice_TestScript;

import java.io.FileInputStream;

import org.apache.poi.ss.formula.WorkbookDependentFormula;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) {
		
		
		Row r=null;
		Cell c;
		try {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//ExcelTestData//TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheetAt(1);
		
		r=s.getRow(1);
		int totalNumberOfRow = s.getLastRowNum();
		int toatalNumberOfColumn = r.getLastCellNum();
		
		for(int i=0;i<totalNumberOfRow;i++) {
		  for(int j=0;j<toatalNumberOfColumn;j++) {
			  System.out.println(new DataFormatter().formatCellValue(s.getRow(i).getCell(j))+"");
		  }
		}
		}catch(Exception e) {
			System.out.println(e);
		}	
	}
}
