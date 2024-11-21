class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        int totalCells = m * n;
        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = 1; // Guard
        }
        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = 2; // Wall
        }

        
        return countUnprotected(grid, totalCells, guards) - walls.length;
    }
    
    public static int countUnprotected(int[][] grid, int totalCells, int[][] guards)
     {
        int m = grid.length, n = grid[0].length;
        int[] directions = {-1, 0, 1, 0, -1}; 
        
        for (int[] guard : guards) {
            int x = guard[0], y = guard[1];
            
            for (int k = 0; k < 4; k++) {
                int dx = directions[k], dy = directions[k + 1];
                int i = x, j = y;
                
               
                while (i + dx >= 0 && i + dx < m && j + dy >= 0 && j + dy < n)
                 {
                    i += dx;
                    j += dy;
                    
                  
                    if (grid[i][j] == 1 || grid[i][j] == 2) break;
                    
                  
                    if (grid[i][j] == 0) {
                        grid[i][j] = -1;
                        totalCells--;
                    }
                }
            }
        }
        
       
        return totalCells - guards.length;
    }
}
