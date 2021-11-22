import java.util.Scanner;

public class cautare_secv {
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
        boolean gasit=false;
        for (i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.print(x + " a fost gasit pe pozitia " + (i+1) +"\n");
                gasit=true;
            }
        }
        if(!gasit){
            System.out.print(x+ " nu a fost gasit in vector");
        }
    }
}