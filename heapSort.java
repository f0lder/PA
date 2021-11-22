
//Complexitate: Nefavorabil: O(n*log n); Mediu: O(n*log n); Favorabil: O(n*log n)
public class heapSort {
    public static void heapify(int v[], int root, int bottom) {
        int maxChild, aux;
        boolean done;
        done = false;
        while ((root * 2 <= bottom) && (!done)) {
            if (root * 2 == bottom)
                maxChild = root * 2;
            else if (v[root * 2] > v[root * 2 + 1])
                maxChild = root * 2;
            else
                maxChild = root * 2 + 1;
            if (v[root] < v[maxChild]) {
                System.out.println("v[root] = " + v[root] + " v[maxChild] = " + v[maxChild]+ " root= " + root  +" maxChild= " + maxChild);
                aux = v[root];
                v[root] = v[maxChild];
                v[maxChild] = aux;
                root = maxChild;
            } else
                done = true;
        }
    }

    public static void HeapSort(int v[], int len) {
        int i, aux;
        for (i = (len / 2) - 1; i >= 0; i--)
            heapify(v, i, len);
        for (i = len - 1; i >= 1; i--) {
            aux = v[0];
            v[0] = v[i];
            v[i] = aux;
            heapify(v, 0, i - 1);
        }
    }

    public static void main(String args[]) {
        int a[] = {4, 5, 0, 6, 3, 7, 1, 8, 9, 2};
        int i;

        HeapSort(a, 10);
        for (i = 0; i < 10; i++)
            System.out.println(a[i] + " ");
    }
}