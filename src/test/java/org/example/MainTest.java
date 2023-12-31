package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void if_not_figure_should_return_sum_of_1_2_3_4_5_so_15() {
        List<Integer> dies = List.of(1,2,3,4,5);
        int result = Main.getPoints(dies);
        int expected = 15;
        assertEquals(expected, result);
    }

    @Test
    public void if_brelan_figure_should_return_28() {
        List<Integer> dies = List.of(1,1,1,4,2);
        int result = Main.getPoints(dies);
        int expected = 28;
        assertEquals(expected, result);
    }

    @Test
    public void if_carre_figure_should_return_35() {
        List<Integer> dies = List.of(2,2,2,4,2);
        int result = Main.getPoints(dies);
        int expected = 35;
        assertEquals(expected, result);
    }

    @Test
    public void if_yams_figure_should_return_50() {
        List<Integer> dies = List.of(2,2,2,2,2);
        int result = Main.getPoints(dies);
        int expected = 50;
        assertEquals(expected, result);
    }

    @Test
    public void if_full_figure_should_return_30() {
        List<Integer> dies = List.of(2,2,2,1,1);
        int result = Main.getPoints(dies);
        int expected = 50;
        assertEquals(expected, result);
    }
}