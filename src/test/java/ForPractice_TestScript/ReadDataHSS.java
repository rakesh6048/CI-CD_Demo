package ForPractice_TestScript;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataHSS {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("D:/Read&WriteExcel/Book2.xls");
			
			//FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//ExcelTestData//TestData.xlsx");
			
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			
			HSSFSheet sheet = wb.getSheetAt(0);
			
			int numberOfRowCount =sheet.getLastRowNum();
			
			for(int i=0;i<numberOfRowCount;i++) {
				
				int numberOfColumnCount = sheet.getRow(i).getLastCellNum();
				for(int j=0;j<numberOfColumnCount;j++) {
					
				System.out.print(new DataFormatter().formatCellValue(sheet.getRow(i).getCell(j))+" ");	
				}
				System.out.println();
			}
			
			/*XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet s = wb.getSheetAt(0);
			
			int numberOfRow = s.getLastRowNum()-s.getFirstRowNum();
			
			for(int i=0;i<numberOfRow;i++) {
				
				int numberOfColumn =s.getRow(i).getLastCellNum();
				for(int j=0;j<numberOfColumn;j++) {
					System.out.print(new DataFormatter().formatCellValue(s.getRow(i).getCell(j))+" ");
				}
				System.out.println();
			}*/
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
