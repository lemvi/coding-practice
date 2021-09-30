package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.TwoDimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
Link to exercise:
https://www.hackerrank.com/challenges/30-2d-arrays/problem
 */


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                              .map(Integer::parseInt)
                              .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        System.out.println(calculateHourGlass(arr));


        bufferedReader.close();
    }

    public static int calculateHourGlass(List<List<Integer>> arr) {
        List<Integer> sums = new ArrayList<>();
        int sum = 0;
        for (int l = 0; l < 4; l++) {
            for (int k = 0; k < 4; k++) {
                for (int i = k; i < k + 3; i++) {
                    for (int j = l; j < l + 3; j++) {
                        if (i == k + 1) {
                            if (j == l + 1)
                                sum += arr.get(i).get(j);
                        } else
                            sum += arr.get(i).get(j);
                    }
                }
                sums.add(sum);
                sum = 0;
            }
        }
        return Collections.max(sums);
    }


}