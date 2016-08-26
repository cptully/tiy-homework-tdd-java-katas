import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by chris on 8/23/16.
 */
public class ArrayKatas {

    // private ArrayList<Integer> nums;

    /*public ArrayKatas() {
    }

    public ArrayKatas(int... numbers) {
        for (int number: numbers) {
            nums.add(number);
        }
    }*/

    /**
     * This one was a test case for Parameterized testing
     * <p>
     * Given an array of ints, return true if 6 appears as either the first or
     * last element in the array. The array will be length 1 or more.
     *
     * @param nums An array of integers to be tested
     * @return returns true if the first or last item of the array is 6
     */
    public static boolean firstLast6(List<Integer> nums) {
        return ((nums.get(0) == 6) || (nums.get(nums.size() - 1) == 6));
    }

    /**
     * Return the number of even ints in the given array. Note: the % "mod"
     * operator computes the remainder, e.g. 5 % 2 is 1.
     */
    public static int countEvens(List<Integer> nums) {
        int count = 0;

        for (int number : nums) {
            if ((number % 2) == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given an array length 1 or more of ints, return the difference between the
     * largest and smallest values in the array. Note: the built-in Math.min(v1, v2)
     * and Math.max(v1, v2) methods return the smaller or larger of two values.
     */
    public static int bigDiff(List<Integer> numbers) {
        int min = numbers.get(0);
        int max = 0;

        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        return max - min;
    }

    /**
     * Return the "centered" average of an array of ints, which we'll say is the mean
     * average of the values, except ignoring the largest and smallest values in the
     * array. If there are multiple copies of the smallest value, ignore just one copy,
     * and likewise for the largest value. Use int division to produce the final average.
     * You may assume that the array is length 3 or more.
     */
    public static int centeredAverage(List<Integer> numbers) {
        int min = numbers.get(0);
        int max = 0;
        int sum = 0;

        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
            sum += number;
        }

        return (sum - min - max) / (numbers.size() - 2);
    }

    /**
     * Return the sum of the numbers in the array, returning 0 for an empty array.
     * Except the number 13 is very unlucky, so it does not count and numbers that
     * come immediately after a 13 also do not count.
     */
    public static int sum13(List<Integer> numbers) {
        boolean skipNext = false;
        int sum = 0;

        for (int number : numbers) {
            if ((number != 13) && !skipNext) {
                sum += number;
            } else if (number == 13) {
                skipNext = true;
            } else if (skipNext) {
                skipNext = false;
            }
        }

        return sum;
    }

    /**
     * Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
     */
    public static boolean has22(List<Integer> numbers) {
        boolean has22 = false;

        for (int i = 0; i < (numbers.size() - 1); i++) {
            if ((numbers.get(i) == 2) && (numbers.get(i + 1) == 2)) {
                has22 = true;
                break;
            }
        }
        return has22;
    }

    /**
     * Given an array of ints, return true if the array contains no 1's and no 3's.
     */
    public static boolean lucky13(List<Integer> numbers) {
        return !numbers.contains(1) && !numbers.contains(3);
    }

    /**
     * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
     */
    public static boolean sum28(List<Integer> numbers) {
        int sum = 0;

        for (int number : numbers) {
            if (number == 2) sum += number;
        }

        if (sum == 8) return true;
        return false;
    }

    /**
     * Given an array of ints, return true if the number of 1's is greater than the number of 4's
     */
    public static boolean more14(List<Integer> numbers) {
        int count1s = 0;
        int count4s = 0;

        for (int number : numbers) {
            if (number == 1) {
                count1s++;
            } else if (number == 4) {
                count4s++;
            }
        }
        return count1s > count4s;
    }

    /**
     * Given a number n, create and return a new int array of length n, containing
     * the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return
     * a length 0 array. You do not need a separate if-statement for the length-0
     * case; the for-loop should naturally execute 0 times in that case, so it just
     * works. The syntax to make a new int array is: new int[desired_length]
     * (See also: FizzBuzz Code)
     */
    public static List<Integer> fizzArray(int n) {
        List<Integer> result = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            result.add(i);
        }
        return result;
    }

    /**
     * Given an array of ints, return true if every element is a 1 or a 4
     */
    public static boolean only14(List<Integer> numbers) {
        boolean result = true;
        for (int number:numbers) {
            if (!(number == 1) && !(number == 4)) result = false;
        }
        return result;
    }

    /**
     * Given a number n, create and return a new string array of length n, containing
     * the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return
     * a length 0 array. Note: String.valueOf(xxx) will make the String form of most
     * types. The syntax to make a new string array is: new String[desired_length]
     * (See also: FizzBuzz Code)
     */
    public static List<String> fizzArray2(int n) {
        List<String> result = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }

    /**
     * Given an array of ints, return true if it contains no 1's or it contains no 4's.
     */
    public static boolean no14(List<Integer> numbers) {
        boolean result = true;

        if ((numbers.contains(1)) && (numbers.contains(4))) result = false;
        return result;
    }

    /**
     * We'll say that a value is "everywhere" in an array if for every pair of adjacent
     * elements in the array, at least one of the pair is that value. Return true if the
     * given value is everywhere in the array.
     */
    public static boolean isEverywhere(List<Integer> numbers, int val) {
        boolean result = true;

        for (int i = 1; i < numbers.size(); i++) {
            if (!(numbers.get(i-1) == val) && !(numbers.get(i) == val)) result = false;
        }
        return result;
    }

    /**
     * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4
     * next to a 4, but not both.
     */
    public static boolean either24(List<Integer> numbers) {
        boolean result = false;
        for (int i = 1; i < numbers.size(); i++) {
            if (((numbers.get(i) == 2) && (numbers.get(i-1) == 2))
                || ((numbers.get(i) == 4) && (numbers.get(i-1) == 4))) {
                if (!result) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Given arrays nums1 and nums2 of the same length, for every element in nums1,
     * consider the corresponding element in nums2 (at the same index). Return the
     * count of the number of times that the two elements differ by 2 or less, but
     * are not equal.
     */
    public static int matchUp(List<Integer> numbers1, List<Integer> numbers2) {
        int result = 0;

        for(int i = 0; i < numbers1.size(); i++){
            if (!numbers1.get(i).equals(numbers2.get(i))) {
                if ((numbers1.get(i) <= (numbers2.get(i) + 2)) && (numbers1.get(i) >= (numbers2.get(i) - 2))) {
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * Given an array of ints, return true if the array contains two 7's next to
     * each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
     */
    public static boolean has77(List<Integer> numbers) {
        boolean result = false;
        for (int i = 1; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(7) && (numbers.get(i - 1).equals(7) || (numbers.get(i + 1).equals(7)))) {
                result = true;
            }
        }
        for (int i = 0; i < numbers.size() - 2; i++) {
            if (numbers.get(i).equals(7) && (numbers.get(i + 1).equals(7) || (numbers.get(i + 2).equals(7)))) {
                result = true;
            }
        }
        return result;
    }

    /**
     * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
     */
    public static boolean has12(List<Integer> numbers) {
        boolean result = false;

        if (numbers.contains(1) && numbers.contains(2)) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i).equals(1)){
                    for (int j = i+1; j < numbers.size(); j++) {
                        if (numbers.get(j).equals(2)) result = true;
                    }
                }
            }
        }
        return result;
    }

    /**
     * Given an array of ints, return true if the array contains either 3 even or
     * 3 odd values all next to each other.
     */
    public static boolean modThree(List<Integer> numbers) {
        //Boolean result = false;
        int evenCount = 0;
        int oddCount = 0;
        boolean lastEven = false;

        if (numbers.size() < 1) {
            return false;
        } else {
            if ((numbers.get(0) % 2) == 0) lastEven = true;

            for (int i = 0; i < numbers.size(); i++) {
                numbers.set(i, numbers.get(i) % 2);
                if (numbers.get(i).equals(0)) {
                    if (lastEven) {
                        evenCount++;
                    } else {
                        evenCount++;
                        oddCount = 0;
                    }
                    lastEven = true;
                } else {
                    if (!lastEven) {
                        oddCount++;
                    } else {
                        oddCount++;
                        evenCount = 0;
                    }
                    lastEven = false;
                }
                if ((evenCount > 2) || (oddCount > 2)) break;
            }
            return ((evenCount > 2) || (oddCount > 2));
        }
    }

    /**
     * Given an array of ints, return true if the value 3 appears in the array
     * exactly 3 times, and no 3's are next to each other.
     */
    public static boolean haveThree(List<Integer> numbers) {
        int threeCount = 0;

        if (numbers.size() > 2) {
            for (int i = 0; i < numbers.size(); i++) {
                if (i == 0) {
                    if ((numbers.get(i).equals(3)) && (!numbers.get(i + 1).equals(3))) {
                        threeCount++;
                    }
                } else if (i == (numbers.size() - 1)) {
                    if ((numbers.get(i).equals(3)) && (!numbers.get(i - 1).equals(3))) {
                        threeCount++;
                    }
                } else {
                    if ((!numbers.get(i - 1).equals(3)) && (numbers.get(i).equals(3)) && (!numbers.get(i + 1).equals(3))) {
                        threeCount++;
                    }
                }
            }
        }
        return (threeCount == 3);
    }

    /**
     * Given an array of ints, return true if every 2 that appears in the array is next to another 2.
     */
    public static boolean twoTwo(List<Integer> numbers) {
        boolean result = false;

        if (numbers.contains(2)) {
            if (numbers.size() >= 2) {
                for (int i = 0; i < numbers.size(); i++) {
                    if (i == 0) {
                        if (numbers.get(i).equals(2)) {
                            if (numbers.get(i + 1).equals(2)) {
                                result = true;
                            } else {
                                result = false;
                            }
                        }
                    } else if (i == (numbers.size() - 1)) {
                        if (numbers.get(i).equals(2)) {
                            if (numbers.get(i - 1).equals(2)) {
                                result = true;
                            } else {
                                result = false;
                            }
                        }
                    } else {
                        if (numbers.get(i).equals(2)) {
                            if ((numbers.get(i - 1).equals(2)) || (numbers.get(i + 1).equals(2))) {
                                result = true;
                            } else {
                                result = false;
                            }
                        }
                    }
                }
            }
        } else {
            result = true;
        }
        return result;
    }

    /**
     * Return true if the group of N numbers at the start and end of the array are the
     * same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0
     * and n=2, and false for n=1 and n=3. You may assume that n is in the range
     * 0..nums.length inclusive.
     */
    public static boolean sameEnds(List<Integer> numbers, int len) {
        if (len > numbers.size()) return false;

        return numbers.subList(0, len).equals(numbers.subList(numbers.size() - len, numbers.size()));
    }

    /**
     * Return true if the array contains, somewhere, three increasing adjacent numbers
     * like .... 4, 5, 6, ... or 23, 24, 25.
     */
    public static boolean tripleUp(List<Integer> numbers) {
        boolean onePair = false;
        boolean triple = false;

        for (int i = 1; i < numbers.size(); i++) {
            if ((numbers.get(i-1) + 1) == (numbers.get(i))) {
                if (!onePair) {
                    onePair = true;
                } else {
                    return true;
                }
            } else {
                onePair = false;
            }
        }
        return false;
    }

    /**
     * Given start and end numbers, return a new array containing the sequence of
     * integers from start up to but not including end, so start=5 and end=10
     * yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the
     * start number. Note that a length-0 array is valid. (See also: FizzBuzz Code)
     */
    public static List<Integer> fizzArray3(int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(i);
        }
        return result;
    }

    /**
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns
     * {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
     */
    public static List<Integer> shiftLeft(List<Integer> ints) {
        Collections.rotate(ints, ints.size() - 1);
        return ints;
    }

    /**
     * For each multiple of 10 in the given array, change all the values following
     * it to be that multiple of 10, until encountering another multiple of 10.
     * So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
     */
    public static List<Integer> tenRun(List<Integer> numbers) {
        int lastTen = -1;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 10 == 0) {
                lastTen = numbers.get(i);
            } else if (lastTen != -1) {
                numbers.set(i, lastTen);
            }
        }
        return numbers;
    }

