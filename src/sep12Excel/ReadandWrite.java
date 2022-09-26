package sep12Excel;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadandWrite {

	public static void main(String[] args) throws Throwable {
		//script to read and write all rows cell data and 
		//write into results column and output into new workbook
		FileInputStream fi=new FileInputStream("E:\\testing\\excel files\\ajayfile1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheetAt(0);
		int rc=ws.getLastRowNum();
		System.out.println("No,of rows= "+rc);
		
		for (int i = 1; i <=rc; i++) {
		String username	=ws.getRow(i).getCell(0).getStringCellValue();
		String password=ws.getRow(i).getCell(1).getStringCellValue();
		//System.out.println(username.concat(password));
		System.out.println(username+"  "+password);
		//write as pass in results cell
		ws.getRow(i).createCell(2).setCellValue("FAIL");
		}
		
       fi.close();
       FileOutputStream fo=new FileOutputStream("E:\\testing\\excel files\\Ajayresults.xlsx");
       wb.write(fo);
       fo.close();
       wb.close();
	}

}
