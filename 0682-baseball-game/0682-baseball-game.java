class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                if(list.size() >= 2){
                    int temp = list.get(list.size()-1)+ list.get(list.size()-2);
                    list.add(temp);
                }  
            } else if(operations[i].equals("D")){
                if(list.size() >= 1){
                    list.add((list.get(list.size()-1)*2));
                }
            } else if(operations[i].equals("C")){
                list.remove(list.size()-1);
            } else {
                list.add(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        for(int lists: list){
            sum += lists;
        }
        return sum;
    }
}