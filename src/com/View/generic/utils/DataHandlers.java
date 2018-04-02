package com.View.generic.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.*;

public class DataHandlers {

public static String getDataFromProperties(String fileName, String key)
{
	String value =null;
	try{
		File f = new File("./config-Data/"+fileName+".properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		value=(String) prop.get(key);
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return value;
	}

public static void storeDataToProperties(String fileName,String key,String value, String comment)
{
	try {
		File f = new File("./config-Data/"+fileName+".properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		prop.setProperty(key, value);
		FileOutputStream fos= new FileOutputStream(f);
		prop.store(fos, comment);
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
public static String getDataFromExcel(String fileName, String sheetName,int rowIndex, int cellIndex)

{ String data =null;
	try{
		File f = new File("./config-Data"+fileName+".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet(sheetName);
		Row r = st.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		data = c.toString();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		return data;
	}

public static void storeDataIntoExcel(String fileName, String sheetName, int rowIndex, int cellIndex, String data )
{
	try {

	File f = new File("./config-Data/"+fileName+".properties");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet st = wb.getSheet(sheetName);
	Row r = st.getRow(rowIndex);
	Cell c=r.getCell(cellIndex);
	c.setCellValue(data);
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


