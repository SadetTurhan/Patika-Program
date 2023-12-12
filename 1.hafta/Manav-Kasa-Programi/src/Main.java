import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5;
    double alinanArmut, alinanElma, alinanDomates, alinanMuz, alinanPatlican, toplamTutar;
    int alinanMiktar;
        Scanner input= new Scanner(System.in);

        System.out.println("Kaç adet armut aldınız? ");
        alinanMiktar = input.nextInt();
        alinanArmut = alinanMiktar * armutFiyat;

        System.out.println("Kaç adet elma aldınız? ");
        alinanMiktar = input.nextInt();
        alinanElma = alinanMiktar * elmaFiyat;

        System.out.println("Kaç adet domates aldınız? ");
        alinanMiktar = input.nextInt();
        alinanDomates = alinanMiktar * domatesFiyat;

        System.out.println("Kaç adet muz aldınız? ");
        alinanMiktar = input.nextInt();
        alinanMuz = alinanMiktar * muzFiyat;

        System.out.println("Kaç adet patlıcan aldınız? ");
        alinanMiktar = input.nextInt();
        alinanPatlican = alinanMiktar * patlicanFiyat;

        toplamTutar = (alinanArmut + alinanElma + alinanDomates + alinanMuz + alinanPatlican);
        System.out.println("Toplam Tutar: " + toplamTutar + "TL");
    }
}