package first;

public class p667 {
	public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        for (int i = 0, l = 1, r = n; l <= r; i++)
        res[i] = k > 1 ? (k-- % 2 != 0 ? l++ : r--) : (k % 2 != 0? l++ : r--);
        return res;
    }
}
