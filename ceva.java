public class ceva {
    public static void main(String args[]) {
        int[][] t = { { 2, 3, 3 }, { 2, 1 }, { 3, 1, 3, 3 } };
        int x = 0;
        count: for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] == 3) {
                    x++;
                    continue count;
                }
            }
        }
        System.out.println(x);

        for (int i = 0; i < 3; ++i)
            System.out.print((i % 2) * 3);
        System.out.println("\n");
        for (int i = 0; i < 3; ++i)
            System.out.print((i * 2) % 3);
        System.out.println("\n");
        for (int i = 0; i < 3; ++i)
            System.out.print((i * 3) % 2);
        System.out.println("\n");
        for (int i = 0; i < 3; ++i)
            System.out.print((i % 3) * 2);
        System.out.println("\n");
        for (int i = 0; i < 3; ++i)
            System.out.print(i * (2 % 3));
            System.out.println("\n");
            String f = "dadada";
            System.out.println(f.length());

        int[] as = new int[5];
        System.out.println(as[4]);
        double[] a = new double[4];
        System.out.println(++x);

        
    }
    
}