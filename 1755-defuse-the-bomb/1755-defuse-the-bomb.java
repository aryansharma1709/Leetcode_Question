class Solution {
    public int[] decrypt(int[] code, int k) {
        int ans[]=new int[code.length];
        if(k==0)
        {
            for(int i=0;i<code.length;i++)
            ans[i]=0;
        }
        else if(k>0)
        {
            int i=0;
            while(i<code.length)
            {
                int sum=0;
                int j=i+1;
                int a=k;
                while(a-->0)
                {
                    j=j%code.length;
                    sum+=code[j];
                    j++;
                }
                ans[i]=sum;
                i++;
            }
        }
        else {
           int i=0;
           while(i<code.length) 
           {
            int sum=0;
            int j=i-1;
            int a=-k;
            while(a-->0)
            {
                j=j%code.length;
                if(j<0)
                j=code.length-1;
                sum+=code[j];
                j--;
            }
            ans[i]=sum;
            i++;
           }
        }
        return ans;
    }
}