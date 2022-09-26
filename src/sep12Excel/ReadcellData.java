package sep12Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadcellData {

	public static void main(String[] args) throws Throwable {
		// script to read specific cell data 
		FileInputStream fi=new FileInputStream("E:\\testing\\excel files\\ajayfile1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheetAt(0);
		int rc=ws.getLastRowNum();
		System.out.println("No,of rows= "+rc);
		//get any row from sheet
		XSSFRow row=ws.getRow(7);
		//get first cell from above row
		XSSFCell c1=row.getCell(0);
		//get second cell data from above row
		XSSFCell c2=row.getCell(1);
		System.out.println("First cell data= "+c1+"  "+"Second cell data= "+c2);
		fi.close();
		wb.close();
	
	}

}
