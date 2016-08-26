import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by chris on 8/23/16.
 */

@RunWith(JUnitParamsRunner.class)
public class ArrayKatasTest {


    @Test
    @Parameters
    /*
     * Given an array of integers
     * When either the first or last one is 6
     * Then return true
     */
    public void firstLast6Test(boolean expectedResult, List<Integer> numbers) {
        // arrange

        // act
        boolean result = ArrayKatas.firstLast6(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForFirstLast6Test() {
        return new Object[]{
                new Object[]{true, Arrays.asList(1, 2, 6)},
                new Object[]{true, Arrays.asList(6, 1, 2, 3)},
                new Object[]{false, Arrays.asList(13, 6, 1, 2, 3)},
                new Object[]{true, Arrays.asList(13, 6, 1, 2, 6)},
                new Object[]{false, Arrays.asList(3, 2, 1)},
                new Object[]{false, Arrays.asList(3, 6, 1)},
                new Object[]{true, Arrays.asList(3, 6)},
                new Object[]{true, Arrays.asList(6)},
                new Object[]{false, Arrays.asList(3)},
                new Object[]{true, Arrays.asList(5, 6)},
                new Object[]{false, Arrays.asList(5, 5)},
                new Object[]{true, Arrays.asList(1, 2, 3, 4, 6)},
                new Object[]{false, Arrays.asList(1, 2, 3, 4)}
        };
    }

    @Test
    @Parameters
    public void countEvensTest(List<Integer> numbers, int expectedResult) {
        // arrange

        // act
        int result = ArrayKatas.countEvens(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForCountEvensTest() {
        return new Object[]{
                new Object[]{Arrays.asList(2, 1, 2, 3, 4), 3},
                new Object[]{Arrays.asList(2, 2, 0), 3},
                new Object[]{Arrays.asList(1, 3, 5), 0},
                new Object[]{Arrays.asList(), 0},
                new Object[]{Arrays.asList(11, 9, 0, 1), 1},
                new Object[]{Arrays.asList(2, 11, 9, 0), 2},
                new Object[]{Arrays.asList(2), 1},
                new Object[]{Arrays.asList(2, 5, 12), 2}
        };
    }

    @Test
    @Parameters
    public void bigDiffTest(List<Integer> numbers, int expectedResult) {
        // arrange

        // act
        int result = ArrayKatas.bigDiff(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForBigDiffTest() {
        return new Object[]{
                new Object[]{Arrays.asList(2, 1, 2, 3, 4), 3},
                new Object[]{Arrays.asList(10, 3, 5, 6), 7},
                new Object[]{Arrays.asList(7, 2, 10, 9), 8},
                new Object[]{Arrays.asList(2, 10, 7, 2), 8},
                new Object[]{Arrays.asList(2, 10), 8},
                new Object[]{Arrays.asList(10, 2), 8},
                new Object[]{Arrays.asList(10, 0), 10},
                new Object[]{Arrays.asList(2, 3), 1},
                new Object[]{Arrays.asList(2, 2), 0},
                new Object[]{Arrays.asList(2), 0},
                new Object[]{Arrays.asList(5, 1, 6, 1, 9, 9), 8},
                new Object[]{Arrays.asList(7, 6, 8, 5), 3},
                new Object[]{Arrays.asList(7, 7, 6, 8, 5, 5, 6), 3}
        };
    }

    @Test
    @Parameters
    public void centeredAverageTest(List<Integer> numbers, int expectedResult) {
        // arrange

        // act
        int result = ArrayKatas.centeredAverage(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForCenteredAverageTest() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 2, 3, 4, 100), 3},
                new Object[]{Arrays.asList(1, 1, 5, 5, 10, 8, 7), 5},
                new Object[]{Arrays.asList(-10, -4, -2, -4, -2, 0), -3},
                new Object[]{Arrays.asList(5, 3, 4, 6, 2), 4},
                new Object[]{Arrays.asList(5, 3, 4, 0, 100), 4},
                new Object[]{Arrays.asList(100, 0, 5, 3, 4), 4},
                new Object[]{Arrays.asList(4, 0, 100), 4},
                new Object[]{Arrays.asList(0, 2, 3, 4, 100), 3},
                new Object[]{Arrays.asList(1, 1, 100), 1},
                new Object[]{Arrays.asList(7, 7, 7), 7},
                new Object[]{Arrays.asList(1, 7, 8), 7},
                new Object[]{Arrays.asList(1, 1, 99, 99), 50},
                new Object[]{Arrays.asList(1000, 0, 1, 99), 50},
                new Object[]{Arrays.asList(4, 4, 4, 4, 5), 4},
                new Object[]{Arrays.asList(4, 4, 4, 1, 5), 4},
                new Object[]{Arrays.asList(6, 4, 8, 12, 3), 6}
        };
    }

    @Test
    @Parameters
    public void sum13Test(List<Integer> numbers, int expectedResult) {
        // arrange

        // act
        int result = ArrayKatas.sum13(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForSum13Test() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 2, 2, 1), 6},
                new Object[]{Arrays.asList(1, 1), 2},
                new Object[]{Arrays.asList(1, 2, 2, 1, 13), 6},
                new Object[]{Arrays.asList(1, 2, 13, 2, 1, 13), 4},
                new Object[]{Arrays.asList(13, 1, 2, 13, 2, 1, 13), 3},
                new Object[]{Arrays.asList(), 0},
                new Object[]{Arrays.asList(13), 0},
                new Object[]{Arrays.asList(13, 13), 0},
                new Object[]{Arrays.asList(13, 0, 13), 0},
                new Object[]{Arrays.asList(13, 1, 13), 0},
                new Object[]{Arrays.asList(5, 7, 2), 14},
                new Object[]{Arrays.asList(5, 13, 2), 5},
                new Object[]{Arrays.asList(0), 0},
                new Object[]{Arrays.asList(13, 0), 0}
        };
    }

    @Test
    @Parameters
    public void has22Test(List<Integer> numbers, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.has22(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForHas22Test() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 2, 2), true},
                new Object[]{Arrays.asList(1, 2, 1, 2), false},
                new Object[]{Arrays.asList(2, 1, 2), false},
                new Object[]{Arrays.asList(2, 2, 1, 2), true},
                new Object[]{Arrays.asList(1, 3, 2), false},
                new Object[]{Arrays.asList(1, 3, 2, 2), true},
                new Object[]{Arrays.asList(2, 3, 2, 2), true},
                new Object[]{Arrays.asList(4, 2, 4, 2, 2, 5), true},
                new Object[]{Arrays.asList(1, 2), false},
                new Object[]{Arrays.asList(2, 2), true},
                new Object[]{Arrays.asList(2), false},
                new Object[]{Arrays.asList(), false},
                new Object[]{Arrays.asList(3, 3, 2, 2), true},
                new Object[]{Arrays.asList(5, 2, 5, 2), false}
        };
    }

