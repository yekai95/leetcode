package first;

public class p338 {
	public int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        int base = 1;
        while(base <= num)
        {
            int next = base *2;
            for(int i = base;i<next && i<=num;i++)
            result[i] = result[i-base]+1;
            base = next;
        }
        return result;
    }
}
