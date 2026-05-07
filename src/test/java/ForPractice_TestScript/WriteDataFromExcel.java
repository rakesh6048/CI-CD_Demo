package ForPractice_TestScript;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataFromExcel {

	public static void main(String[] args) {
		
		Row r = null;
		Cell c;
		
		try {
		FileInputStream fi = new FileInputStream("D:/Read&WriteExcel/EmployeeDetails.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet s =wb.createSheet("NewSheet");
		
		r = s.createRow(1);
		c = r.createCell(1);
		c.setCellValue("location");
		
		FileOutputStream out = new FileOutputStream("D:/Read&WriteExcel/EmployeeDetails2.xlsx");
		wb.write(out);
		
		out.flush();
			
			
		}catch(Exception e) {
			
	    System.out.println(e);
		
	}
	}

}
