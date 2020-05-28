import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;
import java.io.File;

class salesStatement {
    public static void main(String[] args) throws FileNotFoundException {
        final String fileName = ("objects.csv");

        String nameProduct = new String(readFileName.getName);
        System.out.println("Nazwa towaru: "+ nameProduct);
        BigDecimal priceWithoutVat = new BigDecimal(readFileName.getNettoPrice);
        System.out.println("Cena netto: " + priceWithoutVat);
        BigDecimal priceWithVat = priceWithoutVat.multiply(readFileName.getVat);
        System.out.println("VAT: " + priceWithVat);
        BigDecimal priceGross = priceWithoutVat.add(priceWithVat);
        System.out.println("Cena brutto: " + priceGross);
    }
}
