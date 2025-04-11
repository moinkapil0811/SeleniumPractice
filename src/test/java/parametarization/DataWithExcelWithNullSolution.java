package parametarization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.FileInputStream;
import java.io.IOException;

public class DataWithExcelWithNullSolution {

    @DataProvider(name = "kapil")
    public  Object[][] datafun() throws IOException {
        Object[][] arrObj = getExcelData("F:\\Data.xlsx","Sheet1"); //access file
        return arrObj;
    }
    public String[][] getExcelData(String filePath, String sheetName) throws IOException {
        FileInputStream fl = new FileInputStream(filePath);
        XSSFWorkbook wb = new XSSFWorkbook(fl);
        XSSFSheet sheet = wb.getSheet(sheetName);
        int noOfRow = sheet.getPhysicalNumberOfRows();
        XSSFRow row = sheet.getRow(0);
        int noOfCol = row.getLastCellNum();

        String[][] data = new String[noOfRow - 1][noOfCol];

        for (int i = 1; i < noOfRow; i++) {
            row = sheet.getRow(i);

            for (int j = 0; j < noOfCol; j++) {
                Cell cell = row.getCell(j);
                
                if (cell == null || cell.getCellType() == CellType.BLANK) {
                    data[i - 1][j] = "";
                } else {
                    data[i - 1][j] = cell.toString();
                }
            }
        }

        return data;
    }


    @Test(dataProvider = "kapil")
    public void verifyEdso(String courseName, String cityName) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/ ");
        driver.manage().window().maximize();
        WebElement searchdata = driver.findElement(By.name("q"));
        searchdata.sendKeys(courseName + " " + cityName);
        searchdata.sendKeys(Keys.ENTER);

        driver.close();
    }
}
