import java.util.Scanner;


public class Main {
    public static void power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü Alınacak sayıyı giriniz : ");
        int a = input.nextInt();

        System.out.print("Üssü giriniz : ");
        int b = input.nextInt();
        int result = 1;

        for (int i = 1; i <= b; i++){
            result *= a;
        }

        System.out.println("Sonuç : " + result);

    }

    public static void main(String[] args) {
        power();
    }
}