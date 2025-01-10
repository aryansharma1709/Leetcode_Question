
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2){
        List<String> l=new ArrayList<>();
        int [] target=new int[26];
        for(String word:words2)
        {
            int[]temp=new int[26];
            for(char ch:word.toCharArray())
            {
                temp[ch-'a']++;
                 target[ch-'a']=Math.max(target[ch-'a'],temp[ch-'a']); 
            }
        }
        for(String word:words1)
        {
            int [] parent= new int[26];
            for(char ch:word.toCharArray())
            {
                parent[ch-'a']++;
            }
            if(check(parent,target))
            {
                l.add(word);
            }
        }
        return l;
    }
    public boolean check(int[]p,int[]t)
    {
        for(int i=0;i<26;i++)
        {
            if(p[i]<t[i])return false;
        }
        return true;
    }
}
