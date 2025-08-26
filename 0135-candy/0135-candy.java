class Solution {
    public int candy(int[] ratings) {
        int candyArr[] = new int[ratings.length];
        Arrays.fill(candyArr, 1);

        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                candyArr[i] = candyArr[i-1]+1;
            }
        }

        int sum = candyArr[candyArr.length-1];

        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candyArr[i] = Math.max(candyArr[i], candyArr[i+1]+1);
            }
            sum += candyArr[i];
        }
        return sum;
    }
}