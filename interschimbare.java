import java.util.Scanner;

public class interschimbare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scan.nextInt();// citim n
        int[] a = new int[n];// initializam vect cu n elemente
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = scan.nextInt();// citim cele n elemente
        }
        scan.close();

        System.out.println("Vectorul inainte de sortare:");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        for (i = 0; i <= n - 2; i++) {
            for (j = i + 1; j <= n - 1; j++) {
                if (a[i] > a[j]) {
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        System.out.println("\nVectorul dupa sortare:");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
