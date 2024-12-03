class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str=new StringBuilder();
        int n=spaces.length;
        int j=0;
        int i=0;
        while(i<spaces[n-1])
        {
            if(spaces[j]==i)
            {
                str.append(" ");
                str.append(s.charAt(i));
                j++;
            }
            else{
               str.append(s.charAt(i));  
            }
           i++; 
        }
         str.append(" ");
        while(i<s.length())
        {
            str.append(s.charAt(i));
            i++;
        }
        return str.toString(); 
    }
}