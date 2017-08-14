/**
 * Created by Vitalii Leshchenko on 14.08.2017.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
 * 3
 * 7 4
 * 2 4 6
 * 8 5 9 3
 * That is, 3 + 7 + 4 + 9 = 23.
 * Find the maximum total from top to bottom of the triangle below:
 */

public class TriangleMaxPath {

    public static final int HEAD = 0;

    public static long calculate(String fileName) {
        int[][] triangleMatrix = readFile(fileName);

        for (int i = triangleMatrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int sum = triangleMatrix[i - 1][j] + triangleMatrix[i][j];
                if (sum < triangleMatrix[i - 1][j] + triangleMatrix[i][j + 1]) {
                    sum = triangleMatrix[i - 1][j] + triangleMatrix[i][j + 1];
                }
                triangleMatrix[i - 1][j] = sum;
            }
        }
        return triangleMatrix[HEAD][HEAD];
    }

    private static int[][] readFile(String file) {
        int counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                line = br.readLine();
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[][] tempoMatrix = new int[counter][counter];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            int row = 0;
            int column;
            while (line != null) {
                column = 0;
                for (String s : line.split(" ")) {
                    tempoMatrix[row][column] = Integer.valueOf(s);
                    column++;
                }
                line = br.readLine();
                row++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tempoMatrix;
    }

}
