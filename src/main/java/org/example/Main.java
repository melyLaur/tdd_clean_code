package org.example;

import java.util.List;

public class Main {
    public static int main(List<Integer> dies) {
        int sum = 0;
        int nbSameValue = 1;

        for(int mainDieIndex = 0; mainDieIndex < dies.size(); mainDieIndex++) {
            for(int otherDieIndex = mainDieIndex+1; otherDieIndex< dies.size(); otherDieIndex ++) {
                if(dies.get(otherDieIndex) == dies.get(mainDieIndex)) {
                    nbSameValue ++;
                }
            }
            if(nbSameValue != 0) break;

        }


        if(nbSameValue == 3) {
            sum = 28;
        } else if (nbSameValue == 4) {
            sum = 35;
        } else {
            for(Integer die: dies) {
                sum += die;
            }
        }

        return sum;
    }
}