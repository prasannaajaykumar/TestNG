package sep9;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excelsheet {
	public static void main(String[] args) throws Throwable {
		//script to count no,of rows and no,of ceels in first row
		
		//read path of excel
        FileInputStream f=new FileInputStream("E:\\testing\\excel files\\ajayfile1.xlsx");
        //get workbook from file
		XSSFWorkbook wb=new XSSFWorkbook(f);
		//get sheet from workbook
		XSSFSheet sh=wb.getSheet("Itsmysheet");
		//get first row from sheet
		XSSFRow row=sh.getRow(0);
		//count no of rows in a sheet    
		int rc=sh.getLastRowNum();
		//count no of cells in a row
		int cc=row.getLastCellNum();
		System.out.println("Rows="+rc+"\n"+"Cells="+cc);
		wb.close();
		f.close();
		
		
	}

}