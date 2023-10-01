package ApachePOI;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * TODO:
 *  Ekrandaki gibi bir Excel Çarpım tablosunu
 *  YENİ bir excel dosyasına
 *  1 den 10 kadar çarpımları YAN YANA yapınız.
 *  (ipucu önce sadece 1 leri yapınız sonra
 *  diğerlerini)
 */

public class _10_Soru3_yanyana_carpim_tablosu {

    public static void main(String[] args) throws IOException {

        //hafzada worbook oluştur, içinde hafızada sheet oluştur
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sayfa1");

        int yeniAcilacakSatirIndexi= 0;
        int cell0 = 0;
        int cell1 = 1;
        int cell2 = 2;
        int cell3 = 3;
        int cell4 = 4;

        for (int k = 1; k <= 10; k++) {

            for (int i = 1; i <= 10; i++) {

                // ++ her bır ıslemı yenı satıra yaz demek
                Row satir = sheet.createRow(yeniAcilacakSatirIndexi++);

                Cell hucre1 = satir.createCell(cell0); hucre1.setCellValue(k);
                Cell hucre2 = satir.createCell(cell1); hucre2.setCellValue("x");
                Cell hucre3 = satir.createCell(cell2); hucre3.setCellValue(i);
                Cell hucre4 = satir.createCell(cell3); hucre4.setCellValue("=");
                Cell hucre5 = satir.createCell(cell4); hucre5.setCellValue(k * i);
            }


            cell0 = cell0 + 5;
            cell1 = cell1 + 5;
            cell2 = cell2 + 5;
            cell3 = cell3 + 5;
            cell4 = cell4 + 5;
//            satir = sheet.createRow(0);


        }

        //kaydet
        String path = "src/test/java/ApachePOI/resource/YeniCarpimYanYana.xlsx";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("işlem tamamlandı");

    }


}
