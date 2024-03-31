class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty_bottle=0;
        int drink_bottle=0;
         empty_bottle=numBottles;
           drink_bottle=numBottles;
           numBottles=0;
       while((empty_bottle+numBottles)>=numExchange)
       {
          
           if(empty_bottle>=numExchange)
           {
               empty_bottle-=numExchange;
                numBottles+=1;
               numExchange+=1;
              }
            else
           {
               empty_bottle+=numBottles;
               drink_bottle+=numBottles;
                numBottles=0;
           }
       }
         
           drink_bottle+=numBottles;
        return drink_bottle;
    }
}