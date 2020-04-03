package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelData {
	// Method to select specific information from an excel spreadsheet
	public static String desiredFile(int desiredRow, int desiredCell) {

		XSSFWorkbook wb;
		FileInputStream file;

		try {
			file = new FileInputStream("UserInformation.xlsx");
			wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheetAt(0);
			XSSFRow row = sheet.getRow(desiredRow);
			XSSFCell cell = row.getCell(desiredCell);
			String data = cell.toString();
			wb.close();
			return data;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

	// Method for entering data into an excel spreadsheet from a selected website
	public static void dataEntry(WebDriver driver) {

		FileOutputStream file;
		String[] information = { "First Name", "Last Name", "e-mail", "Password", "Date of Birth", "Gender", "Address",
				"Address 2", "City", "Postal Code", "Phone Number" };
		String[] personInfo = new String[11];
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("accounts");
		XSSFRow row = sheet.createRow(0);
		for (int i = 0; i < information.length; i++) {
			Cell cell = row.createCell(i);
			cell.setCellValue(information[i]);
		}
		GeneratingData.getDataPage(driver);

		for (int x = 0; x < 30; x++) {
			row = sheet.createRow(x + 1);
			personInfo = GeneratingData.readingDataOnline(driver);
			for (int i = 0; i <= 10; i++) {
				Cell cell = row.createCell(i);
				cell.setCellValue(personInfo[i]);
			}
		}
		try {
			file = new FileOutputStream("UserInformation.xlsx");
			wb.write(file);
			wb.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
