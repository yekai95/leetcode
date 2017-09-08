package first;
import java.util.Random;
public class p384 {
	private int[] nums = null;
    private Random random = null;
    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums == null) return null;
        int[] a = (int[])nums.clone();
        for(int i = 1; i < nums.length; i++)
        {
            int j = random.nextInt(i + 1);
            swap(a, i, j);
        }
        return a;
    }
    private void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
