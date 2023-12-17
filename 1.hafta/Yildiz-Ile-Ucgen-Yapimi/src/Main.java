import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //girdi alma
        Scanner input = new Scanner(System.in);
        System.out.println("basamak sayısını giriniz: ");
        int n = input.nextInt();

        //derste gösterilen kod
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i) - 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        // bu sefer yukarıdaki döngünün tersini(i değerini küçülterek) yapıyoruz.
        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            //bastırılacak yıldızların fonksiyonu yukarıda yazılan ile aynı
            for(int j = 1; j <= (2*i) - 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}