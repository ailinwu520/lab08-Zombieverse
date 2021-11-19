import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * This lab assignment mainly target at your mastery of matrix, array, and BFS(or DFS).
 * Your goal is to complete the given function below and to produce the expected output
 * as commented in the main method. The grid/matrix has size of "m x n" in which 1 <= m,n <= 10
 *
 * @author CS 245 Data Sturcture & Algorithms (University of San Francisco)
 * @version Fall 2021
 */
public class Zombieverse {
    /** List of 2D arrays of all test cases */
    public static List<int[][]> test;

    /**
     * Initialize a list contains of 8 tests
     */
    public Zombieverse() {
        test = List.of(new int[][]{{0, 2}},
                new int[][]{{0, 0}, {0, 2}},
                new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}},
                new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}},
                new int[][]{{1, 0, 0, 2, 1, 1, 0, 1, 2},
                        {0, 1, 1, 1, 1, 0, 1, 2, 1},
                        {2, 2, 1, 0, 1, 1, 2, 1, 1},
                        {1, 1, 1, 1, 0, 2, 1, 1, 1},
                        {0, 1, 1, 1, 1, 1, 1, 2, 0},
                        {0, 2, 0, 2, 0, 1, 2, 1, 1},
                        {1, 0, 2, 1, 1, 1, 1, 0, 1},
                        {1, 2, 0, 1, 0, 2, 1, 1, 1},
                        {2, 1, 1, 1, 0, 1, 1, 0, 1}},
                new int[][]{{1, 1, 0, 2, 1, 1, 0, 1, 2},
                        {0, 1, 1, 1, 1, 0, 1, 2, 1},
                        {2, 2, 1, 0, 1, 1, 2, 1, 1},
                        {1, 1, 1, 1, 0, 2, 1, 1, 1},
                        {0, 1, 1, 1, 1, 1, 1, 2, 0},
                        {0, 2, 0, 2, 0, 1, 2, 1, 1},
                        {1, 0, 2, 1, 1, 1, 1, 0, 1},
                        {1, 2, 0, 1, 0, 2, 1, 1, 1},
                        {2, 1, 1, 1, 0, 1, 1, 0, 1}},
                new int[][]{{1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 2, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1}},
                new int[][]{{1, 1, 0, 1, 1, 1, 0, 1, 1},
                        {0, 1, 1, 1, 1, 0, 1, 1, 1},
                        {1, 1, 1, 0, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 0, 1, 1, 1, 1},
                        {0, 1, 1, 1, 1, 1, 1, 1, 0},
                        {0, 1, 0, 1, 0, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 0, 1},
                        {1, 0, 0, 1, 0, 1, 1, 1, 1},
                        {1, 1, 1, 1, 0, 1, 1, 0, 2}});
    }

    /**
     * Will track the number of days in the given grid that how long it will take
     * for the zombies to infect every human(if there's any)
     *
     * @param grid a "m x n" grid contains only values of 0(empty space),
     *             1(human), and 2(zombie)
     * @return -1 if any human survived, 0 if no human at day 1,
     *          else return the days it took for all human to be infected
     */
    public int infection(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();

        // 4 directional adjacent will be infected
        int[][] adj = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int human = 0;

        // zombie in queue
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    human++;
                }
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        int day = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int nHuman = human;
            while (size-- > 0) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];
                for (int[] adjs : adj) {
                    int X = x + adjs[0];
                    int Y = y + adjs[1];
                    // if coordinates dont pass the boundaires, then turn zombie
                    if (X >= 0 && X < row && Y >= 0 && Y < col) {
                        if (grid[X][Y] == 1) {
                            // zombie
                            grid[X][Y] = 2;
                            // add to queue
                            queue.offer(new int[]{X, Y});
                            human--;
                        }
                    }
                }
            }
            if (nHuman != human) {
                day++;
            }
        }
        return human == 0 ? day : -1;
    }



    public static void main(String[] args) {
        Zombieverse zombieverse = new Zombieverse();
        for (int[][] region : test) {
            System.out.printf("Result of days: %d\n", zombieverse.infection(region));
        }
        /*Result of days: 0
        Result of days: 0
        Result of days: 4
        Result of days: -1
        Result of days: -1
        Result of days: 4
        Result of days: 8
        Result of days: 16*/
    }

}

