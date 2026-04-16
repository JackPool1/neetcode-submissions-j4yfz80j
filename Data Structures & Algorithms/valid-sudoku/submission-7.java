class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // check for rows
        for(int i = 0; i < 9; i++){
            Set<Character> seen = new HashSet<>();
            for(int j = 0; j < 9; j++){
                char currentChar = board[i][j];

                if(currentChar == '.') continue;

                if(seen.contains(currentChar)) return false;

                seen.add(currentChar);
            }
        }
        // check columns
        for(int i = 0; i < 9; i++){
            Set<Character> seen = new HashSet<>();
            for(int j = 0; j < 9; j++){
                char currentChar = board[j][i];

                if(currentChar == '.') continue;

                if(seen.contains(currentChar)){
                    return false;
                } 

                seen.add(currentChar);
            }
        }

        for(int i = 0; i < 9; i++){
            Set<Character> seen = new HashSet<>();
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){

                    int row = (i / 3) * 3+ j;
                    int column = (i % 3) * 3 + k;
                    char currentChar = board[row][column];

                    if(currentChar == '.') continue;

                    

                    if(seen.contains(currentChar)){
                        System.out.println("False inside 3X3");
                         return false;
                     }

                    seen.add(currentChar);
                }
               
            }
        }

        return true;



    }
}
