class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum_single =0;
        int sum_double=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>9)
            {
                sum_double+=nums[i];
            }
            else{
                sum_single+=nums[i];
            }
        }
        if(sum_double ==sum_single)
           return false;
        return true;
    }
}