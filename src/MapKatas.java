import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chris on 8/26/16.
 */
public class MapKatas {

    /**
     * Given an array of strings, return a Map<String, Integer> containing a key for
     * every different string in the array, always with the value 0. For example the
     * string "hello" makes the pair "hello":0. We'll do more complicated counting
     * later, but for this problem the value is simply 0.
     */
    public static Map<String, Integer> word0(List<String> strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String str:strings) {
            result.put(str, 0);
        }
        return result;
    }

    /**
     * Given an array of strings, return a Map<String, Integer> containing a key for
     * every different string in the array, and the value is that string's length.
     */
    public static Map<String, Integer> wordLen(List<String> strings) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String str:strings) {
            result.put(str, str.length());
        }
        return result;
    }

    /**
     * Given an array of non-empty strings, return a Map<String, String> where for
     * every different string in the array, there is a key of its first character
     * with the value of its last character.
     *
     */
    public static Map<String, String> pairs(List<String> strings) {
        Map<String, String> result = new HashMap<String, String>();
        for (String str: strings) {
            result.put(str.substring(0,1), str.substring(str.length() - 1));
        }
        return result;
    }

    /**
     * The classic word-count algorithm: given an array of strings, return a
     * Map<String, Integer> with a key for each different string, with the value
     * the number of times that string appears in the array.
     */
    public static Map<String, Integer> wordCount(List<String> strings) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        int count;
        for (String str: strings) {
            if (result.containsKey(str)) {
                count = result.get(str);
                result.replace(str, ++count);
            } else {
                result.put(str, 1);
            }
        }
        return result;
    }

    /**
     * Given an array of non-empty strings, return a Map<String, String> with a key
     * for every different first character seen, with the value of all the strings
     * starting with that character appended together in the order they appear in
     * the array.
     */
    public static Map<String, String> firstChar(List<String> strings) {
        Map<String, String> result = new HashMap<String, String>();
        String temp;

        for (String str: strings) {
            if (result.containsKey(str.substring(0, 1))) {
                temp = result.get(str.substring(0, 1));
                result.put(str.substring(0, 1), temp + str);
            } else {
                result.put(str.substring(0, 1), str);
            }
        }
        return result;
    }

    /**
     * Loop over the given array of strings to build a result string like this: when
     * a string appears the 2nd, 4th, 6th, etc. time in the array, append the string
     * to the result. Return the empty string no string appears a 2nd time.
     */
    public static String wordAppend(List<String> strings) {
        String result = "";
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        int temp;

        for (String str: strings) {
            if (hashmap.containsKey(str)) {
                temp = hashmap.get(str);
                hashmap.put(str, ++temp);
                if (hashmap.get(str) %2 == 0) {
                    result = result + str;
                }
            } else {
                hashmap.put(str, 1);
            }
        }
        return result;
    }

    /**
     * Given an array of strings, return a Map<String, Boolean> where each different
     * string is a key and value is true only if that string appears 2 or more times
     * in the array.
     */
    public static Map<String, Boolean> wordMultiple(List<String> strings) {
        Map<String, Boolean> result = new HashMap<String, Boolean>();
        for (String str:strings) {
            if (result.containsKey(str)) {
                result.replace(str, true);
            } else {
                result.put(str, false);
            }
        }
        return result;
    }

    /**
     * We'll say that 2 strings "match" if they are non-empty and their first chars
     * are the same. Loop over and then return the given array of non-empty strings
     * as follows: if a string matches an earlier string in the array, swap the 2
     * strings in the array. When a position in the arrays has been swapped, it no
     * longer matches anything. Using a map, this can be solved making just one pass
     * over the array. More difficult than it looks.
     */
    public static List<String> allSwap(List<String> strings) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String str;
        String temp;

        for (int i = 0; i < strings.size(); i++) {
            str = strings.get(i);
            if (hashMap.containsKey(str.substring(0, 1))) {
                if (hashMap.get(str.substring(0, 1)) != -1) {
                    strings.set(i, strings.get(hashMap.get(str.substring(0, 1))));
                    strings.set(hashMap.get(str.substring(0, 1)), str);
                    hashMap.replace(str.substring(0, 1), -1);
                } else {
                    hashMap.replace(str.substring(0, 1), i);
                }
            } else {
                hashMap.put(str.substring(0, 1), i);
            }
        }
        return strings;
    }

    /**
     * We'll say that 2 strings "match" if they are non-empty and their first chars
     * are the same. Loop over and then return the given array of non-empty strings
     * as follows: if a string matches an earlier string in the array, swap the 2
     * strings in the array. A particular first char can only cause 1 swap, so once
     * a char has caused a swap, its later swaps are disabled. Using a map, this can
     * be solved making just one pass over the array. More difficult than it looks.
     */
    public static List<String> firstSwap(List<String> strings) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String str;
        String temp;

        for (int i = 0; i < strings.size(); i++) {
            str = strings.get(i);
            if (hashMap.containsKey(str.substring(0, 1))) {
                if (hashMap.get(str.substring(0, 1)) != -1) {
                    strings.set(i, strings.get(hashMap.get(str.substring(0, 1))));
                    strings.set(hashMap.get(str.substring(0, 1)), str);
                    hashMap.replace(str.substring(0, 1), -1);
                }// else {
//                    hashMap.replace(str.substring(0, 1), i);
//                }
            } else {
                hashMap.put(str.substring(0, 1), i);
            }
        }
        return strings;
    }

}
