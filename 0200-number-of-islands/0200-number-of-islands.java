class Node{
    int x;
    int y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public boolean isValid(int i, int j , int n, int m){
        if(i>=0 && i<n && j>=0 && j< m){
            return true;
        }
        return false;
    }

    public void DFS(char[][]grid, boolean[][] visited, int i, int j, int n, int m){
        Stack<Node> stack = new Stack<Node>();
        stack.push(new Node(i,j));

        while(stack.size()>0){
            Node temp = stack.pop();
            int p = temp.x;
            int q = temp.y;

            visited[p][q] = true;

            if(isValid(p+1,q,n,m) && grid[p+1][q] == '1' && visited[p+1][q] == false){
                stack.push(new Node(p+1,q));
            }
            if(isValid(p-1,q,n,m) && grid[p-1][q] == '1' && visited[p-1][q] == false){
                stack.push(new Node(p-1,q));
            }
            if(isValid(p,q+1,n,m) && grid[p][q+1] == '1' && visited[p][q+1] == false){
                stack.push(new Node(p,q+1));
            }
            if(isValid(p,q-1,n,m) && grid[p][q-1] == '1' && visited[p][q-1] == false){
                stack.push(new Node(p,q-1));
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        
        int island = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j] == false && grid[i][j] == '1'){
                    DFS(grid, visited, i, j, n, m);
                    island = island+1;
                }
            }
        }
        return island;
    }
}