import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.println("n2 sayısını giriniz: ");
        int n2 = input.nextInt();
        int ebob = 1;
        int k = n1;
        while(k >= 1){
            if(n1 % k == 0 && n2 % k == 0){
                ebob = k;
                System.out.println("En büyük ortak bölen(ebob): " + ebob);
                break;
            }
            k--;
        }
        int i = n1;
        while(i <= (n1 * n2)){
            if(i % n1 == 0 && i % n2 == 0){
                System.out.println("En küçük ortak kat(ekok): " + i);
                break;
            }
            i += n1;
        }
    }
}