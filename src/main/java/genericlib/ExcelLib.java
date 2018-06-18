package genericlib;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelLib {
    /**
     * This method is used to get data from Excel sheet by the help of Apache poi API
     * @param sheet This is the Sheet name in the Excel sheet
     * @param rowNumber This is the Row number in the Excel sheet
     * @param cellNumber This is the Cell number in the Excel Sheet
     * @return This give the Data according to Sheet Name, Row Number and cell Number
     * @throws IOException
     * @throws InvalidFormatException
     */
    public String getExcelData(String sheet, int rowNumber, int cellNumber) throws IOException, InvalidFormatException {
        String path = "src/main/resources/TestData/TestData.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet(sheet);
        Row rw = sh.getRow(rowNumber);
        String output = rw.getCell(cellNumber).getStringCellValue();
        return output;
    }
}
