import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //girdi değişkeni
        int n;
        //kullanıcıdan girdi alma
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç basamaklı bir ters üçgen istersiniz? ");
        n = input.nextInt();
        //ters yıldızı oluşturacak for döngüsü
        for(int i = n ; i >= 1; i--){
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i) - 1; j++){
                System.out.print("*");
            }
            //her döngüden sonra boşluk bırakması için eklenmiş sout komutu
            System.out.println();
        }
    }
}