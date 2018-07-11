package com.dataprovider.excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataSheetIntake {

	public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
		File file =    new File(filePath+"\\"+fileName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook DetailWorkbook = null;
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		if(fileExtensionName.equals(".xlsx")){
			DetailWorkbook = new XSSFWorkbook(inputStream);
		}
		else if(fileExtensionName.equals(".xls")){
			DetailWorkbook = new HSSFWorkbook(inputStream);
		}
		Sheet DetailSheet = DetailWorkbook.getSheet(sheetName);
		int rowCount = DetailSheet.getLastRowNum()-DetailSheet.getFirstRowNum();
		ValuesStored.setUserValue((DetailSheet.getRow(1).getCell(0).getStringCellValue()));
		ValuesStored.setPassValue((DetailSheet.getRow(1).getCell(1).getStringCellValue()));
		ValuesStored.setCompareLoginValue(DetailSheet.getRow(2).getCell(0).getStringCellValue());
	}
	public void ReturnValue(String UserValue,String PassValue,String CompareInput) {
		DataSheetIntake DataIp=new DataSheetIntake();
		System.out.println(ValuesStored.getUserValue()+" "+ValuesStored.getPassValue()+" "+ValuesStored.getCompareLoginValue());
	}
	public static void main(String...strings) throws IOException{
		DataSheetIntake objExcelFile = new DataSheetIntake();
		String filePath = System.getProperty("user.dir")+"\\src"; 
		objExcelFile.readExcel(filePath,"DetailWorkbook.xlsx","DetailSheet");
		System.out.println(ValuesStored.getUserValue());
		System.out.println(ValuesStored.getPassValue());
		System.out.println(ValuesStored.getCompareLoginValue());

	}
}