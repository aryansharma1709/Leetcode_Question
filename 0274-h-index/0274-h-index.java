class Solution {
    public int hIndex(int[] c) {
       int s=0;
      int e=c.length-1;
      Arrays.sort(c);
      while(s<=e)
      {
        int mid=((e-s)/2)+s;
        if(c[mid]<c.length-mid)
        {
            s=mid+1;
        }
        else
        {
            e=mid-1;
        }
      }
    return c.length-s;   
    }
}