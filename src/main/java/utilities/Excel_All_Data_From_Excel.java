package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import testBase.TestBase;

public class Excel_All_Data_From_Excel extends TestBase
{
	
	public String[][] ExcelData(String SheetName, String SheetLocation) throws Exception
	{
		
		FileInputStream fil=new FileInputStream(System.getProperty("user.dir")+SheetLocation);
		
		XSSFWorkbook book = new XSSFWorkbook(fil);
		XSSFSheet sheet = book.getSheet(SheetName);
		
		int Total_Rows=sheet.getLastRowNum()+1;
		int Tota_Columns=sheet.getRow(0).getLastCellNum();
		
		String[][] Get_Data= new String[Total_Rows][Tota_Columns];
		
		for (int i=0;i<Total_Rows;i++)
		{
			Row row=sheet.getRow(i);
			
			for (int j=0;j<Tota_Columns;j++)
			{
				Cell colmn= row.getCell(j);
				Get_Data[i][j]=colmn.getStringCellValue();	
			}
		}
		return Get_Data;
	}

}
