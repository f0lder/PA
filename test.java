import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("ok");
        int s = 0, n = 50, pas = 5, i = 0;
        System.out.print("n = ");
        n = scan.nextInt();

        System.out.print("pasul = ");
        pas = scan.nextInt();

        System.out.print("i (punct de start) = ");
        int init = scan.nextInt();
        scan.close();
        for (i = init; i <= n; i += pas) {
            s += i;
        }
        System.out.println(s);

        i = init;
        s = 0;
        do {
            s += i;
            i += pas;
        } while (i <= n);
        System.out.println(s);

        s = 0;
        i = init;
        while (i <= n) {
            s += i;
            i += pas;
        }
        System.out.println(s);
    }
}
// Tema cum introducem valori de la tastatura? cate el are vectorul, in mod
// repetat el din vector. Se incheie cu afisarea vect
// Fie pt ex test.java fie pentru una din sortarile discutate