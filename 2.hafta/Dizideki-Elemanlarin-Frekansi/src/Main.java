import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[dizi.length];
        int[] counts = new int[dizi.length];
        int startIndex = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    int count = 2;
                    if (!isFind(duplicate, dizi[i])) {
                        duplicate[startIndex] = dizi[i];
                        for (int k = j + 1; k < dizi.length; k++) {
                            if (dizi[i] == dizi[k]) {
                                count++;
                            }
                        }
                        counts[startIndex] = count;
                        startIndex++;
                    }
                    break;
                }
            }
        }

        for (int i = 0; i < startIndex; i++) {
            System.out.println(duplicate[i] + " sayısı " + counts[i] + " kere tekrar edildi");
        }
    }
}