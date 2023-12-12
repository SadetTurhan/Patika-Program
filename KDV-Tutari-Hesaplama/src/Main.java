import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /// Değişkenleri atama
        double tutar, kdvOran = 0.18, indirimliKdvOrani = 0.08,kdvTutar, kdvliTutar,indirimliKdvTutar,urunIndirimliKdvliTutar;
        /// Girdi alma
        Scanner input = new Scanner(System.in);
        System.out.println("Ürün tutarını giriniz: ");
        tutar = input.nextDouble();
        ///KDV oranlarını alma
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        indirimliKdvTutar = tutar * indirimliKdvOrani;
        urunIndirimliKdvliTutar = tutar + indirimliKdvTutar;
        ///Uygun KDV ile ürün fiyatını yazdırma
        System.out.println("Ürün tutarı: " + (tutar > 1000 ? urunIndirimliKdvliTutar: kdvliTutar));
    }
}