class Solution {
    public boolean checkValidString(String s) {
       int n= s.length();
       int sum=0;
       int star=0;
       int left=0;
       for(int i=0;i<n;i++)
       {
         if(s.charAt(i)=='(')
           {
            left++;
            sum++;
           }
         else if(s.charAt(i)==')')
         { 
            left=Math.max(left-1,0);
            sum--;
         }
          else
          {
             left=Math.max(left-1,0);
            sum++;
          }
          if(sum<0) return false;
       }

       return left==0;
    }
}