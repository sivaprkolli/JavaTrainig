package DataManager;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
        File file1 = new File("/Users/shiva/Documents/Appolo/JavaTraining/TestData/TestData.xlsx");
        File file = new File(System.getProperty("user.dir") + "/TestData/TestData.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        String cellvalue = sheet.getRow(2).getCell(1).toString();
        String cellvalue1 = sheet.getRow(2).getCell(1).getStringCellValue();

        System.out.println(cellvalue);
        System.out.println(cellvalue1);

        System.out.println(sheet.getRow(1).getCell(1));
        System.out.println(sheet.getRow(1).getCell(0));

    }
}