    @Test
    @Parameters
    public void lucky13Test(List<Integer> numbers, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.lucky13(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForLucky13Test() {
        return new Object[]{
                new Object[]{Arrays.asList(0, 2, 4), true},
                new Object[]{Arrays.asList(1, 2, 3), false},
                new Object[]{Arrays.asList(1, 2, 4), false},
                new Object[]{Arrays.asList(2, 7, 2, 8), true},
                new Object[]{Arrays.asList(2, 7, 1, 8), false},
                new Object[]{Arrays.asList(3, 7, 2, 8), false},
                new Object[]{Arrays.asList(2, 7, 2, 1), false},
                new Object[]{Arrays.asList(1, 2), false},
                new Object[]{Arrays.asList(2, 2), true},
                new Object[]{Arrays.asList(2), true},
                new Object[]{Arrays.asList(3), false},
                new Object[]{Arrays.asList(), true}
        };
    }

    @Test
    @Parameters
    public void sum28Test(List<Integer> numbers, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.sum28(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForSum28Test() {
        return new Object[]{
                new Object[]{Arrays.asList(2, 3, 2, 2, 4, 2), true},
                new Object[]{Arrays.asList(2, 3, 2, 2, 4, 2, 2), false},
                new Object[]{Arrays.asList(1, 2, 3, 4), false},
                new Object[]{Arrays.asList(2, 2, 2, 2), true},
                new Object[]{Arrays.asList(1, 2, 2, 2, 2, 4), true},
                new Object[]{Arrays.asList(), false},
                new Object[]{Arrays.asList(2), false},
                new Object[]{Arrays.asList(8), false},
                new Object[]{Arrays.asList(2, 2, 2), false},
                new Object[]{Arrays.asList(2, 2, 2, 2, 2), false},
                new Object[]{Arrays.asList(1, 2, 2, 1, 2, 2), true},
                new Object[]{Arrays.asList(5, 2, 2, 2, 4, 2), true}
        };
    }

    @Test
    @Parameters
    public void more14Test(List<Integer> numbers, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.more14(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForMore14Test() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 4, 1), true},
                new Object[]{Arrays.asList(1, 4, 1, 4), false},
                new Object[]{Arrays.asList(1, 1), true},
                new Object[]{Arrays.asList(1, 6, 6), true},
                new Object[]{Arrays.asList(1), true},
                new Object[]{Arrays.asList(1, 4), false},
                new Object[]{Arrays.asList(6, 1, 1), true},
                new Object[]{Arrays.asList(1, 6, 4), false},
                new Object[]{Arrays.asList(1, 1, 4, 4, 1), true},
                new Object[]{Arrays.asList(1, 1, 6, 4, 4, 1), true},
                new Object[]{Arrays.asList(), false},
                new Object[]{Arrays.asList(4, 1, 4, 6), false},
                new Object[]{Arrays.asList(4, 1, 4, 6, 1), false},
                new Object[]{Arrays.asList(1, 4, 1, 4, 1, 6), true}
        };
    }

    @Test
    @Parameters
    public void fizzArrayTest(int number, List<Integer> numbers, List<Integer> expectedResult) {
        // arrange

        // act
        List<Integer> result = ArrayKatas.fizzArray(number);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForFizzArrayTest() {
        return new Object[]{
                new Object[]{4, Arrays.asList(0, 1, 2, 3), Arrays.asList(0, 1, 2, 3)},
                new Object[]{1, Arrays.asList(0), Arrays.asList(0)},
                new Object[]{10, Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)},
                new Object[]{0, Arrays.asList(), Arrays.asList()},
                new Object[]{2, Arrays.asList(0, 1), Arrays.asList(0, 1)},
                new Object[]{7, Arrays.asList(0, 1, 2, 3, 4, 5, 6), Arrays.asList(0, 1, 2, 3, 4, 5, 6)}
        };
    }

    @Test
    @Parameters
    public void only14Test(List<Integer> numbers, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.only14(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForOnly14Test() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 4, 1, 4), true},
                new Object[]{Arrays.asList(1, 4, 2, 4), false},
                new Object[]{Arrays.asList(1, 1), true},
                new Object[]{Arrays.asList(4, 1), true},
                new Object[]{Arrays.asList(2), false},
                new Object[]{Arrays.asList(), true},
                new Object[]{Arrays.asList(1, 4, 1, 3), false},
                new Object[]{Arrays.asList(3, 1, 3), false},
                new Object[]{Arrays.asList(1), true},
                new Object[]{Arrays.asList(4), true},
                new Object[]{Arrays.asList(3, 4), false},
                new Object[]{Arrays.asList(1, 3, 4), false},
                new Object[]{Arrays.asList(1, 1, 1), true},
                new Object[]{Arrays.asList(1, 1, 1, 5), false},
                new Object[]{Arrays.asList(4, 1, 4, 1), true}
        };
    }

