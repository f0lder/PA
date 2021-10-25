import java.util.Scanner;

public class selectie {
    public static void SelectionSort(int n, int v[]) {
        for (int i = 0; i < n; i++) {
            int max = i;
            int aux;
            for (int j = i + 1; j < n; j++)
                if (v[max] > v[j])
                    max = j;
            aux = v[max];
            v[max] = v[i];
            v[i] = aux;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = scan.nextInt();
        }
        scan.close();
        int i;
        SelectionSort(n, a);
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
