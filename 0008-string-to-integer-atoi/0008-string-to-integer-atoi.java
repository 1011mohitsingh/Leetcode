class Solution {
    public int myAtoi(String s) {
        String temp = s.trim();
        if(temp.isEmpty()){
            return 0;
        }

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();

        boolean isNegative = false;
        int i = 0;
        if(temp.charAt(0) == '-'){
            isNegative = true;
            i++;
        } else if(temp.charAt(0) == '+'){
            i++;
        }

        for(;i<temp.length();i++){
            if(Character.isDigit(temp.charAt(i))){
                sb.append(temp.charAt(i));
            } else {
                break;
            }
        }

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        if(sb.length() == 0){
            return 0;
        }

        long result = 0;
        for (int j = 0; j < sb.length(); j++) {
            int digit = sb.charAt(j) - '0';
            result = result * 10 + digit;

            if (!isNegative && result > max) {
                return max;
            } else if (isNegative && -result < min) {
                return min;
            }
        }

        return isNegative ? (int) -result : (int) result;
    }
}