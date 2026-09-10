class Solution {
    public boolean winner(char[] blocks) {
        int[][] winComb = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}
        };
        for (int[] card : winComb) {
            if (blocks[card[0]] == blocks[card[1]] && 
                blocks[card[1]] == blocks[card[2]] && 
                blocks[card[0]] != '\0') {
                return true;
            }
        }
        return false;
    }

    public String tictactoe(int[][] moves) {
        char blocks[] = new char[9];
        char turn = 'A';

        for (int[] move : moves) {
            int idx = move[0] * 3 + move[1];
            blocks[idx] = turn;

            if (winner(blocks)) {
                return String.valueOf(turn);
            }

            turn = (turn == 'A') ? 'B' : 'A';
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}