package moneylovertransformer

import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileInputStream
import java.io.FileOutputStream

//fun writeToExcelFile(filepath: String) {
//    //Instantiate Excel workbook:
//    val xlWb = XSSFWorkbook()
//    //Instantiate Excel worksheet:
//    val xlWs = xlWb.createSheet()
//
//    //Row index specifies the row in the worksheet (starting at 0):
//    val rowNumber = 0
//    //Cell index specifies the column within the chosen row (starting at 0):
//    val columnNumber = 0
//
//    //Write text value to cell located at ROW_NUMBER / COLUMN_NUMBER:
//    xlWs.createRow(rowNumber).createCell(columnNumber).setCellValue("TEST")
//
//    //Write file:
//    val outputStream = FileOutputStream(filepath)
//    xlWb.write(outputStream)
//    xlWb.close()
//}


fun readFromExcelFile(filepath: String) {
    val inputStream = FileInputStream(filepath)
    //Instantiate Excel workbook using existing file:
    var xlWb = WorkbookFactory.create(inputStream)

    //Row index specifies the row in the worksheet (starting at 0):
    val rowNumber = 0
    //Cell index specifies the column within the chosen row (starting at 0):
    val columnNumber = 0

    //Get reference to first sheet:
    val xlWs = xlWb.getSheetAt(0)
    println(xlWs.getRow(rowNumber).getCell(columnNumber))
}

fun main(args: Array<String>) {
    val filepath = "./exported money.xlsx"
//    writeToExcelFile(filepath)
    readFromExcelFile(filepath)
}
