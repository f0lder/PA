
// Java program to demonstrate working of HashTable
import java.util.*;

public class hash {
    public static void main(String args[]) {

        // Create a HashTable to store
        // String values corresponding to integer keys
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

        // Input the values
        hm.put(1, "Geeks");
        hm.put(12, "forGeeks");
        hm.put(15, "Z computer");
        hm.put(3, "Portal");

        System.out.println(hm);
        hm.remove(12);

        System.out.println(hm);

        hm.replace(3,"Valoare noua");
        // Printing the Hashtable
        System.out.println(hm);
    }
}
