package first;

public class p321 {
	private int[] max(int[] nums, int k) {  
        int[] max = new int[k];  
        for(int i=0, j=0; i<nums.length; i++) {  
            while (j>0 && k-j<nums.length-i && max[j-1]<nums[i]) j--;  
            if (j<k) max[j++] = nums[i];  
        }  
        return max;  
    }  
    private int[] merge(int[] nums1, int[] nums2) {  
        int[] merged = new int[nums1.length+nums2.length];  
        for(int i=0, j=0, m=0; m<merged.length; m++) {  
            merged[m] = greater(nums1, i, nums2, j) ? nums1[i++] : nums2[j++];  
        }  
        return merged;  
    }  
    private boolean greater(int[] nums1, int i, int[] nums2, int j) {  
        while (i<nums1.length && j<nums2.length && nums1[i]==nums2[j]) {  
            i++;  
            j++;  
        }  
        return j==nums2.length || (i<nums1.length && nums1[i]>nums2[j]);  
    }  
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {  
        int[] max = null;  
        for(int i=Math.max(k-nums2.length, 0); i<=Math.min(nums1.length, k); i++) {  
            int[] merged = merge(max(nums1, i), max(nums2, k-i));  
            if (max == null || greater(merged, 0, max, 0)) max = merged;  
        }  
        return max;  
    }  
}
