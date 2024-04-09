class Solution {
    public int removeDuplicates(int[] nums) {
     int i=1;
     int j=nums[0];
     int c=1;
     while(i<nums.length)
     {
        if(j!=nums[i])
       {
         j=nums[i];
         c=1;
       }
       else if(c==2 && j==nums[i])
       {
         nums[i]=Integer.MAX_VALUE;
       }
       else{
        c++;
       }
       i++;
     }
     Arrays.sort(nums);
     j=0;
    while(j<nums.length)
     {
        if(nums[j]==Integer.MAX_VALUE)
        break;
        j++;
     }
    return j;
    }
}