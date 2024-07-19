class Solution {
    public void gameOfLife(int[][] board) {  
        int m = board.length;  
        int n = board[0].length;  

        int[][] next = new int[m][n];  

        for (int k = 0; k < m; k++) {  
            for (int l = 0; l < n; l++) {  
                int aliveNeighbours = 0;  
                
                // Count alive neighbors  
                for (int i = -1; i <= 1; i++) {  
                    for (int j = -1; j <= 1; j++) {  
                        // Skip the current cell itself  
                        if (i == 0 && j == 0) {  
                            continue;  
                        }  
                        int newRow = k + i;  
                        int newCol = l + j;  
                        // Check bounds  
                        if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {  
                            aliveNeighbours += board[newRow][newCol];  
                        }  
                    }  
                }  

                // Apply the rules of the Game of Life  
                if (board[k][l] == 1) { // Current cell is alive  
                    if (aliveNeighbours < 2 || aliveNeighbours > 3) {  
                        next[k][l] = 0; // Dies  
                    } else {  
                        next[k][l] = 1; // Lives on  
                    }  
                } else { // Current cell is dead  
                    if (aliveNeighbours == 3) {  
                        next[k][l] = 1; // Becomes alive  
                    } else {  
                        next[k][l] = 0; // Stays dead  
                    }  
                }  
            }  
        }  

        // Copy next state back to board  
        for (int k = 0; k < m; k++) {  
            for (int l = 0; l < n; l++) {  
                board[k][l] = next[k][l];  
            }  
        }  
    }  
}  