/**
 * Created by Vitalii Leshchenko on 02.08.2017.
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 */

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 */

/** MATH IMPLEMENTATION */

public class LatticePath {

    public static long allPossiblePaths(int gridSize) {
        long resultPaths = 1;
        for (int i = 0; i < gridSize; i++) {
            resultPaths *= (2 * gridSize) - i;
            resultPaths /= i + 1;
        }
        return resultPaths;
    }

}
