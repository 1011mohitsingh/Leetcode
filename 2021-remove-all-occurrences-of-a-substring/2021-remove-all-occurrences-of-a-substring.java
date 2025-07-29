class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();

        int partLength = part.length();
        for(char ch : s.toCharArray()){
            sb.append(ch);

            if(sb.length() >= partLength && sb.substring(sb.length()-partLength).equals(part)){
                sb.delete((sb.length()-partLength),sb.length());
            }
        }
        return sb.toString();
    }
}


// class Solution {
//     public String removeOccurrences(String s, String part) {
//         if(!s.contains(part)){
//             return s;
//         }

//         String result = s.replaceFirst(part , "");
//         return removeOccurrences(result , part); 
//     }
// }