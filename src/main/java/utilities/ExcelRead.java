package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead 
{

	public String [][] ExcelData_Read() throws IOException  
	{
		FileInputStream File = new FileInputStream(System.getProperty("user.dir")+"\\Test Data\\LogInData.xlsx");
		
		XSSFWorkbook Workbook = new XSSFWorkbook (File);
		
		XSSFSheet sheet = Workbook.getSheet("Sheet1");
		
		int Row_Count = sheet.getLastRowNum()+1;
		int Column_Count=sheet.getRow(0).getLastCellNum();
		
		String Get_Data [][]=new String[Row_Count][Column_Count];
		
		for (int i=0;i<Row_Count;i++)
		{	
			Row row=sheet.getRow(i);
			
			for (int j=0;j<Column_Count;j++)
			{
				Cell cell=row.getCell(j);
				
				Get_Data[i][j]=cell.getStringCellValue();
			}
		}
		
		return Get_Data;		
	}
	
}
