import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //değişkenler
        int a,b;
        double c;
        ///kullanıcıdan çıktı alma
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. kenarı giriniz: ");
        a = girdi.nextInt();
        System.out.println("2. kenarı giriniz: ");
        b = girdi.nextInt();
        ///hipotenüsü bulma
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("hipotenüs: " + c);

        /** Ödev **/
        ///değişkenler
        double cevreninYarisi,ucgeninAlani;
        cevreninYarisi = (a + b + c) / 2.0;
        ucgeninAlani = Math.sqrt(cevreninYarisi * (cevreninYarisi - a) * (cevreninYarisi - b) * (cevreninYarisi - c));
        System.out.println(ucgeninAlani);
    }
}