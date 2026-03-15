package com.personal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinSquaresSumTest {

    @Test
    public void perfectSquare() {
        assertEquals(1, MinSquaresSum.minCount(1));   // 1 = 1^2
        assertEquals(1, MinSquaresSum.minCount(4));   // 4 = 2^2
        assertEquals(1, MinSquaresSum.minCount(9));   // 9 = 3^2
    }

    @Test
    public void sumOfTwoSquares() {
        assertEquals(2, MinSquaresSum.minCount(2));   // 2 = 1^2 + 1^2
        assertEquals(2, MinSquaresSum.minCount(5));   // 5 = 1^2 + 2^2
        assertEquals(2, MinSquaresSum.minCount(8));   // 8 = 2^2 + 2^2
    }

    @Test
    public void sumOfThreeSquares() {
        assertEquals(3, MinSquaresSum.minCount(3));   // 3 = 1^2 + 1^2 + 1^2
        assertEquals(3, MinSquaresSum.minCount(6));   // 6 = 1^2 + 1^2 + 2^2
    }

    @Test
    public void sumOfFourSquares() {
        assertEquals(4, MinSquaresSum.minCount(7));   // 7 = 2^2 + 1^2 + 1^2 + 1^2
    }

    @Test
    public void zeroOrNegative() {
        assertEquals(0, MinSquaresSum.minCount(0));
    }
}
