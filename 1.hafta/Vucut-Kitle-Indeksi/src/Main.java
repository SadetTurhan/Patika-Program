import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //değiskenler
       double boy,kilo,vucutKitleIndeksi;
       //girdi alma
       Scanner input = new Scanner(System.in);
       System.out.println("Lütfen boyunu metre cinsinden giriniz(metre ve cm arasında virgül kullanınız): ");
       boy = input.nextDouble();
       System.out.println("Lütfen kilonuzu giriniz: ");
       kilo = input.nextDouble();
       //VKI hesaplama
       vucutKitleIndeksi = kilo / (boy * boy);
       System.out.println(vucutKitleIndeksi);
    }
}