package progrmmers;

public class MatrixRotation {
    public static void main(String[] args) {
            int rows = 3;
            int columns = 3;
            int[][] queries = {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
            solution(rows,columns,queries);
    }

    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] matrix = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = i * columns  + (j+1);
            }
        }

        int x1 , y1, x2, y2;
        for(int i = 0; i < queries.length; i++){
            x1 = queries[i][0] - 1;
            y1 = queries[i][1] - 1;
            x2 = queries[i][2] - 1;
            y2 = queries[i][3] - 1;

            int x1y1 = matrix[x1][y1];
            int min = x1y1;

            for(int x=x1; x<x2; x++){
                matrix[x][y1] = matrix[x + 1][y1];
                min = Math.min(min,matrix[x][y1]);
            }

            System.out.print("↑\n");
            for(int a = 0; a < rows; a++){
                for(int b = 0; b < columns; b++){
                    System.out.print(" "+matrix[a][b]);
                }
                System.out.println(" ");
            }

            for(int y=y1; y<y2; y++){
                matrix[x2][y] = matrix[x2][y + 1];
                min = Math.min(min,matrix[x2][y]);
            }

            System.out.print("←\n");
            for(int a = 0; a < rows; a++){
                for(int b = 0; b < columns; b++){
                    System.out.print(" "+matrix[a][b]);
                }
                System.out.println(" ");
            }

            for(int x=x2; x>x1; x--){
                matrix[x][y2] = matrix[x -1][y2];
                min = Math.min(min,matrix[x][y2]);
            }

            System.out.print("↓\n");
            for(int a = 0; a < rows; a++){
                for(int b = 0; b < columns; b++){
                    System.out.print(" "+matrix[a][b]);
                }
                System.out.println(" ");
            }

            for(int y = y2; y > y1; y--){
                matrix[x1][y] = matrix[x1][y -1];
                min = Math.min(min,matrix[x1][y]);
            }

            System.out.print("→\n");
            for(int a = 0; a < rows; a++){
                for(int b = 0; b < columns; b++){
                    System.out.print(" "+matrix[a][b]);
                }
                System.out.println(" ");
            }

            matrix[x1][y1+1] = x1y1;

            System.out.println("최종\n");
            for(int a = 0; a < rows; a++){
                for(int b = 0; b < columns; b++){
                    System.out.print(" "+matrix[a][b]);
                }
                System.out.println(" ");
            }

            answer[i] = min;
        }

        return answer;
    }
}
