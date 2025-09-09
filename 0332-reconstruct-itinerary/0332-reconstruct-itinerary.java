class Solution {
    LinkedList<String> result = new LinkedList<>();
    HashMap<String, PriorityQueue<String>> map = new HashMap<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for(int i=0;i<tickets.size();i++){
            String from = tickets.get(i).get(0);
            String to = tickets.get(i).get(1);

            if(map.containsKey(from)){
                map.get(from).add(to);
            } else {
                map.put(from , new PriorityQueue<>());
                map.get(from).add(to);
            }
        }

        dfs("JFK");
        return result;
    }

    private void dfs(String airport){
        PriorityQueue<String> dests = map.get(airport);

        while(dests != null && !dests.isEmpty()){
            String next = dests.poll();
            dfs(next);
        }
        result.addFirst(airport);
    }
}