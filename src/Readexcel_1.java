import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public class Readexcel_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		//to create an read the file
				File f=new File("C:\\Users\\shikumar13\\Desktop\\Automation Works\\Selenium Workspace\\Exported tables - Interfaces.xls");
				
				FileInputStream fis=new FileInputStream(f);
				
				//create workbook
				Workbook wb=WorkbookFactory.create(fis);
				
				//Get sheet
			    Sheet sh=wb.getSheet("exportedTables-Interfaces");
			    
			    int rc=sh.getLastRowNum();
			    
			    for(int i=0;i<=rc;i++)
			    {
			    	int cc=sh.getRow(i).getLastCellNum();
			    	
			    		for(int j=0;j<cc;j++)
			    		{
			    			String C_data=sh.getRow(i).getCell(j).toString();
			    			
			    			System.out.print(C_data+"\t");
			    		}
			    		System.out.println();
			    }
				
				
	}
}
