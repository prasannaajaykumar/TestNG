package sep12Excel;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Readcdata2ndmethod {

	public static void main(String[] args) throws Throwable {
		// script to read specific cell data 2nd method
		FileInputStream fi=new FileInputStream("E:\\testing\\excel files\\ajayfile1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheetAt(0);
		//print no,of rows
		int rc=ws.getLastRowNum();
		System.out.println("No,of rows= "+rc);
		//read username cell data
		String username=ws.getRow(12).getCell(0).getStringCellValue();
		String password=ws.getRow(12).getCell(1).getStringCellValue();
		System.out.println(username+"   "+password);
		fi.close();
		wb.close();
	}

}
