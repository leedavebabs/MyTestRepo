package WebdriverTest.WebdriverTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcel {
	
	private static HSSFWorkbook workbook;
	private static HSSFSheet worksheet;
	
	
	
	
	/*private static Object[][] readingExcel(String path, String sheet) throws IOException{
		 
		 FileInputStream fip = new FileInputStream(new File(path));
		 workbook = new HSSFWorkbook(fip);
		 
		 worksheet = workbook.getSheet(sheet);
		 int rowNum = worksheet.getLastRowNum() - worksheet.getFirstRowNum();
		 Object[][] testdata = null;
		 testdata = new Object[5][5];
				 for(int i=0;i<=rowNum;i++){
					 Row row = worksheet.getRow(i);
			 for(int j=0;j<row.getLastCellNum();j++){
				  row.getCell(j).toString();
				 
				 testdata[i][j] = worksheet.getRow(i).getCell(j).toString() + "||";
				 
			 }
			 
		 }
				 return testdata;
	} */
		
	public static void findFather(String path, String sheet)throws IOException{
		FileInputStream fip = new FileInputStream(new File(path));
		 workbook = new HSSFWorkbook(fip);
		 worksheet = workbook.getSheet(sheet);	
		
		 for(Row row : worksheet){
			 for(Cell cell : row){
				 if(cell.toString().equals("father")){
					 System.out.println(cell.toString());
				 } 
			 }
		 }
		 
		
	}	
	
	

	public static void main(String[] args)  {
		try{
		String line = "C:\\Users\\New User\\Desktop\\monkey.xls";
		String sheetName = "Sheet1";
		
		
		findFather(line, sheetName);
		}
		catch(Exception ex){
			System.out.println( ex.getMessage());
		}

	}

}
