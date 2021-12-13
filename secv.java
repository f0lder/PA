
import java.io.*;
//Complexitate: O(n) deoarece trebuie inspectate toate elementele vectorului
//Complexitatea se poate micsoara la O(n*log n) daca sunt proprietati pe datele de intrareimport java.io.*;
class secv {
  public static void main(String args[])
        {
          String line = null;
      int x=0;
      int a[]={1,3,5,7,9,10,21,1,6,1,1};
      int i;
      System.out.println("Dati elementul x ");
      try
      {
          BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
          line = is.readLine();
          x = Integer.parseInt(line);
        }
        catch (NumberFormatException ex)
        {
          System.err.println("Not a valid number: " + line);
        }
        catch (IOException e)
        {
          System.err.println("Unexpected IO ERROR: " + e);
        }
        //================================================
        boolean gasit= false;
            i = 0;
            while (i < a.length)
            {
              if(a[i] == x){
                gasit= true;
                System.out.println("Numarul cautat se afla in sir pe pozitia " + i);
              }
                i = i + 1;
            }
            if(!gasit) System.out.print("Nr nu a fost gasit");
        }
}