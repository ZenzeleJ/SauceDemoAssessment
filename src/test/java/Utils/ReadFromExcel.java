package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {

    String testData_dir=System.getProperty("user.dir")+"/src/test/java/TestData/data.xlsx";
    FileInputStream fis = new FileInputStream(testData_dir);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);

    XSSFSheet loginDetailSheet =workbook.getSheet("Login Details");

    public String username=loginDetailSheet.getRow(1).getCell(0).getStringCellValue();
    public String password=loginDetailSheet.getRow(1).getCell(1).getStringCellValue();

    public ReadFromExcel() throws IOException {
    }
}
