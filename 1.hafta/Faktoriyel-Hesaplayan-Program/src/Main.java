import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişken
        int k,n;
        //girdi alma
        Scanner input = new Scanner(System.in);
        System.out.println("kümenin eleman sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("Grup eleman sayısını giriniz: ");
        k = input.nextInt();
        /* Pratikte faktöriyel için gösterilen kısım
        for(int i = 1;i <= n;i++){
            total = total * i;
        }
        System.out.println(n+ ". faktöriyeli: " + total);
        */
        long pay = 1;
        long payda = 1;

        if( k < n && k > 0){
            //n! / k!'yi hesapla
            for(int i = n;i > k; i--){
                pay *= i;
            }
            //n! - k!yı hesapla
            for(int j = 1; j <= (n - k);j++){
                payda *= j;
            }
            //C(n, r) = n! / (r! * (n-r)!)'yı hesapla
            System.out.println(pay/payda);
        }else{
            System.out.println("2inci sayı 1inciden küçük ve 0'dan büyük olmalıdır!");
        }

    }
}