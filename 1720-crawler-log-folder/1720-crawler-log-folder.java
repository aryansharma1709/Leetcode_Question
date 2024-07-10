class Solution {
    public int minOperations(String[] logs) {
        int c=0;
        for(int i=0;i<logs.length;i++)
        {
            if(c>0 && logs[i].equals("../"))
            {
              c--;
            }
            else if(!(logs[i].equals("./")) && !(logs[i].equals("../")))
            {
                c++;
            }
        }
 return c;
    }
}