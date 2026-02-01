
import java.util.*;

public class BSTSamples {

    static class TNode {
        int key;
        TNode left, right;
        TNode(int k) { key = k; }
    }


    static TNode insert(TNode r, int k) {
        if (r == null) return new TNode(k);
        if (k < r.key) r.left = insert(r.left, k);
        else r.right = insert(r.right, k);
        return r;
    }


    static void inorder(TNode r) {
        if (r == null) return;
        inorder(r.left);
        System.out.print(r.key + " ");
        inorder(r.right);
    }

    static TNode delete(TNode r, int k) {
        if (r == null) return null;
        if (k < r.key) r.left = delete(r.left, k);
        else if (k > r.key) r.right = delete(r.right, k);
        else {
            if (r.left == null) return r.right;
            if (r.right == null) return r.left;

        
            TNode s = r.right;
            while (s.left != null) s = s.left;
            r.key = s.key;
            r.right = delete(r.right, s.key);
        }
        return r;
    }


    static void inorderToList(TNode r, List<Integer> out) {
        if (r == null) return;
        inorderToList(r.left, out);
        out.add(r.key);
        inorderToList(r.right, out);
    }

    static TNode buildBalanced(List<Integer> a, int lo, int hi) {
        if (lo > hi) return null;
        int mid = (lo + hi) / 2;
        TNode r = new TNode(a.get(mid));
        r.left = buildBalanced(a, lo, mid - 1);
        r.right = buildBalanced(a, mid + 1, hi);
        return r;
    }

    static TNode mergeBST(TNode r1, TNode r2) {
        List<Integer> a = new ArrayList<>(), b = new ArrayList<>();
        inorderToList(r1, a);
        inorderToList(r2, b);


        List<Integer> m = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.size() && j < b.size())
            m.add(a.get(i) <= b.get(j) ? a.get(i++) : b.get(j++));
        while (i < a.size()) m.add(a.get(i++));
        while (j < b.size()) m.add(b.get(j++));
        return buildBalanced(m, 0, m.size() - 1);
    }
}
