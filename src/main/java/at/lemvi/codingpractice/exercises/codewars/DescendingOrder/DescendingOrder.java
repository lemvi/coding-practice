package at.lemvi.codingpractice.exercises.codewars.DescendingOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code
        return Integer.parseInt(intArrayViewer(sortArrayDesc(stringToArray(numberToString(num)))));
    }

    public static String numberToString(int i) {
        return i+"";
    }

    public static List<Integer> stringToArray(String s) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            int val = Integer.parseInt(c.toString());
            result.add(val);
        }
        return result;
    }

    public static String intArrayViewer(List<Integer> array) {
        String result = "";
        for (Integer i:array) {
            result += i+"";
        }
        return result;
    }

    public static List<Integer> sortArrayDesc(List<Integer> array) {
        return array.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
    }
}