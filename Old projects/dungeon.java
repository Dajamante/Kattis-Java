import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
/*
3 4 5
S....
.###.
.##..
###.#

#####
#####
##.##
##...

#####
#####
#.###
####E

1 3 3
S##
#E#
###

0 0 0

 */
/*
3 4 5
S....
.###.
.##..
###.#

#####
#####
##.##
##...

#####
#####
#.###
####E

1 3 3
S##
#E#
###

0 0 0

 */

    public static void main(String[] args) throws java.io.IOException {
        InputReader in = new InputReader();

        while (true) {
            int levels = in.nextInt();
            int rows = in.nextInt();
            int columns = in.nextInt();

            //System.out.println(levels);
            //System.out.println(rows);
            //System.out.println(columns);

            if(levels == 0 && rows == 0 && columns == 0)
                break;

            int[] startPos = new int[4];
            startPos[3] = 0;
            int[] endPos = new int[3];

            char[][][] dungeon = new char[levels][rows][columns];

            boolean[][][] visited = new boolean[levels][rows][columns];

            for (int level = 0; level < levels; level++) {
                for (int row = 0; row < rows; row++) {
                    char[] line = in.nextString().toCharArray();
                    for (int column = 0; column < columns; column++) {
                        if (line[column] == 'S') {
                            startPos[0] = level;
                            startPos[1] = row;
                            startPos[2] = column;
                        }
                        if (line[column] == 'E') {
                            endPos[0] = level;
                            endPos[1] = row;
                            endPos[2] = column;
                        }
                        if (line[column] == '#')
                            visited[level][row][column] = true;

                        dungeon[level][row][column] = line[column];
                    }
                }
            }

            int path = minimumDistance(dungeon, startPos, visited);
            System.out.println((path==-1)? "Trapped!": "Escaped in " + path + " minute(s).");
            }
    }


    public static int minimumDistance(char[][][] dungeon, int[] startPos, boolean[][][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        int levels = dungeon.length;
        int rows = dungeon[0].length;
        int columns = dungeon[0][0].length;

        queue.add(startPos);

        while (!queue.isEmpty()) {

            int[] current = queue.remove();

            int level = current[0];
            int row = current[1];
            int column = current[2];

            if (dungeon[level][row][column] == 'E')
                return current[3];

            List<int[]> neighbours = Arrays.asList(
                    //above level
                    new int[]{level - 1, row, column, current[3] + 1},
                    //under level
                    new int[]{level + 1, row, column, current[3] + 1},
                    // above in row
                    new int[]{level, row - 1, column, current[3] + 1},
                    //under in row
                    new int[]{level, row + 1, column, current[3] + 1},
                    // left
                    new int[]{level, row, column - 1, current[3] + 1},
                    //right
                    new int[]{level, row, column + 1, current[3] + 1});

            for (int[] neighbor : neighbours) {

                int neighborLevel = neighbor[0];
                int neighborRow = neighbor[1];
                int neighborCol = neighbor[2];

                if ((neighborLevel >= 0 && neighborCol >= 0 && neighborRow >= 0) &&
                        (neighborLevel < levels && neighborRow < rows && neighborCol < columns) &&
                        !visited[neighborLevel][neighborRow][neighborCol]) {
                    visited[neighborLevel][neighborRow][neighborCol] = true;
                    queue.add(neighbor);
                }
            }

        }
        return -1;
    }

}
