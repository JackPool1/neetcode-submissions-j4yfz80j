class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char val = board[i][j];
                if(val != '.'){
                    if(!seen.add(val + "rows" + i) || !seen.add(val + "columns" + 
                    j)  || !seen.add(val + "3X3" + i/3 + '-' + j/3)){
                       return false; 
                    }
                }
            }
        }
        return true;
    }
}
