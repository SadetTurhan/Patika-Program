import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //değişkenler
        int a,b,c,islemSonucu;
        //kullanıcıdan sayı alma
        Scanner numbersInput = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        a = numbersInput.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        b = numbersInput.nextInt();
        System.out.println("Üçüncü sayıyı giriniz: ");
        c = numbersInput.nextInt();
        //işlemi tanımlama
        islemSonucu = (a + b * c - b);
        //yazdırma işlemi
        System.out.println("Sonuç: " + islemSonucu);
    }
}