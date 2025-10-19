class Solution {
    public String rotate(String s, int b){
        int n = s.length();
        String a = s.substring(n-b);
        String c = s.substring(0,n-b);
        return a+c;
    }
    public String add(String s, int a){
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i%2 != 0){
                int digit = arr[i]-'0';
                int newDigit = (digit + a) % 10;
                arr[i] = (char) (newDigit+'0');
            }
        }
        return new String(arr);
    }
    public String findLexSmallestString(String s, int a, int b) {
        Queue<String> q = new LinkedList<>();
        HashSet<String> set = new HashSet<>();
        q.add(s);
        set.add(s);

        String smallest = s;
        while(!q.isEmpty()){
            String curr = q.poll();
            if (curr.compareTo(smallest) < 0) {
                smallest = curr;
            }
            String added = add(curr,a);
            if(!set.contains(added)){
                set.add(added);
                q.add(added);
            }

            String rotated = rotate(curr, b);
            if(!set.contains(rotated)){
                set.add(rotated);
                q.add(rotated);
            }
        }
        return smallest;
    }
}