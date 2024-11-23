class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m=box.length;
        int n=box[0].length;
        char[][] boxR=new char[n][m];
         for(int i=boxR.length-1;i>=0;i--)
		{
		    for(int j=boxR[0].length-1;j>=0;j--)
		    {
		        boxR[i][j]='.';
		    }
		   
		}
        
        int y=0;
        int x;
        for(int i=m-1;i>=0;i--)
        {
             x=n-1;
            for(int j=n-1;j>=0;j--)
            {
                if(box[i][j]=='#')
                {
                    boxR[x][y]=box[i][j];
                    x--;
                }
                else if(box[i][j]=='*')
                {
                    x=j;
                    boxR[x][y]=box[i][j];
                    x--;
                }
            }
            y++;
            
        }
       
        return boxR;
    }
}