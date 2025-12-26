class Solution {
    public int bestClosingTime(String customers) {
        int totalY = 0, openN = 0, minPenaltyIndex =0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i) == 'Y'){
                totalY++;
            }
        }
        int remainingY = totalY, minPenalty = totalY;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i) == 'N'){
                openN++;
            }else{
                remainingY--;
            }
            if(minPenalty > (openN+remainingY)){
                minPenalty = (openN+remainingY);
                minPenaltyIndex = i+1;
            }
        }
        return minPenaltyIndex;
    }
}