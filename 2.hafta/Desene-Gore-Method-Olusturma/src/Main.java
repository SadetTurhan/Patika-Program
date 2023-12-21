import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int n = input.nextInt();
        methodByPattern(n,n,true);
    }
    public static void methodByPattern(int a,int b,boolean isDecreasing){
        if(a > 0 && isDecreasing){
            System.out.println(a + " ");
            methodByPattern(a - 5,b,true);
        }else {
            if (a <= b) {
                System.out.println(a + " ");
                methodByPattern(a + 5, b, false);
            }
        }
    }
}