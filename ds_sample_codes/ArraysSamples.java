/*
Arrays - Sample code/pseudocode (Java-style)
Use-case: fixed-size list of employee IDs or salary records.
*/

import java.util.Arrays;

public class ArraysSamples {

    // Basic use
    static void basic() {
        int[] empIds = {1001, 1002, 1003};
        System.out.println(empIds[0]);              // access by index
        for (int id : empIds) System.out.println(id);
    }

    // Sort and Insert (insert by shifting) - returns new array
    static int[] sortAndInsert(int[] empIds, int idx, int val) {
        Arrays.sort(empIds);                        // sort ascending
        int[] a = new int[empIds.length + 1];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i == idx) a[i] = val;
            else a[i] = empIds[j++];
        }
        return a;
    }

    // Add and Delete (delete by shifting left) - returns new array
    static int[] deleteAtIndex(int[] empIds, int idx) {
        int[] b = new int[empIds.length - 1];
        for (int i = 0, j = 0; i < empIds.length; i++) {
            if (i == idx) continue;
            b[j++] = empIds[i];
        }
        return b;
    }

    // Merge (merge 2 sorted arrays)
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
