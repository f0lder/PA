//Complexitate: O(n) deoarece trebuie inspectate toate elementele vectorului
//Complexitatea se poate micsoara la O(n*log n) daca sunt proprietati pe datele de intrareimport java.io.*;
class CautareSecventialaJAVA {
  public static void main(String args[]
        {
          String line = null;
      int x=0;
      int a[]={1,3,5,7,9};
      int I;
      System.out.println(“Dati elementul x “);
      try
      {
          BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
          line = is.readLine();
          x = Integer.parseInt(line);
        }
        catch (NumberFormatException ex)
        {
          System.err.println(“Not a valid number: ” + line);
        }
        catch (IOException e)
        {
          System.err.println(“Unexpected IO ERROR: ” + e);
        }
        //================================================
            i = 1;
            while (i <= 5 && a[i] != x)
            {
                i = i + 1;
            }
            if (i <= 5)
                System.out.println(“Numarul cautat se afla in sir pe pozitia ” + i);
            else
                System.out.println(“Numarul cautat nu se afla in sir”);
        }
}