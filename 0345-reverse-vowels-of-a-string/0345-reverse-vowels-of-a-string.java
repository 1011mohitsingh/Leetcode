class Solution {
    public boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            if(isVowel(arr[left]) && isVowel(arr[right])){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }else if(isVowel(arr[left])){
                right--;
            } else {
                left++;
            }
        }
        String result = new String(arr);
        return result;
    }
}