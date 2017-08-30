package first;

import java.util.Arrays;

public class p215 {
	public int partition(int[] nums, int left, int right)
    {
        int pivot = nums[left];
        while (left < right)
        {
            while (left < right && nums[right] <= pivot)
            right--;
            nums[left] = nums[right];
            while (left < right && nums[left] > pivot)
            left++;
            nums[right] = nums[left];
        }
        nums[left] = pivot; 
        return left;
    }
    public int findKthLargest(int[] nums, int k)
    {
        int left = 0;
        int right = nums.length- 1;                
        while (true)
        {
            int pivotIndex = partition(nums, left, right);
            if (k - 1 == pivotIndex)
                return nums[pivotIndex];
            else if (k - 1 < pivotIndex)
                right = pivotIndex - 1;
            else
                left = pivotIndex + 1;
        }
    }
}
