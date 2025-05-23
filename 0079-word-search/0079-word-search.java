class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board[0].length; j++) {
                if(word.charAt(0)==board[i][j]) {
                    if(check(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    boolean check(char[][] board, int i, int j, String word, int index) {
        if(index==word.length()) {
            return true;
        }

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = check(board, i+1, j, word, index+1) || check(board, i-1, j, word, index+1) || check(board, i, j+1, word, index+1) || check(board, i, j-1, word, index+1);

        board[i][j] = temp;

        return found;
    }
}