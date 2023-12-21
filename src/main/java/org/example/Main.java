package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static int main(List<Integer> dies) {
        int sum = 0;
        int nbOccurences = 0;

        nbOccurences = Main.getOccurrences(dies);


        if (nbOccurences == 3) {
            sum = 28;
        } else if (nbOccurences == 4) {
            sum = 35;
        } else if (nbOccurences == 5) {
            sum = 50;

        } else {
            for (Integer die : dies) {
                sum += die;
            }
        }

        return sum;
    }

    static int getOccurrences(List<Integer> values) {

        Map<Integer, Integer> occurrencesMap = new HashMap<>();
        for (int value : values) {
            occurrencesMap.put(value, occurrencesMap.getOrDefault(value, 0) + 1);
        }

        return Collections.max(occurrencesMap.values());
    }

}