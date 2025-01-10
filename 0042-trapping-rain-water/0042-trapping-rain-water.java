class Solution {
    public int trap(int[] height) {

        return trapping(height);
        
    }
      public static int trapping(int []a)
    {
        int left =0;
        int right=a.length-1;
        int sum=0;
        int leftmax=0;
        int rightmax=0;
        while(left<right)
        {
           if(a[left]<a[right])
           {
             if(a[left]>=leftmax)
             {
                leftmax=a[left];
             }
             else
             sum+=leftmax-a[left];
             left++;
           }
           else
           {
             if(a[right]>=rightmax)
             {
                rightmax=a[right];
             }
             else
             sum+=rightmax-a[right];
             right--;
           }
        }
        return sum;
    }
}