import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler
        int n,toplam = 0;
        //girdi alma
        Scanner input = new Scanner(System.in);

        //döngü
        do{
            System.out.println("bir sayı giriniz");
            n = input.nextInt();
            if(n % 4 == 0) {
                toplam += n;
            }
        }while( n % 2 == 0);
        System.out.println("Girilen sayılardan 4'ün katlarının toplamı: " + toplam);
    }
}