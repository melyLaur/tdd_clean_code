package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static int main(List<Integer> dies) {
        int sum = 0;

        Map<Integer, Integer> occurrences = Main.getOccurrences(dies);
        int maxOccurrences = Collections.max(occurrences.values());


        if (maxOccurrences == 3) {
            sum = 28;
        } else if (maxOccurrences == 4) {
            sum = 35;
        } else if (maxOccurrences == 5) {
            sum = 50;

        } else {
            for (Integer die : dies) {
                sum += die;
            }
        }

        return sum;
    }

    static Map<Integer, Integer> getOccurrences(List<Integer> values) {

        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int value : values) {
            occurrences.put(value, occurrences.getOrDefault(value, 0) + 1);
        }

        return occurrences;
    }

}