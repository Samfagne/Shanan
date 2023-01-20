package paramerization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class boolean_data {
	public static void main(String[] args) throws Throwable{
		FileInputStream file = new FileInputStream("F:\\sam.xlsx");
		 Boolean data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(4).getBooleanCellValue();
System.out.println(data);
	}

}
