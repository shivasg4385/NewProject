import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		//to create an read the file
		File f=new File("C:\\Users\\shikumar13\\Desktop\\Automation Works\\Selenium Workspace\\Exported tables - Interfaces.xls");
		
		FileInputStream fis=new FileInputStream(f);
		
		//create workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		//Get sheet
		Sheet sh=wb.getSheet("exportedTables-Interfaces");
		
		//Get Row
		Row r=sh.getRow(3);
		
		//get Cell
		
		Cell c=r.getCell(0);
		
		//get data
		String data=c.toString();
		System.out.println(data);
	}
}
