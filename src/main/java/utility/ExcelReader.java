package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	
	public Map<String, String> readTestDataFromExcel() {
		File file = new File(System.getProperty("user.dir")+"/src/main/resources/TestData.xlsx");
		FileInputStream fis =null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = wb.getSheetAt(0);
		// wb.close();
		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastRowNum][1];
		Map<String, String> datamap = new HashMap<String, String>();
		for (int i = 0; i < lastRowNum; i++) {
			
			for (int j = 0; j < lastCellNum; j++) {
				datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
			}
		}
		return datamap;
	}

}
