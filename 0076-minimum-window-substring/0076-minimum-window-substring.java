class Solution {
    public String minWindow(String s, String t) {
        if(s == null || t == null || s.length() < t.length()) return "";

        Map<Character, Integer> targetMap = new HashMap<>();
        for(char ch :t.toCharArray()){
            targetMap.put(ch, targetMap.getOrDefault(ch,0)+1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        int count = 0;
        int need = targetMap.size();

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right= 0;right<s.length();right++){
            char ch = s.charAt(right);
            windowMap.put(ch, windowMap.getOrDefault(ch,0)+1);

            if(targetMap.containsKey(ch) && windowMap.get(ch).intValue() == targetMap.get(ch).intValue()){
                count++;
            }

            while(count == need){
                if(right-left+1 < minLen){
                    minLen = right-left+1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar)-1);
                if(targetMap.containsKey(leftChar) && windowMap.get(leftChar).intValue() < targetMap.get(leftChar).intValue()){
                    count--;
                }
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(start, start+minLen);
    }
}