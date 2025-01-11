class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int totalfuel=0;
       int totalcost=0;
       int startidx=0;
       int carfuel=0;
     for(int i=0;i<gas.length;i++)
     {
        totalfuel+=gas[i];
        totalcost+=cost[i];
        carfuel+=(gas[i]-cost[i]);
        if(carfuel<0)
        {
            startidx=i+1;
            carfuel=0;
        }
     }
     return totalfuel>=totalcost?startidx:-1;
 }
}