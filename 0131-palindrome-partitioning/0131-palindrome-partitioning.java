class Solution {
    public List<List<String>> partition(String ques) {
        List<List<String>> l=new ArrayList<>();
        List<String> l1=new ArrayList<>();
          partition(ques ,l,l1);
          return l;
    }
     public  void partition(String ques,List<List<String>> l,List<String>l1)
    {
        if(ques.length()==0)
        {
            l.add(new ArrayList(l1));
             return;
        }
        for(int i=1;i<=ques.length();i++)
        {
            String ch = ques.substring(0, i);
            if (ispalindrome(ch))
            {
                l1.add(ch);
                partition(ques.substring(i),l,l1);
                l1.remove(l1.size()-1);
            }
        }
    }
     public  boolean ispalindrome(String n)
    {
        int i=0;
        int j=n.length()-1;
        while(i<j)
        {
            if(n.charAt(i)!=n.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}