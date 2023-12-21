package org.example;

import java.util.List;

public class Main {
    public static int main(List<Integer> dies) {
        int sum = 0;
        for(Integer die : dies) {
            sum += die;
        }

        return sum;
    }
}