import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //değişkener
        int matematik, fizik,tarih;
        Scanner input = new Scanner(System.in);
        System.out.println("matematik notu giriniz: ");
        matematik = input.nextInt();
        System.out.println("İkinci notu giriniz: ");
        ikinciDers = input.nextInt();
        double ortalama = ((birinciDers + ikinciDers) / 2);
        System.out.println(ortalama);
        System.out.println(ortalama > 60 ? "Dersi geçtiniz": "Dersten kaldınız");
    }
}