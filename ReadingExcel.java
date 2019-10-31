package excelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.WorkbookUtil;




public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String absolutepath = "C:\\Users\\shaky\\eclipse-workspace\\ExcelFiles\\data\\Asmara Grocery Daily report-2019.xlsx";
		//String relativePath = ".\\data\\Asmara Grocery Daily report-2019.xlsx";
		 File f = new File(absolutepath);
		 FileInputStream fi = new FileInputStream (f);
		 
		 Workbook wb = WorkbookFactory.create(fi);
		 Sheet ws = wb.getSheetAt(0);
				 Row r0 = ws.getRow(0);
				 Cell c0 = r0.getCell(0);
				 
				 System.out.println(c0);
				 
				 fi.close();
	        

	}

}
