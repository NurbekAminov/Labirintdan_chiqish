package dasturlash.uz;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 0, 0},
                {0, 0, 0, 1},
                {1, 0, 1, 0},
                {0, 0, 0, 0}
        };
        int m = 0;
        int[][] way = new int[2][100];

        int x = 0;
        int y = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[x][y] == 1) {
                y--;
                i--;
                m--;
                continue;
            }
            for (int j = y; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    y--;
                    break;
                }
                if (matrix[i][j] == 0) {
                    way[0][m] = i;
                    way[1][m] = j;
                    m++;
                    y++;
                }
            }
            x++;
        }

        for (int i = 0; i < m; i++) {
            System.out.print("matrix[" + way[0][i] + "][" + way[1][i] + "] -> ");
        }

    }
}