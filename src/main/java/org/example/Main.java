package org.example;

import java.util.List;

public class Main {
    public static int main(List<Integer> dies) {
        int sum = 0;
        int nbSameValue = 1;

        for(int i = 0; i < dies.size(); i++) {
            for(int otherDie = i+1; otherDie< dies.size(); otherDie ++) {
                if(dies.get(otherDie) == dies.get(i)) {
                    nbSameValue ++;
                }
            }
            if(nbSameValue != 0) break;

        }


        if(nbSameValue == 3) {
            sum = 28;
        } else {
            for(Integer die: dies) {
                sum += die;
            }
        }

        return sum;
    }
}