class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        int mentions[] = new int[numberOfUsers];
        Map<Integer, Integer> offline = new HashMap<>();
        Collections.sort(events, (e1, e2) ->{
            int t1 = Integer.parseInt(e1.get(1));
            int t2 = Integer.parseInt(e2.get(1));
            if(t1 != t2) return Integer.compare(t1,t2);
            if(e1.get(0).equals(e2.get(0))) return 0;
            if (e1.get(0).equals("OFFLINE")) return -1;
            return 1;
        });
        int timeStamp = 0;

        for(int i=0;i<events.size();i++){
            timeStamp = Integer.parseInt(events.get(i).get(1));

            if("MESSAGE".equals(events.get(i).get(0))){
                String target = events.get(i).get(2);
                if("ALL".equals(target)){
                    for(int k=0;k<mentions.length;k++) mentions[k]++;
                }else if("HERE".equals(target)){
                    for(int k=0;k<mentions.length;k++) mentions[k]++;
                    Iterator<Map.Entry<Integer,Integer>> it = offline.entrySet().iterator();
                    while(it.hasNext()){
                        Map.Entry<Integer, Integer> en = it.next();
                        int userId = en.getKey();
                        int expiry = en.getValue();
                        if(expiry > timeStamp){
                            if(userId >= 0 && userId < mentions.length) mentions[userId] -= 1;
                        } else {
                            it.remove();
                        }                 
                    }
                }else{
                    String[] tokens = target.split("\\s+");
                    for(String tok:tokens){
                        if(tok.startsWith("id")){
                            try {
                                int id = Integer.parseInt(tok.substring(2));
                                if (id >= 0 && id < mentions.length) mentions[id]++;
                            } catch (NumberFormatException ignored) {
                            }
                        } else {
                            try {
                                int id = Integer.parseInt(tok);
                                if (id >= 0 && id < mentions.length) mentions[id]++;
                            } catch (NumberFormatException ignored) {}
                        }
                    }
                }
            }else{
                if(events.get(i).size() >=3){
                    int userId = Integer.parseInt(events.get(i).get(2));
                    offline.put(userId, timeStamp+60);
                }
            }
        }
        return mentions;
    }
}