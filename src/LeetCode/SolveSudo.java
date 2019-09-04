package LeetCode;

public class SolveSudo {
    public static void main(String[] args) {

    }
    public static void solveSudoku(char[][] board) {
        boolean [][]rows = new boolean[9][10];
        boolean [][]cols = new boolean[9][10];
        boolean [][]boxes = new boolean[9][10];
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                char c = board[i][j];
                if (c != '.'){
                    int num = c - '1' + 1;
                    rows[i][num] = true;
                    cols[j][num] = true;
                    int box = 3*(i/3) + j/3;
                    boxes[box][num] = true;
                }
            }
        }

    }

    private static boolean solve(boolean [][]rows, boolean [][]cols, boolean[][]boxes, char[][]board){
        for (int i = 0; i < 9 ; i++){
            for(int j = 0; j < 9; j++){
                char c = board[i][j];
                if ( c == '.'){
                    for (int k = 1; k <= 9; k++){

                        if (checkValid(rows, cols, boxes, c, i, j)){
                            board[i][j] = (char) (k + '0');
                            rows[i][k] = true;
                            cols[j][k] = true;
                            int box = ((i / 3) * 3) + (j / 3);
                            boxes[box][k] = true;
                            if (solve(rows, cols, boxes, board)){
                                return true;
                            }else {
                                rows[i][k] = false;
                                rows[j][k] = false;
                                rows[box][k] = false;
                                board[i][j] = '.';
                            }
                        }

                    }
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean checkValid(boolean [][]rows, boolean[][]cols, boolean[][]boxes, char c, int i, int j){
        int num = c - '1' + 1;
        if (rows[i][num]){
            return false;
        }if (rows[j][num]){
            return false;
        }
        int box = 3*(i/3) + j/3;
        if (boxes[box][num]){
            return false;
        }
        return true;
    }

}
