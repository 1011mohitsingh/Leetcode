class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int excBottles = numBottles / numExchange;
        int avlBottles = excBottles + (numBottles % numExchange);
        int count = numBottles;
        if(numExchange > numBottles){
            count += 0;
        } else {
            count += excBottles;
            while(avlBottles >= numExchange){
                int tempBottles = avlBottles / numExchange;
                count += tempBottles;
                avlBottles = tempBottles+ (avlBottles % numExchange);
            }
        }
        return count;
    }
}
