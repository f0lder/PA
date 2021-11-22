public class fibo {
    public static long fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
       for (int i=0; i<=48; i++)
           System.out.print(fib(i)+",");
   }
   // 2147483647,1836311903
}