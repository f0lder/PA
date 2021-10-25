import java.util.Scanner;

public class cautare_binara {
    public static int binary_s(int[] a, int x) {
        int low = 0;
        int high = a.length;
        int i= Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] < x)
                low = mid + 1;
            else if (a[mid] > x)
                high = mid - 1;
            else if(a[mid] == x){
                i = mid;
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scan.nextInt();// citim n
        int[] a = new int[n];// initializam vect cu n elemente
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = scan.nextInt();// citim cele n elemente
        }
        System.out.print("cautat = ");
        int x = scan.nextInt();
        scan.close();
        System.out.print(binary_s(a,x));
    }
}
