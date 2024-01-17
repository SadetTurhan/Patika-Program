import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //initializing array
        int[] myArray = {5,10,15,20,25,30,35,40,45,50};
        //getting input
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen aradığınız index'i giriniz");
        int arananIndex = input.nextInt();
        //try catch block
        try {
            System.out.println(myArray[arananIndex]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}