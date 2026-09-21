class Solution {
    public boolean isValidSudoku(char[][] board) {

        // check rows
        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c == '.') continue;
                if (!seen.add(c)) return false;
            }
        }

        // check columns
        for (int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                char c = board[row][col];
                if (c == '.') continue;
                if (!seen.add(c)) return false;
            }
        }

        // check 3x3 boxes
        for (int box = 0; box < 9; box++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char c = board[(box/3)*3 + i][(box%3)*3 + j];
                    if (c == '.') continue;
                    if (!seen.add(c)) return false;
                }
            }
        }

        return true;
    }
}