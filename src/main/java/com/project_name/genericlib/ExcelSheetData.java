package com.project_name.genericlib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Sachin gupta
 *
 */
public class ExcelSheetData implements AutoConstants{
	/**
	 * to get excel sheet data
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	public void getExcellSheetData(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream f=new FileInputStream(excelsheetpath);
		Workbook wb = WorkbookFactory.create(f);
		wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}

}
