class Solution {
    public boolean validUtf8(int[] data) {
        int c=-1;
        int i=0,j=0;
       while(i<data.length)
       {
         c=check(data[i]);
         if(c==-1) return false;
         else{
                j=i+1;
                for(int k=0;k<c-1; ++k){
                    if(j>=data.length || 192<=data[j] || data[j]<128){
                        return false;
                    }
                    j++;
                }
                i=j;
            
       }
    }
    return true;
    }
    public int check(int data){
        if(0<=data && data<128)
            return 1;
        else if(192<=data && data<224){
            return 2;
        }
        else if(224<=data && data<240){
            return 3;
        }
        else if(240<=data && data<248){
            return 4;
        }
        return -1;
    }
}