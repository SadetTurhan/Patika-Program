import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int heat;

       Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz: ");
        heat = input.nextInt();

        if (heat > 25){
            System.out.println("yüzmeye gidebilirsiniz.");
        }else if (heat <= 25){
            if(heat >= 5 && heat <= 15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if(heat >= 10){
                System.out.println("Pinkiğe gidebilirsiniz.");
            }
            if(heat < 5){
                System.out.println("Kayak yapabilirsiniz");
            }
        }
    }
}