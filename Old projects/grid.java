import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws java.io.IOException {

        InputReader in = new InputReader();
        int rows = in.nextInt();
        int columns = in.nextInt();
        int [][] grid = new int[rows][columns];

        boolean [][] visited = new boolean[rows][columns];

        for (int row = 0; row < rows ; row++) {
            char[] num = in.nextString().toCharArray();
            for (int column = 0; column < columns ; column++) {
                grid[row][column] = num[column] - '0';
            }
        }

        int path = minimumDistance(grid, visited);
        System.out.println(path);

    }

    public static int minimumDistance(int [][] grid, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0});

        while (!queue.isEmpty()) {

            int[] current = queue.remove();

            int row = current[0];
            int column = current[1];

            if(row==grid.length-1 && column == grid[0].length -1)
                return current[2];

            List<int[]> neighbours = Arrays.asList(
                    //above
                    new int[]{row - grid[row][column], column, current[2]+1},
                    //under
                    new int[]{row + grid[row][column], column,current[2]+1},
                    // left
                    new int[]{row, column - grid[row][column],current[2]+1},
                    // right
                    new int[]{row, column + grid[row][column],current[2]+1});

            for (int[] neighbor : neighbours) {

                int neighborRow = neighbor[0];
                int neighborCol = neighbor[1];

                if ((neighborCol >= 0 && neighborRow >= 0) && (neighborCol < grid[0].length && neighborRow < grid.length) && !visited[neighborRow][neighborCol]) {
                    visited[neighborRow][neighborCol] = true;
                    queue.add(neighbor);
                }
            }


        }
        return -1;
    }

}

