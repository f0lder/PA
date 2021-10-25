
import java.util.Scanner;

public class countingSort {
    public static void sort(int[] a) {
        if (a.length == 0)
            return;
        int max = a[0], min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            else if (a[i] < min)
                min = a[i];
        }
        int numValues = max - min + 1;

        int[] counts = new int[numValues];
        for (int i = 0; i < a.length; i++) {
            counts[a[i] - min]++;
        }

        int outputPos = 0;
        for (int i = 0; i < numValues; i++) {

            for (int j = 0; j < counts[i]; j++) {
                a[outputPos] = i + min;
                outputPos++;
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("n = ");
        n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scan.nextInt();
        }
        scan.close();
        sort(a);

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

}