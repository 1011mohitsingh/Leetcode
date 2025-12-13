class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> result = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<code.length;i++){
            if(code[i].matches("[a-zA-Z0-9_]+")){
                if((businessLine[i].equals("electronics") || businessLine[i].equals("grocery") || businessLine[i].equals("pharmacy") || businessLine[i].equals("restaurant")) && isActive[i]){
                    if(map.containsKey(businessLine[i])){
                        map.get(businessLine[i]).add(code[i]);
                    } else {
                        map.put(businessLine[i],new ArrayList<>());
                        map.get(businessLine[i]).add(code[i]);
                    }
                }
            }
        }
        String businessLineOrder[] = {"electronics","grocery","pharmacy","restaurant"};
        int startIndex = 0;
        for(int i=0;i<businessLineOrder.length;i++){
            List<String> tempList = map.get(businessLineOrder[i]);
                if(tempList != null){
                    for(String val:tempList){
                        result.add(val);
                    }
                }
            Collections.sort(result.subList(startIndex,result.size()));
            startIndex = result.size();
        }
        return result;
    }
}