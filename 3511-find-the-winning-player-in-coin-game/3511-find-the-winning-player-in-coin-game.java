class Solution {
    public String losingPlayer(int x, int y) {
        int i=(y/4);
        if(i>x)
        {
            if(x%2==0)
            return "Bob";
            else
            return "Alice";
        }
        else if(i%2!=0)
        {
            return "Alice";
        }
        return "Bob";     
}
}