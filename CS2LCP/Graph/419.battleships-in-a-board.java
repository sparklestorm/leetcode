/*
 * @lc app=leetcode id=419 lang=java
 *
 * [419] Battleships in a Board
 */
class Solution {
    public int countBattleships(char[][] board) {
        if(board == null || board.length == 0)
            return 0;
        int count = 0;
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'X'){
                    if((i == 0 || board[i-1][j] == '.') && (j == 0 || board[i][j-1] == '.'))
                        count++;
                }
            }
        }
        return count;
    }
}

