import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      ///son basamağı bul
        int toplam = 0,a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen basamaklarındaki rakamların toplamını bulmak için bir sayı giriniz: ");
        a = input.nextInt();
        while(a != 0){
            b = a % 10;
            toplam += b;
            a /= 10;

        }
        System.out.println(toplam);
    }
}