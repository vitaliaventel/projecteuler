/**
 * Created by Vitalii Leshchenko on 10.08.2017.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 * What is the total of all the name scores in the file?
 */

public class NameScore {

    public static final int HEX_START = 64;

    public static long allNamesTotal(String fileName) {

        long score = 0;

        List<String> names = new ArrayList<>();
        for (String currentName : readFile(fileName).split(",")) {
            names.add(currentName);
        }
        Collections.sort(names);
        for (String value : names) {
            int nameValue = 0;
            for (int i = 0; i < value.length(); i++) {
                nameValue += value.charAt(i) - HEX_START;
            }
            score += (names.indexOf(value) + 1) * nameValue;
        }

        return score;
    }

    private static String readFile(String file) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString().replaceAll("\"", "");
    }

}
