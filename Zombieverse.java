import java.util.List;

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
        //TODO complete this function
        throw new UnsupportedOperationException("Not yet implemented");
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
© 2021 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
