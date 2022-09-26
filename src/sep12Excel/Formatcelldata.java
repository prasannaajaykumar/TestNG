package sep12Excel;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Formatcelldata {
	public static void main(String[] args) throws Throwable {
		// script to format
		FileInputStream fi=new FileInputStream("E:\\testing\\excel files\\ajayfile1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheetAt(0);
		int rc=ws.getLastRowNum();
		System.out.println("No,of rows= "+rc);
        for (int i = 1; i <=rc; i++) {
        	
			String username=ws.getRow(i).getCell(0).getStringCellValue();
			String password=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(i+") "+username+"  "+password);
			
			//write as pass in results column
			ws.getRow(i).createCell(2).setCellValue("PASS");
			XSSFCellStyle style=wb.createCellStyle();
			XSSFFont font=wb.createFont();
			
			//color text
			font.setColor(IndexedColors.DARK_RED.getIndex());
			font.setBold(true);
			font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
			style.setFont(font);
			ws.getRow(i).getCell(2).setCellStyle(style);
			fi.close();
		}
        FileOutputStream fo=new FileOutputStream("E:\\testing\\excel files\\results.xlsx");
        wb.write(fo);
        fo.close();
        wb.close();
	}

}