    /**
     * Given a non-empty array of ints, return a new array containing the elements
     * from the original array that come before the first 4 in the original array.
     * The original array will contain at least one 4. Note that it is valid in
     * java to create an array of length 0.
     */
    public static List<Integer> pre4(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(4)) {
                break;
            } else {
                result.add(numbers.get(i));
            }
        }
        return result;
    }

    /**
     * Given a non-empty array of ints, return a new array containing the elements
     * from the original array that come after the last 4 in the original array.
     * The original array will contain at least one 4. Note that it is valid in
     * java to create an array of length 0.
     */
    public static List<Integer> post4(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (int i = numbers.size() - 1; i > 0; i--) {
            if (numbers.get(i).equals(4)) {
                break;
            } else {
                result.add(0, numbers.get(i));
            }
        }
        return result;

    }

    /**
     * We'll say that an element in an array is "alone" if there are values before
     * and after it, and those values are different from it. Return a version of
     * the given array where every instance of the given value which is alone is
     * replaced by whichever value to its left or right is larger.
     */
    public static List<Integer> notAlone(List<Integer> numbers, int val) {
         if (numbers.contains(val)) {
            for (int i = 1; i < numbers.size() - 1; i++) {
                if (numbers.get(i) == val) {
                    if (!(numbers.get(i).equals(numbers.get(i - 1)) || numbers.get(i).equals(numbers.get(i + 1)))) {
                        if (numbers.get(i - 1) > numbers.get(i + 1)) {
                            numbers.set(i, numbers.get(i - 1));
                        } else {
                            numbers.set(i, numbers.get(i + 1));
                        }
                    }
                }
            }
        }
        return numbers;
    }

    /**
     * Return an array that contains the exact same numbers as the given array, but
     * rearranged so that all the zeros are grouped at the start of the array. The
     * order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes
     * {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
     */
    public static List<Integer> zeroFront(List<Integer> numbers) {
        int temp;

        if (numbers.size() == 0) return numbers;

        Collections.sort(numbers);
        if (numbers.get(0) < 0) {
            int i = 0;
            do {
                if (numbers.get(i) != 0) {
                    temp = numbers.remove(i);
                    numbers.add(temp);
                }
            } while (numbers.get(i) < 0);
        }
        return numbers;
    }

    /**
     * Return a version of the given array where all the 10's have been removed.
     * The remaining elements should shift left towards the start of the array as
     * needed, and the empty spaces a the end of the array should be 0.
     * So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given
     * array or make a new array.
     */
    public static List<Integer> withoutTen(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i).equals(10)){
                numbers.remove(i);
                numbers.add(0);
                i--;
            }
        }
        return numbers;
    }

    /**
     * Return a version of the given array where each zero value in the array is
     * replaced by the largest odd value to the right of the zero in the array.
     * If there is no odd value to the right of the zero, leave the zero as a zero.
     */
    public static List<Integer> zeroMax(List<Integer> numbers) {
        int max = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(0)) {
                for (int j = i + 1; j < numbers.size(); j++) {
                    if ((numbers.get(j) > max) && (numbers.get(j) % 2 == 1)) max = numbers.get(j);
                }
                numbers.set(i, max);
                max = 0;
            }
        }
        return numbers;
    }


    /**
     * Return an array that contains the exact same numbers as the given array, but
     * rearranged so that all the even numbers come before all the odd numbers. Other
     * than that, the numbers can be in any order. You may modify and return the
     * given array, or make a new array.
     */
    public static List<Integer> evenOdd(List<Integer> numbers) {
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (int number:numbers) {
            if (number % 2 == 0) {
                evens.add(number);
            } else {
                odds.add(number);
            }
        }

        for (int number: odds) {
            evens.add(number);
        }

        return evens;
    }

    /**
     * This is slightly more difficult version of the famous FizzBuzz problem which
     * is sometimes given as a first problem for job interviews. (See also: FizzBuzz
     * Code.) Consider the series of numbers beginning at start and running up to but
     * not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4.
     * Return a new String[] array containing the string form of these numbers, except
     * for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use
     * "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx)
     * will make the String form of an int or other type. This version is a little more
     * complicated than the usual version since you have to allocate and index into an
     * array instead of just printing, and we vary the start/end instead of just always
     * doing 1..100.
     */
    public static ArrayList<String> fizzBuzz(int start, int end) {
        ArrayList<String> result = new ArrayList<>();

        for (int x = start; x < end; x++) {
            //if ((x % 3 == 0) && (x % 5 ==0))
            if (x % 15 == 0){
                result.add("FizzBuzz");
            } else if (x % 3 == 0) {
                result.add("Fizz");
            } else if (x % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(x));
            }
        }
        return result;
    }


}
