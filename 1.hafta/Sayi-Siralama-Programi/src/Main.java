import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler
        int a,b,c;
        //girdi alma
        Scanner input = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz: ");
        a = input.nextInt();

        System.out.println("2. sayıyı giriniz: ");
        b = input.nextInt();

        System.out.println("3. sayıyı giriniz: ");
        c = input.nextInt();

        //koşulları kurma
        if((a > b) && (a > c)){
            if(b > c){
                System.out.println(c + " < " + b + " < " + a);
            }else{
                System.out.println(b + " < " + c + " < " + a);
            }
        }else if((b > a) && (b > c)){
            if(a > c){
                System.out.println(c + " < " + a + " < " + b);
            }else{
                System.out.println(a + " < " + c + " < " + b);
            }
        }else if ((c > a) && (c > b)){
            if(a > b){
                System.out.println(b + " < " + a + " < " + c);
            }else{
                System.out.println(a + " < " + b + " < " + c);
            }
        }

    }
}