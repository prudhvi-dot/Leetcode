class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board[0].length; j++) {
                if(board[i][j]==word.charAt(0)) {
                    if(find(board, i, j, 0, word)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    boolean find(char[][] board, int i, int j, int index, String word) {
        if(index==word.length()) {
            return true;
        }

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = find(board, i+1, j, index+1, word) || find(board, i-1, j, index+1, word) || find(board, i, j+1, index+1, word) || find(board, i, j-1, index+1, word);

        board[i][j] = temp;

        return found;
    }
}