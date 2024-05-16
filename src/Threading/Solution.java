package Threading;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {
    static void countNumbers(List<List<Integer>> arr) {
        for (List<Integer> range : arr) {
            int count = 0;
            int lowerBound = range.get(0);
            int upperBound = range.get(1);

            for (int num = lowerBound; num <= upperBound; num++) {
                if (hasNoRepeatingDigits(num)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    private static boolean hasNoRepeatingDigits(int num) {
        Set<Character> digitSet = new HashSet<>();

        for (char digit : Integer.toString(num).toCharArray()) {
            if (!digitSet.add(digit)) {
                return false;
            }
        }

        return true;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrRows = Integer.parseInt(bufferedReader.readLine().trim());
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, arrRows).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Result.countNumbers(arr);

        bufferedReader.close();
    }
}
