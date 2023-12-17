import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Bir adet tam sayı(int) giriniz: ");
       int girilenIntSayi = input.nextInt();
       System.out.println("Bir adet ondalıklı sayı(double) giriniz(ondalık değeri virgül ile ör:8,5 yazınız): ");
       double girilenDoubleSayi = input.nextDouble();

       double donusturulenIntSayi = girilenIntSayi;
       int donusturulenDoubleSayi = (int) girilenDoubleSayi;
        System.out.println(donusturulenIntSayi);
        System.out.println(donusturulenDoubleSayi);
    }
}