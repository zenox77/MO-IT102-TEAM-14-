

import java.util.Arrays;

public class ArraysSamples {


    static void basic() {
        int[] empIds = {1001, 1002, 1003};
        System.out.println(empIds[0]);              
        for (int id : empIds) System.out.println(id);
    }


    static int[] sortAndInsert(int[] empIds, int idx, int val) {
        Arrays.sort(empIds);                       
        int[] a = new int[empIds.length + 1];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i == idx) a[i] = val;
            else a[i] = empIds[j++];
        }
        return a;
    }

 
    static int[] deleteAtIndex(int[] empIds, int idx) {
        int[] b = new int[empIds.length - 1];
        for (int i = 0, j = 0; i < empIds.length; i++) {
            if (i == idx) continue;
            b[j++] = empIds[i];
        }
        return b;
    }


    static int[] mergeSorted(int[] a, int[] b) {
        int[] m = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
            m[k++] = (a[i] <= b[j]) ? a[i++] : b[j++];
        while (i < a.length) m[k++] = a[i++];
        while (j < b.length) m[k++] = b[j++];
        return m;
    }
}
