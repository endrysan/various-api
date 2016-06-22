import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class ParserOriflameExcel {

    private static final String NUMBER_CONS = "№ Конс.";
    private static final String LEVEL = "Ур";
    private static final String SPONSOR = "Спонсор";

    public static String parse(String name) {

        String result = "";
        InputStream in = null;
        HSSFWorkbook wb = null;
        try {
            in = new FileInputStream(name);
            wb = new HSSFWorkbook(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = wb.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        int numberCellConsultant = -1;
        int numberCellLevel = -1;
        int numberCellSponsor = -1;
        while (it.hasNext()) {
            Row row = it.next();
            if (row.getRowNum() == 9) {
                return "";
            }
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
//                System.out.println("===============" + cell.getColumnIndex() + "===============");
                int cellType = cell.getCellType();
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        if (cell.getStringCellValue().equals(NUMBER_CONS)) {
                            System.out.println(true);
                            numberCellConsultant = cell.getColumnIndex();
                        } else if (cell.getStringCellValue().equals(LEVEL)) {
                            System.out.println(true);
                            numberCellLevel = cell.getColumnIndex();
                        } else if (cell.getStringCellValue().equals(SPONSOR)) {
                            System.out.println(true);
                            numberCellSponsor = cell.getColumnIndex();
                        }
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.println("N Cons: " + numberCellConsultant + "; level: " + numberCellLevel + "; sponsor: " + numberCellSponsor);
                        if (numberCellConsultant != -1 || numberCellLevel != -1 || numberCellSponsor != -1) {
                            System.out.println(cell.getNumericCellValue());
                        }
//                        result += "[" + cell.getNumericCellValue() + "]";
                        break;
                    default:
//                        result += "|";
                        break;
                }
            }
//            result += "\n";
        }

        return result;
    }
}
