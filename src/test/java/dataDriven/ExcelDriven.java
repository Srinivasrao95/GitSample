package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {

	public static void main(String[] args) throws IOException {


	FileInputStream  fis=new FileInputStream("C:\\Users\\LENOVO FAIN\\OneDrive\\Desktop\\Framework Documents\\Trip Details.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	
	

	}

}
