package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {

    String testData_dir="C:\\Users\\KamogeloS\\Documents\\Automation\\SauceDemoAssessment\\src\\test\\java\\TestData\\TestData.xlsx";

    FileInputStream fis = new FileInputStream(testData_dir);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);

    public ReadFromExcel() throws IOException {
    }

    XSSFSheet sheet = workbook.getSheet("Login Details");

    public String username = sheet.getRow(1).getCell(0).getStringCellValue();
    public String password = sheet.getRow(1).getCell(1).getStringCellValue();


}
