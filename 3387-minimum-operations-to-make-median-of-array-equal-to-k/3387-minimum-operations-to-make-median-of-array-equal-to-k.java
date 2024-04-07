class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
           Arrays.sort(nums);
        int n = nums.length;
        int medianIndex = n / 2;
        long operations = 0;

        
        if (nums[medianIndex] == k) {
            return 0;
        }

       
        if (nums[medianIndex] > k) {
            for (int i = medianIndex; i >= 0; i--) {
                if (nums[i] >= k) {
                    operations += nums[i] - k;
                } else {
                    break;
                }
            }
        }
       
        else {
            for (int i = medianIndex; i < n; i++) {
                if (nums[i] <= k) {
                    operations += k - nums[i];
                } else {
                    break;
                }
            }
        }

        return operations;
    }
}