    @Test
    @Parameters
    public void fizzArray2Test(int number, List<Integer> numbers, List<Integer> expectedResult) {
        // arrange

        // act
        List<String> result = ArrayKatas.fizzArray2(number);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForFizzArray2Test() {
        return new Object[]{
                new Object[]{4, Arrays.asList("0", "1", "2", "3"), Arrays.asList("0", "1", "2", "3")},
                new Object[]{10, Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"), Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")},
                new Object[]{2, Arrays.asList("0", "1"), Arrays.asList("0", "1")},
                new Object[]{1, Arrays.asList("0"), Arrays.asList("0")},
                new Object[]{0, Arrays.asList(), Arrays.asList()},
                new Object[]{7, Arrays.asList("0", "1", "2", "3", "4", "5", "6"), Arrays.asList("0", "1", "2", "3", "4", "5", "6")},
                new Object[]{9, Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8"), Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8")},
                new Object[]{11, Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"), Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")}
        };
    }

    @Test
    @Parameters
    public void no14Test(List<Integer> numbers, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.no14(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForNo14Test() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 2, 3), true},
                new Object[]{Arrays.asList(1, 2, 3, 4), false},
                new Object[]{Arrays.asList(2, 3, 4), true},
                new Object[]{Arrays.asList(1, 1, 4, 4), false},
                new Object[]{Arrays.asList(2, 2, 4, 4), true},
                new Object[]{Arrays.asList(2, 3, 4, 1), false},
                new Object[]{Arrays.asList(2, 1, 1), true},
                new Object[]{Arrays.asList(1, 4), false},
                new Object[]{Arrays.asList(2), true},
                new Object[]{Arrays.asList(2, 1), true},
                new Object[]{Arrays.asList(1), true},
                new Object[]{Arrays.asList(4), true},
                new Object[]{Arrays.asList(), true},
                new Object[]{Arrays.asList(1, 1, 1, 1), true},
                new Object[]{Arrays.asList(9, 4, 4, 1), false},
                new Object[]{Arrays.asList(4, 2, 3, 1), false},
                new Object[]{Arrays.asList(4, 2, 3, 5), true},
                new Object[]{Arrays.asList(4, 4, 2), true},
                new Object[]{Arrays.asList(1, 4, 4), false}
        };
    }

    @Test
    @Parameters
    public void isEverywhereTest(List<Integer> numbers, int val, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.isEverywhere(numbers, val);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForIsEverywhereTest() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 2, 1, 3), 1, true},
                new Object[]{Arrays.asList(1, 2, 1, 3), 2, false},
                new Object[]{Arrays.asList(1, 2, 1, 3, 4), 1, false},
                new Object[]{Arrays.asList(2, 1, 2, 1), 1, true},
                new Object[]{Arrays.asList(2, 1, 2, 1), 2, true},
                new Object[]{Arrays.asList(2, 1, 2, 3, 1), 2, false},
                new Object[]{Arrays.asList(3, 1), 3, true},
                new Object[]{Arrays.asList(3, 1), 2, false},
                new Object[]{Arrays.asList(3), 1, true},
                new Object[]{Arrays.asList(), 1, true},
                new Object[]{Arrays.asList(1, 2, 1, 2, 3, 2, 5), 2, true},
                new Object[]{Arrays.asList(1, 2, 1, 1, 1, 2), 2, false},
                new Object[]{Arrays.asList(2, 1, 2, 1, 1, 2), 2, false},
                new Object[]{Arrays.asList(2, 1, 2, 2, 2, 1, 1, 2), 2, false},
                new Object[]{Arrays.asList(2, 1, 2, 2, 2, 1, 2, 1), 2, true},
                new Object[]{Arrays.asList(2, 1, 2, 1, 2), 2, true}
        };
    }

    @Test
    @Parameters
    public void either24Test(List<Integer> numbers, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.either24(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForEither24Test() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 2, 2), true},
                new Object[]{Arrays.asList(4, 4, 1), true},
                new Object[]{Arrays.asList(4, 4, 1, 2, 2), false},
                new Object[]{Arrays.asList(1, 2, 3, 4), false},
                new Object[]{Arrays.asList(3, 5, 9), false},
                new Object[]{Arrays.asList(1, 2, 3, 4, 4), true},
                new Object[]{Arrays.asList(2, 2, 3, 4), true},
                new Object[]{Arrays.asList(1, 2, 3, 2, 2, 4), true},
                new Object[]{Arrays.asList(1, 2, 3, 2, 2, 4, 4), false},
                new Object[]{Arrays.asList(1, 2), false},
                new Object[]{Arrays.asList(2, 2), true},
                new Object[]{Arrays.asList(4, 4), true},
                new Object[]{Arrays.asList(2), false},
                new Object[]{Arrays.asList(), false}
        };
    }

    @Test
    @Parameters
    public void matchUpTest(List<Integer> numbers1, List<Integer> numbers2, int expectedResult) {
        // arrange

        // act
        int result = ArrayKatas.matchUp(numbers1, numbers2);

        // assert
        assertThat(result, equalTo(expectedResult));
    }

    private Object[] parametersForMatchUpTest() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 10), 2},
                new Object[]{Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 5), 3},
                new Object[]{Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 3), 2},
                new Object[]{Arrays.asList(5, 3), Arrays.asList(5, 5), 1},
                new Object[]{Arrays.asList(5, 3), Arrays.asList(4, 4), 2},
                new Object[]{Arrays.asList(5, 3), Arrays.asList(3, 3), 1},
                new Object[]{Arrays.asList(5, 3), Arrays.asList(2, 2), 1},
                new Object[]{Arrays.asList(5, 3), Arrays.asList(1, 1), 1},
                new Object[]{Arrays.asList(5, 3), Arrays.asList(0, 0), 0},
                new Object[]{Arrays.asList(4), Arrays.asList(4), 0},
                new Object[]{Arrays.asList(4), Arrays.asList(5), 1}
        };
    }

    @Test
    @Parameters
    public void has77Test(List<Integer> numbers, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.has77(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForHas77Test() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 7, 7), true},
                new Object[]{Arrays.asList(1, 7, 1, 7), true},
                new Object[]{Arrays.asList(1, 7, 1, 1, 7), false},
                new Object[]{Arrays.asList(7, 7, 1, 1, 7), true},
                new Object[]{Arrays.asList(2, 7, 2, 2, 7, 2), false},
                new Object[]{Arrays.asList(2, 7, 2, 2, 7, 7), true},
                new Object[]{Arrays.asList(7, 2, 7, 2, 2, 7), true},
                new Object[]{Arrays.asList(7, 2, 6, 2, 2, 7), false},
                new Object[]{Arrays.asList(7, 7, 7), true},
                new Object[]{Arrays.asList(7, 1, 7), true},
                new Object[]{Arrays.asList(7, 1, 1), false},
                new Object[]{Arrays.asList(1, 2), false},
                new Object[]{Arrays.asList(1, 7), false},
                new Object[]{Arrays.asList(7), false}
        };
    }

    @Test
    @Parameters
    public void has12Test(List<Integer> numbers, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.has12(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForHas12Test() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 3, 2), true},
                new Object[]{Arrays.asList(3, 1, 2), true},
                new Object[]{Arrays.asList(3, 1, 4, 5, 2), true},
                new Object[]{Arrays.asList(3, 1, 4, 5, 6), false},
                new Object[]{Arrays.asList(3, 1, 4, 1, 6, 2), true},
                new Object[]{Arrays.asList(2, 1, 4, 1, 6, 2), true},
                new Object[]{Arrays.asList(2, 1, 4, 1, 6), false},
                new Object[]{Arrays.asList(3, 5, 9), false},
                new Object[]{Arrays.asList(3, 5, 1), false},
                new Object[]{Arrays.asList(3, 2, 1), false},
                new Object[]{Arrays.asList(1, 2), true},
                new Object[]{Arrays.asList(1, 1), false},
                new Object[]{Arrays.asList(1), false},
                new Object[]{Arrays.asList(), false}
        };
    }

    @Test
    @Parameters
    public void modThreeTest(List<Integer> numbers, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.modThree(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForModThreeTest() {
        return new Object[]{
                new Object[]{Arrays.asList(2, 1, 3, 5), true},
                new Object[]{Arrays.asList(2, 1, 2, 5), false},
                new Object[]{Arrays.asList(2, 4, 2, 5), true},
                new Object[]{Arrays.asList(1, 2, 1, 2, 1), false},
                new Object[]{Arrays.asList(9, 9, 9), true},
                new Object[]{Arrays.asList(1, 2, 1), false},
                new Object[]{Arrays.asList(1, 2), false},
                new Object[]{Arrays.asList(1), false},
                new Object[]{Arrays.asList(), false},
                new Object[]{Arrays.asList(9, 7, 2, 9), false},
                new Object[]{Arrays.asList(9, 7, 2, 9, 2, 2), false},
                new Object[]{Arrays.asList(9, 7, 2, 9, 2, 2, 6), true}
        };
    }

    @Test
    @Parameters
    public void haveThreeTest(List<Integer> numbers, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.haveThree(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForHaveThreeTest() {
        return new Object[]{
                new Object[]{Arrays.asList(3, 1, 3, 1, 3), true},
                new Object[]{Arrays.asList(3, 1, 3, 3), false},
                new Object[]{Arrays.asList(3, 4, 3, 3, 4), false},
                new Object[]{Arrays.asList(1, 3, 1, 3, 1, 2), false},
                new Object[]{Arrays.asList(1, 3, 1, 3, 1, 3), true},
                new Object[]{Arrays.asList(1, 3, 3, 1, 3), false},
                new Object[]{Arrays.asList(1, 3, 1, 3, 1, 3, 4, 3), false},
                new Object[]{Arrays.asList(3, 4, 3, 4, 3, 4, 4), true},
                new Object[]{Arrays.asList(3, 3, 3), false},
                new Object[]{Arrays.asList(1, 3), false},
                new Object[]{Arrays.asList(3), false},
                new Object[]{Arrays.asList(1), false}
        };
    }

    @Test
    @Parameters
    public void twoTwoTest(List<Integer> numbers, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.twoTwo(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForTwoTwoTest() {
        return new Object[]{
                new Object[]{Arrays.asList(3, 1, 3, 1, 3), true},
                new Object[]{Arrays.asList(4, 2, 2, 3), true},
                new Object[]{Arrays.asList(2, 2, 4), true},
                new Object[]{Arrays.asList(2, 2, 4, 2), false},
                new Object[]{Arrays.asList(1, 3, 4), true},
                new Object[]{Arrays.asList(1, 2, 2, 3, 4), true},
                new Object[]{Arrays.asList(1, 2, 3, 4), false},
                new Object[]{Arrays.asList(2, 2), true},
                new Object[]{Arrays.asList(2, 2, 7), true},
                new Object[]{Arrays.asList(2, 2, 7, 2, 1), false},
                new Object[]{Arrays.asList(4, 2, 2, 2), true},
                new Object[]{Arrays.asList(2, 2, 2), true},
                new Object[]{Arrays.asList(1, 2), false},
                new Object[]{Arrays.asList(2), false},
                new Object[]{Arrays.asList(1), true},
                new Object[]{Arrays.asList(), true},
                new Object[]{Arrays.asList(5, 2, 2, 3), true},
                new Object[]{Arrays.asList(2, 2, 5, 2), false}
        };
    }


    @Test
    @Parameters
    public void sameEndsTest(List<Integer> numbers, int range, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.sameEnds(numbers, range);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForSameEndsTest() {
        return new Object[]{
                new Object[]{Arrays.asList(5, 6, 45, 99, 13, 5, 6), 1, false},
                new Object[]{Arrays.asList(5, 6, 45, 99, 13, 5, 6), 2, true},
                new Object[]{Arrays.asList(5, 6, 45, 99, 13, 5, 6), 3, false},
                new Object[]{Arrays.asList(1, 2, 5, 2, 1), 1, true},
                new Object[]{Arrays.asList(1, 2, 5, 2, 1), 2, false},
                new Object[]{Arrays.asList(1, 2, 5, 2, 1), 0, true},
                new Object[]{Arrays.asList(1, 2, 5, 2, 1), 5, true},
                new Object[]{Arrays.asList(1, 1, 1), 0, true},
                new Object[]{Arrays.asList(1, 1, 1), 1, true},
                new Object[]{Arrays.asList(1, 1, 1), 2, true},
                new Object[]{Arrays.asList(1, 1, 1), 3, true},
                new Object[]{Arrays.asList(1), 1, true},
                new Object[]{Arrays.asList(), 0, true},
                new Object[]{Arrays.asList(4, 2, 4, 5), 1, false}
        };
    }

    @Test
    @Parameters
    public void tripleUpTest(List<Integer> numbers, boolean expectedResult) {
        // arrange

        // act
        boolean result = ArrayKatas.tripleUp(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForTripleUpTest() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 4, 5, 6, 2), true},
                new Object[]{Arrays.asList(1, 2, 3), true},
                new Object[]{Arrays.asList(1, 2, 4), false},
                new Object[]{Arrays.asList(1, 2, 4, 5, 7, 6, 5, 6, 7, 6), true},
                new Object[]{Arrays.asList(1, 2, 4, 5, 7, 6, 5, 7, 7, 6), false},
                new Object[]{Arrays.asList(1, 2), false},
                new Object[]{Arrays.asList(1), false},
                new Object[]{Arrays.asList(), false},
                new Object[]{Arrays.asList(10, 9, 8, -100, -99, -98, 100), true},
                new Object[]{Arrays.asList(10, 9, 8, -100, -99, 99, 100), false},
                new Object[]{Arrays.asList(-100, -99, -99, 100, 101, 102), true},
                new Object[]{Arrays.asList(2, 3, 5, 6, 8, 9, 2, 3), false}
        };
    }

    @Test
    @Parameters
    public void fizzArray3Test(int start, int end, List<Integer> expectedResult) {
        // arrange

        // act
        List<Integer> result = ArrayKatas.fizzArray3(start, end);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForFizzArray3Test() {
        return new Object[]{
                new Object[]{5, 10, Arrays.asList(5, 6, 7, 8, 9)},
                new Object[]{11, 18, Arrays.asList(11, 12, 13, 14, 15, 16, 17)},
                new Object[]{1, 3, Arrays.asList(1, 2)},
                new Object[]{1, 2, Arrays.asList(1)},
                new Object[]{1, 1, Arrays.asList()},
                new Object[]{1000, 1005, Arrays.asList(1000, 1001, 1002, 1003, 1004)}
        };
    }

    @Test
    @Parameters
    public void shiftLeftTest(List<Integer> numbers, List<Integer> expectedResult) {
        // arrange

        // act
        List<Integer> result = ArrayKatas.shiftLeft(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForShiftLeftTest() {
        return new Object[]{
                new Object[]{Arrays.asList(6, 2, 5, 3), Arrays.asList(2, 5, 3, 6)},
                new Object[]{Arrays.asList(1, 2), Arrays.asList(2, 1)},
                new Object[]{Arrays.asList(1), Arrays.asList(1)},
                new Object[]{Arrays.asList(), Arrays.asList()},
                new Object[]{Arrays.asList(1, 1, 2, 2, 4), Arrays.asList(1, 2, 2, 4, 1)},
                new Object[]{Arrays.asList(1, 1, 1), Arrays.asList(1, 1, 1)},
                new Object[]{Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 1)}
        };
    }

    @Test
    @Parameters
    public void tenRunTest(List<Integer> numbers, List<Integer> expectedResult) {
        // arrange

        // act
        List<Integer> result = ArrayKatas.tenRun(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForTenRunTest() {
        return new Object[]{
                new Object[]{Arrays.asList(2, 10, 3, 4, 20, 5), Arrays.asList(2, 10, 10, 10, 20, 20)},
                new Object[]{Arrays.asList(10, 1, 20, 2), Arrays.asList(10, 10, 20, 20)},
                new Object[]{Arrays.asList(10, 1, 9, 20), Arrays.asList(10, 10, 10, 20)},
                new Object[]{Arrays.asList(1, 2, 50, 1), Arrays.asList(1, 2, 50, 50)},
                new Object[]{Arrays.asList(1, 20, 50, 1), Arrays.asList(1, 20, 50, 50)},
                new Object[]{Arrays.asList(10, 10), Arrays.asList(10, 10)},
                new Object[]{Arrays.asList(10, 2), Arrays.asList(10, 10)},
                new Object[]{Arrays.asList(0, 2), Arrays.asList(0, 0)},
                new Object[]{Arrays.asList(1, 2), Arrays.asList(1, 2)},
                new Object[]{Arrays.asList(1), Arrays.asList(1)},
                new Object[]{Arrays.asList(), Arrays.asList()}
        };
    }

    @Test
    @Parameters
    public void pre4Test(List<Integer> numbers, List<Integer> expectedResult) {
        // arrange

        // act
        List<Integer> result = ArrayKatas.pre4(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForPre4Test() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 2, 4, 1), Arrays.asList(1, 2)},
                new Object[]{Arrays.asList(3, 1, 4), Arrays.asList(3, 1)},
                new Object[]{Arrays.asList(1, 4, 4), Arrays.asList(1)},
                new Object[]{Arrays.asList(1, 4, 4, 2), Arrays.asList(1)},
                new Object[]{Arrays.asList(1, 3, 4, 2, 4), Arrays.asList(1, 3)},
                new Object[]{Arrays.asList(4, 4), Arrays.asList()},
                new Object[]{Arrays.asList(3, 3, 4), Arrays.asList(3, 3)},
                new Object[]{Arrays.asList(1, 2, 1, 4), Arrays.asList(1, 2, 1)},
                new Object[]{Arrays.asList(2, 1, 4, 2), Arrays.asList(2, 1)},
                new Object[]{Arrays.asList(2, 1, 2, 1, 4, 2), Arrays.asList(2, 1, 2, 1)}
        };
    }


    @Test
    @Parameters
    public void post4Test(List<Integer> numbers, List<Integer> expectedResult) {
        // arrange

        // act
        List<Integer> result = ArrayKatas.post4(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForPost4Test() {
        return new Object[]{
                new Object[]{Arrays.asList(2, 4, 1, 2), Arrays.asList(1, 2)},
                new Object[]{Arrays.asList(4, 1, 4, 2), Arrays.asList(2)},
                new Object[]{Arrays.asList(4, 4, 1, 2, 3), Arrays.asList(1, 2, 3)},
                new Object[]{Arrays.asList(4, 2), Arrays.asList(2)},
                new Object[]{Arrays.asList(4, 4, 3), Arrays.asList(3)},
                new Object[]{Arrays.asList(4, 4), Arrays.asList()},
                new Object[]{Arrays.asList(4), Arrays.asList()},
                new Object[]{Arrays.asList(2, 4, 1, 4, 3, 2), Arrays.asList(3, 2)},
                new Object[]{Arrays.asList(4, 1, 4, 2, 2, 2), Arrays.asList(2, 2, 2)},
                new Object[]{Arrays.asList(3, 4, 3, 2), Arrays.asList(3, 2)}
        };
    }

    @Test
    @Parameters
    public void notAloneTest(List<Integer> numbers, int val, List<Integer> expectedResult) {
        // arrange

        // act
        List<Integer> result = ArrayKatas.notAlone(numbers, val);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForNotAloneTest() {
        return new Object[]{
                new Object[]{Arrays.asList(1, 2, 3), 2, Arrays.asList(1, 3, 3)},
                new Object[]{Arrays.asList(1, 2, 3, 2, 5, 2), 2, Arrays.asList(1, 3, 3, 5, 5, 2)},
                new Object[]{Arrays.asList(3, 4), 3, Arrays.asList(3, 4)},
                new Object[]{Arrays.asList(3, 3), 3, Arrays.asList(3, 3)},
                new Object[]{Arrays.asList(1, 3, 1, 2), 1, Arrays.asList(1, 3, 3, 2)},
                new Object[]{Arrays.asList(3), 3, Arrays.asList(3)},
                new Object[]{Arrays.asList(), 3, Arrays.asList()},
                new Object[]{Arrays.asList(7, 1, 6), 1, Arrays.asList(7, 7, 6)},
                new Object[]{Arrays.asList(1, 1, 1), 1, Arrays.asList(1, 1, 1)},
                new Object[]{Arrays.asList(1, 1, 1, 2), 1, Arrays.asList(1, 1, 1, 2)}
        };
    }

    @Test
    @Parameters
    public void zeroFrontTest(List<Integer> numbers, List<Integer> expectedResult) {
        // arrange

        // act
        List<Integer> result = ArrayKatas.zeroFront(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForZeroFrontTest() {

        return new Object[]{
                new Object[]{new ArrayList<>(Arrays.asList(1, 0, 0, 1)), Arrays.asList(0, 0, 1, 1)},
                new Object[]{new ArrayList<>(Arrays.asList(0, 1, 1, 0, 1)), Arrays.asList(0, 0, 1, 1, 1)},
                new Object[]{new ArrayList<>(Arrays.asList(1, 0)), Arrays.asList(0, 1)},
                new Object[]{new ArrayList<>(Arrays.asList(0, 1)), Arrays.asList(0, 1)},
                new Object[]{new ArrayList<>(Arrays.asList(1, 1, 1, 0)), Arrays.asList(0, 1, 1, 1)},
                new Object[]{new ArrayList<>(Arrays.asList(2, 2, 2, 2)), Arrays.asList(2, 2, 2, 2)},
                new Object[]{new ArrayList<>(Arrays.asList(0, 0, 1, 0)), Arrays.asList(0, 0, 0, 1)},
                new Object[]{new ArrayList<>(Arrays.asList(-1, 0, 0, -1, 0)), Arrays.asList(0, 0, 0, -1, -1)},
                new Object[]{new ArrayList<>(Arrays.asList(0, -3, 0, -3)), Arrays.asList(0, 0, -3, -3)},
                new Object[]{new ArrayList<>(Arrays.asList()), Arrays.asList()},
                new Object[]{new ArrayList<>(Arrays.asList(9, 9, 0, 9, 0, 9)), Arrays.asList(0, 0, 9, 9, 9, 9)}
        };
    }

    @Test
    @Parameters
    public void withoutTenTest(List<Integer> numbers, List<Integer> expectedResult) {
        // arrange

        // act
        List<Integer> result = ArrayKatas.withoutTen(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForWithoutTenTest() {

        return new Object[]{
                new Object[]{new ArrayList<>(Arrays.asList(1, 10, 10, 2)), Arrays.asList(1, 2, 0, 0)},
                new Object[]{new ArrayList<>(Arrays.asList(10, 2, 10)), Arrays.asList(2, 0, 0)},
                new Object[]{new ArrayList<>(Arrays.asList(1, 99, 10)), Arrays.asList(1, 99, 0)},
                new Object[]{new ArrayList<>(Arrays.asList(10, 13, 10, 14)), Arrays.asList(13, 14, 0, 0)},
                new Object[]{new ArrayList<>(Arrays.asList(10, 13, 10, 14, 10)), Arrays.asList(13, 14, 0, 0, 0)},
                new Object[]{new ArrayList<>(Arrays.asList(10, 10, 3)), Arrays.asList(3, 0, 0)},
                new Object[]{new ArrayList<>(Arrays.asList(1)), Arrays.asList(1)},
                new Object[]{new ArrayList<>(Arrays.asList(13, 1)), Arrays.asList(13, 1)},
                new Object[]{new ArrayList<>(Arrays.asList(10)), Arrays.asList(0)},
                new Object[]{new ArrayList<>(Arrays.asList()), Arrays.asList()}
        };
    }

    @Test
    @Parameters
    public void zeroMaxTest(List<Integer> numbers, List<Integer> expectedResult) {
        // arrange

        // act
        List<Integer> result = ArrayKatas.zeroMax(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForZeroMaxTest() {

        return new Object[]{
            new Object[]{new ArrayList<>(Arrays.asList(0, 5, 0, 3)), Arrays.asList(5, 5, 3, 3)},
            new Object[]{new ArrayList<>(Arrays.asList(0, 4, 0, 3)), Arrays.asList(3, 4, 3, 3)},
            new Object[]{new ArrayList<>(Arrays.asList(0, 1, 0)), Arrays.asList(1, 1, 0)},
            new Object[]{new ArrayList<>(Arrays.asList(0, 1, 5)), Arrays.asList(5, 1, 5)},
            new Object[]{new ArrayList<>(Arrays.asList(0, 2, 0)), Arrays.asList(0, 2, 0)},
            new Object[]{new ArrayList<>(Arrays.asList(1)), Arrays.asList(1)},
            new Object[]{new ArrayList<>(Arrays.asList(0)), Arrays.asList(0)},
            new Object[]{new ArrayList<>(Arrays.asList()), Arrays.asList()},
            new Object[]{new ArrayList<>(Arrays.asList(7, 0, 4, 3, 0, 2)), Arrays.asList(7, 3, 4, 3, 0, 2)},
            new Object[]{new ArrayList<>(Arrays.asList(7, 0, 4, 3, 0, 1)), Arrays.asList(7, 3, 4, 3, 1, 1)},
            new Object[]{new ArrayList<>(Arrays.asList(7, 0, 4, 3, 0, 0)), Arrays.asList(7, 3, 4, 3, 0, 0)},
            new Object[]{new ArrayList<>(Arrays.asList(7, 0, 1, 0, 0, 7)), Arrays.asList(7, 7, 1, 7, 7, 7)}
        };
    }


    @Test
    @Parameters
    public void evenOddTest(List<Integer> numbers, List<Integer> expectedResult) {
        // arrange

        // act
        List<Integer> result = ArrayKatas.evenOdd(numbers);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForEvenOddTest() {

        return new Object[]{
                new Object[]{new ArrayList<>(Arrays.asList(1, 0, 1, 0, 0, 1, 1)), Arrays.asList(0, 0, 0, 1, 1, 1, 1)},
                new Object[]{new ArrayList<>(Arrays.asList(3, 3, 2)), Arrays.asList(2, 3, 3)},
                new Object[]{new ArrayList<>(Arrays.asList(2, 2, 2)), Arrays.asList(2, 2, 2)},
                new Object[]{new ArrayList<>(Arrays.asList(3, 2, 2)), Arrays.asList(2, 2, 3)},
                new Object[]{new ArrayList<>(Arrays.asList(1, 1, 0, 1, 0)), Arrays.asList(0, 0, 1, 1, 1)},
                new Object[]{new ArrayList<>(Arrays.asList(1)), Arrays.asList(1)},
                new Object[]{new ArrayList<>(Arrays.asList(1, 2)), Arrays.asList(2, 1)},
                new Object[]{new ArrayList<>(Arrays.asList(2, 1)), Arrays.asList(2, 1)},
                new Object[]{new ArrayList<>(Arrays.asList()), Arrays.asList()}
        };
    }

    @Test
    @Parameters
    public void fizzBuzzTest(int start, int end, List<String> expectedResult) {
        // arrange

        // act
        List<String> result = ArrayKatas.fizzBuzz(start, end);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForFizzBuzzTest() {
        return new Object[]{
                new Object[]{1, 6, Arrays.asList("1", "2", "Fizz", "4", "Buzz")},
                new Object[]{1, 8, Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7")},
                new Object[]{1, 11, Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz")},
                new Object[]{1, 16, Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")},
                new Object[]{1, 4, Arrays.asList("1", "2", "Fizz")},
                new Object[]{1, 2, Arrays.asList("1")},
                new Object[]{50, 56, Arrays.asList("Buzz", "Fizz", "52", "53", "Fizz", "Buzz")},
                new Object[]{15, 17, Arrays.asList("FizzBuzz", "16")},
                new Object[]{30, 36, Arrays.asList("FizzBuzz", "31", "32", "Fizz", "34", "Buzz")},
                new Object[]{1000, 1006, Arrays.asList("Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz")},
                new Object[]{99, 102, Arrays.asList("Fizz", "Buzz", "101")},
                new Object[]{14, 20, Arrays.asList("14", "FizzBuzz", "16", "17", "Fizz", "19")}
        };
    }
}