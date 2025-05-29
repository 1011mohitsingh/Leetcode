class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n+1];
        result[0] = 1;
        return result;
    }
    
}


// 

// import java.util.*;
// import java.math.BigInteger;

// class Solution {
//     public int[] plusOne(int[] digits) {
//         BigInteger sum = BigInteger.ZERO;

//         for(int i=0;i<digits.length;i++){
//             sum = sum.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
//         }
//         sum = sum.add(BigInteger.ONE);
//         String numSum = sum.toString();
//         int [] result = new int[numSum.length()];

//         for(int i=0;i<numSum.length();i++){
//             result[i] = numSum.charAt(i) - '0';
//         }
//         return result;
//     }
// }

