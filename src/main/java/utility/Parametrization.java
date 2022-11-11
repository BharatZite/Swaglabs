package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
public static String getExcelData(String Sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream file= new FileInputStream("C:\\Users\\Bharat\\Documents\\eclipse\\automation\\src\\SwagLabs\\src\\main\\resources\\TestData.xlsx");

	String a=WorkbookFactory.create(file).getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();

	System.out.println(a);
return a;
}
}
