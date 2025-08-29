class Solution {
    public int[][] sortMatrix(int[][] grid) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int key = i-j;
                map.putIfAbsent(key, 
                key >= 0 ? new PriorityQueue<>(Collections.reverseOrder()) 
                             : new PriorityQueue<>());
                map.get(key).add(grid[i][j]);
            }
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int key = i-j;
                grid[i][j] = map.get(key).poll();
            }
        }
        return grid;
    }
}

// class Solution {
//     public int[][] sortMatrix(int[][] grid) {
//         HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
//         for (int i = 0; i < grid.length; i++) {
//             for (int j = 0; j < grid[0].length; j++) {
//                 int key = i - j;
//                 map.putIfAbsent(key, new ArrayList<>());
//                 map.get(key).add(grid[i][j]);
//             }
//         }
//         for (int key : map.keySet()) {
//             ArrayList<Integer> list = map.get(key);
//             if (key < 0) { 
//                 Collections.sort(list);
//             } else { 
//                 Collections.sort(list, Collections.reverseOrder());
//             }
//         }
//         for (int i = 0; i < grid.length; i++) {
//             for (int j = 0; j < grid[0].length; j++) {
//                 int key = i - j;
//                 grid[i][j] = map.get(key).remove(0);
//             }
//         }
//         return grid;
//     }
// }
