    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
        int i=0;
        int j=0;
        List<Integer> l=new ArrayList<>();
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                l.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
               i++;
            else
            j++;
        }
        int [] a=new int[l.size()];
          for(int k=0;k<l.size();k++)
          {
            a[k]=l.get(k);
          }
          return a;
        }
    }