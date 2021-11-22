import java.util.Scanner;

public class insertion {
    public static void InsertionSort(int length, int array[]) {
        int i, j;
        int key;
        for (i = 1; i <= length; i++) {
            key = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("n = ");
        n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = scan.nextInt();
        }
        scan.close();
        int i;
        InsertionSort(n-1, a);
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}