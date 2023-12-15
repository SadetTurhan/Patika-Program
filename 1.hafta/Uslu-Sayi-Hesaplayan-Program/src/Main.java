import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler
        int n,k,total = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Üssü alınacak sayı: ");
        n = input.nextInt();

        System.out.println("Üs olacak sayı: ");
        k = input.nextInt();

        for(int i = 1;i <= k;i++){
            total *= n;
        }

        System.out.println("Cevap: " + total);
    }
}