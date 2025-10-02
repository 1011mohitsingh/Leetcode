class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int fullBottles = 0;
        int emptyBottles = numBottles;
        int bottlesDrunk = numBottles;
        while(true){
            while(emptyBottles >= numExchange){
                fullBottles++;
                emptyBottles -= numExchange;
                numExchange++;
            }
            emptyBottles += fullBottles;
            bottlesDrunk += fullBottles;
            fullBottles = 0;

            if(fullBottles == 0 && emptyBottles < numExchange){
                break;
            }
        }
        return bottlesDrunk;
    }
}