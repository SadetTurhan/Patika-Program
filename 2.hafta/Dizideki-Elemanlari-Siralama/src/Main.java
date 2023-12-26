import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizinin boyutunu kullanıcıdan al
        System.out.print("Dizinin boyutunu girin: ");
        int size = scanner.nextInt();

        // Diziyi oluştur
        int[] array = new int[size];

        // Dizinin elemanlarını kullanıcıdan al
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(array);

        // Sıralanmış diziyi ekrana yazdır
        System.out.println("Sıralama: " + Arrays.toString(array));
    }
}