import java.util.*;
import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger sum = BigInteger.ZERO;

        for(int i=0;i<digits.length;i++){
            sum = sum.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
        }
        sum = sum.add(BigInteger.ONE);
        String numSum = sum.toString();
        int [] result = new int[numSum.length()];

        for(int i=0;i<numSum.length();i++){
            result[i] = numSum.charAt(i) - '0';
        }
        return result;
    }
}