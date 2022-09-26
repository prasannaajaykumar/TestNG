package sep13;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConversionDatatype {

	public static void main(String[] args) throws Throwable {
		// script to convert integer data type into string type
        FileInputStream fi =new FileInputStream("E:\\testing\\excel files/ajayfile2.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(fi);
        XSSFSheet ws=wb.getSheet("Login");
        int rc=ws.getLastRowNum();
        System.out.println("No,of rows="+rc);
        for (int i = 1; i <rc; i++) {
			String username=wb.getSheet("Login").getRow(i).getCell(0).getStringCellValue();
			if (wb.getSheet("Login").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC) {
				//read integer type cell data 
				int celldata=(int) wb.getSheet("Login").getRow(i).getCell(1).getNumericCellValue();
				String password=String.valueOf(celldata);
				System.out.println(username+"  "+password);
			}
			fi.close();
			wb.close();
		}
	}

}
