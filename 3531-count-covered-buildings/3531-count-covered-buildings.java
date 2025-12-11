class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        HashMap<Integer,int[]> row = new HashMap<>();
        HashMap<Integer, int[]> col = new HashMap<>();
        for(int[]b: buildings){
            int x= b[0], y = b[1];
            if(!row.containsKey(x)){
                row.put(x,new int[]{y,y});
            } else {
                int[] mm = row.get(x);
                mm[0] = Math.min(mm[0],y);
                mm[1] = Math.max(mm[1],y);
            }
            if(!col.containsKey(y)){
                col.put(y,new int[]{x,x});
            } else {
                int[] mm = col.get(y);
                mm[0] = Math.min(mm[0],x);
                mm[1] = Math.max(mm[1],x);
            }
        }
        int count = 0;
        for(int b[]:buildings){
            int x = b[0],y= b[1];
            int r[] = row.get(x);
            int c[] = col.get(y);
            if(x > c[0] && x < c[1] && y > r[0] && y < r[1]) count++;
        }
        return count;
    }
}