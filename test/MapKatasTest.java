import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.*;
import java.util.function.BooleanSupplier;


/**
 * Created by chris on 8/26/16.
 */

@RunWith(JUnitParamsRunner.class)
public class MapKatasTest {
    private Map<String, Integer> result1 = new HashMap<>();

    @Test
    @Parameters
    public void word0Test(List<String> strList, Map<String, Integer> expectedResult) {
        // arrange

        // act
        Map<String, Integer> result = MapKatas.word0(strList);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForWord0Test() {
        return new Object[]{
                new Object[]{new ArrayList<>(Arrays.asList("a", "b", "a", "c", "b")), new HashMap<String, Integer>() {
                    {
                        put("a", 0);
                        put("b", 0);
                        put("c", 0);
                    }
                }},
                new Object[]{new ArrayList<>(Arrays.asList("c", "b", "a")), new HashMap<String, Integer>() {
                    {
                        put("a", 0);
                        put("b", 0);
                        put("c", 0);
                    }
                }},
                new Object[]{new ArrayList<>(Arrays.asList("c", "c", "c", "c")), new HashMap<String, Integer>() {
                    {
                        put("c", 0);
                    }
                }},
                new Object[]{new ArrayList<>(Arrays.asList()), new HashMap<String, Integer>() {
                    {
                    }
                }}
        };
    }

    @Test
    @Parameters
    public void wordLenTest(List<String> strList, Map<String, Integer> expectedResult) {
        // arrange

        // act
        Map<String, Integer> result = MapKatas.wordLen(strList);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForWordLenTest() {
        return new Object[]{
                new Object[]{new ArrayList<>(Arrays.asList("a", "bb", "a", "bb")), new HashMap<String, Integer>() {
                    {
                        put("a", 1);
                        put("bb", 2);
                    }
                }},
                new Object[]{new ArrayList<>(Arrays.asList("this", "and", "that", "and")), new HashMap<String, Integer>() {
                    {
                        put("that", 4);
                        put("this", 4);
                        put("and", 3);
                    }
                }},
                new Object[]{new ArrayList<>(Arrays.asList("code", "code", "code", "bug")), new HashMap<String, Integer>() {
                    {
                        put("bug", 3);
                        put("code", 4);
                    }
                }},
                new Object[]{new ArrayList<>(Arrays.asList()), new HashMap<String, Integer>() {
                    {
                    }
                }},
                new Object[]{new ArrayList<>(Arrays.asList("z")), new HashMap<String, Integer>() {
                    {
                        put("z", 1);
                    }
                }}
        };

    }

    @Test
    @Parameters
    public void pairsTest(List<String> strList, Map<String, String> expectedResult) {
        // arrange

        // act
        Map<String, String> result = MapKatas.pairs(strList);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForPairsTest() {
        return new Object[]{
                new Object[]{new ArrayList<>(Arrays.asList("code", "bug")), new HashMap<String, String>() {{
                    put("c", "e");
                    put("b", "g");
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("man", "moon", "main")), new HashMap<String, String>() {{
                    put("m", "n");
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("man", "moon", "good", "night")), new HashMap<String, String>() {{
                    put("m", "n");
                    put("g", "d");
                    put("n", "t");
                }}},
                new Object[]{new ArrayList<>(Arrays.asList()), new HashMap<String, String>() {{
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("a", "b")), new HashMap<String, String>() {{
                    put("a", "a");
                    put("b", "b");
                    ;
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("are", "codes", "and", "cods")), new HashMap<String, String>() {{
                    put("a", "d");
                    put("c", "s");
                }}}
        };
    }

    @Test
    @Parameters
    public void wordCountTest(List<String> strList, Map<String, Integer> expectedResult) {
        // arrange

        // act
        Map<String, Integer> result = MapKatas.wordCount(strList);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForWordCountTest() {
        return new Object[]{
                new Object[]{new ArrayList<>(Arrays.asList("a", "b", "a", "c", "b")), new HashMap<String, Integer>() {{
                    put("b", 2);
                    put("c", 1);
                    put("a", 2);
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("c", "b", "a")), new HashMap<String, Integer>() {{
                    put("b", 1);
                    put("c", 1);
                    put("a", 1);
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("c", "c", "c", "c")), new HashMap<String, Integer>() {{
                    put("c", 4);
                }}},
                new Object[]{new ArrayList<>(Arrays.asList()), new HashMap<String, Integer>() {{
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("this", "and", "this", "")), new HashMap<String, Integer>() {{
                    put("", 1);
                    put("this", 2);
                    put("and", 1);
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b",
                        "z", "x", "b", "f", "x", "two", "b", "one", "two")),
                        new HashMap<String, Integer>() {{
                            put("f", 1);
                            put("two", 2);
                            put("d", 3);
                            put("e", 1);
                            put("b", 5);
                            put("one", 1);
                            put("a", 4);
                            put("z", 2);
                            put("x", 2);
                        }}}
        };
    }

    @Test
    @Parameters
    public void firstCharTest(List<String> strList, Map<String, String> expectedResult) {
        // arrange

        // act
        Map<String, String> result = MapKatas.firstChar(strList);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForFirstCharTest() {
        return new Object[]{

                new Object[]{new ArrayList<>(Arrays.asList("salt", "tea", "soda", "toast")), new HashMap<String, String>() {{
                    put("t", "teatoast");
                    put("s", "saltsoda");
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("aa", "bb", "cc", "aAA", "cCC", "d")), new HashMap<String, String>() {{
                    put("d", "d");
                    put("b", "bb");
                    put("c", "cccCC");
                    put("a", "aaaAA");
                }}},
                new Object[]{new ArrayList<>(Arrays.asList()), new HashMap<String, String>() {{
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells")), new HashMap<String, String>() {{
                    put("s", "saltsun");
                    put("b", "bellsbellsbells");
                    put("a", "appleaardvark");
                    put("z", "zen");
                }}}
        };
    }

    @Test
    @Parameters
    public void wordAppendTest(List<String> strList, String expectedResult) {
        // arrange

        // act
        String result = MapKatas.wordAppend(strList);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForWordAppendTest() {
        return new Object[]{
                new Object[]{new ArrayList<>(Arrays.asList("a", "b", "a")), "a"},
                new Object[]{new ArrayList<>(Arrays.asList("a", "", "a")), "a"},
                new Object[]{new ArrayList<>(Arrays.asList()), ""},
                new Object[]{new ArrayList<>(Arrays.asList("a", "b", "b", "a", "a")), "ba"},
                new Object[]{new ArrayList<>(Arrays.asList("a", "b", "b", "b", "a", "c", "a", "a")), "baa"},
                new Object[]{new ArrayList<>(Arrays.asList("a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a")), "baaba"},
                new Object[]{new ArrayList<>(Arrays.asList("not", "and", "or", "and", "this", "and", "or", "that", "not")), "andornot"},
                new Object[]{new ArrayList<>(Arrays.asList("a", "b", "c")), ""},
                new Object[]{new ArrayList<>(Arrays.asList("this", "or", "that", "and", "this", "and", "that")), "thisandthat"},
                new Object[]{new ArrayList<>(Arrays.asList("xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx")), "xxyyzzxx"}
        };
    }

    @Test
    @Parameters
    public void wordMultipleTest(List<String> strList, Map<String, Boolean> expectedResult) {
        // arrange

        // act
        Map<String, Boolean> result = MapKatas.wordMultiple(strList);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForWordMultipleTest() {
        return new Object[]{
                new Object[]{new ArrayList<>(Arrays.asList("a", "b", "a", "c", "b")), new HashMap<String, Boolean>() {{
                    put("b", true);
                    put("c", false);
                    put("a", true);
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("c", "b", "a")), new HashMap<String, Boolean>() {{
                    put("b", false);
                    put("c", false);
                    put("a", false);
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("c", "c", "c", "c")), new HashMap<String, Boolean>() {{
                    put("c", true);
                }}},
                new Object[]{new ArrayList<>(Arrays.asList()), new HashMap<String, Boolean>() {{
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("this", "and", "this")), new HashMap<String, Boolean>() {{
                    put("this", true);
                    put("and", false);
                }}},
                new Object[]{new ArrayList<>(Arrays.asList("d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x")), new HashMap<String, Boolean>() {{
                    put("d", true);
                    put("e", false);
                    put("b", true);
                    put("a", true);
                    put("z", true);
                    put("x", false);
                }}}
        };

    }

    @Test
    @Parameters
    public void allSwapTest(List<String> strList, List<String> expectedResult) {
        // arrange

        // act
        List<String> result = MapKatas.allSwap(strList);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForAllSwapTest() {
        return new Object[]{
                new Object[]{new ArrayList<>(Arrays.asList("ab", "ac")), new ArrayList<>(Arrays.asList("ac", "ab"))}, //"ab", "ac"]	X
                new Object[]{new ArrayList<>(Arrays.asList("ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz")), new ArrayList<>(Arrays.asList("ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"))},
                new Object[]{new ArrayList<>(Arrays.asList("ax", "bx", "ay", "by", "ai", "aj", "bx", "by")), new ArrayList<>(Arrays.asList("ay", "by", "ax", "bx", "aj", "ai", "by", "bx"))},
                new Object[]{new ArrayList<>(Arrays.asList("ax", "bx", "cx", "ay", "cy", "aaa", "abb")), new ArrayList<>(Arrays.asList("ay", "bx", "cy", "ax", "cx", "abb", "aaa"))},
                new Object[]{new ArrayList<>(Arrays.asList("easy", "does", "it", "every", "ice", "eaten")), new ArrayList<>(Arrays.asList("every", "does", "ice", "easy", "it", "eaten"))},
                new Object[]{new ArrayList<>(Arrays.asList("list", "of", "words", "swims", "over", "lily", "water", "wait")), new ArrayList<>(Arrays.asList("lily", "over", "water", "swims", "of", "list", "words", "wait"))},
                new Object[]{new ArrayList<>(Arrays.asList("4", "8", "15", "16", "23", "42")), new ArrayList<>(Arrays.asList("42", "8", "16", "15", "23", "4"))},
                new Object[]{new ArrayList<>(Arrays.asList("aaa")), new ArrayList<>(Arrays.asList("aaa"))},
                new Object[]{new ArrayList<>(Arrays.asList()), new ArrayList<>(Arrays.asList())},
                new Object[]{new ArrayList<>(Arrays.asList("a", "b", "c", "xx", "yy", "zz")), new ArrayList<>(Arrays.asList("a", "b", "c", "xx", "yy", "zz"))}
        };
    }

    @Test
    @Parameters
    public void firstSwapTest(List<String> strList, List<String> expectedResult) {
        // arrange

        // act
        List<String> result = MapKatas.firstSwap(strList);

        // assert
        assertThat(result, is(expectedResult));
    }

    private Object[] parametersForFirstSwapTest() {
        return new Object[]{
                new Object[]{new ArrayList<>(Arrays.asList("ab", "ac")), new ArrayList<>(Arrays.asList("ac", "ab"))},
                new Object[]{new ArrayList<>(Arrays.asList("ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz")), new ArrayList<>(Arrays.asList("ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"))},
                new Object[]{new ArrayList<>(Arrays.asList("ax", "bx", "ay", "by", "ai", "aj", "bx", "by")), new ArrayList<>(Arrays.asList("ay", "by", "ax", "bx", "ai", "aj", "bx", "by"))},
                new Object[]{new ArrayList<>(Arrays.asList("ax", "bx", "cx", "ay", "cy", "aaa", "abb")), new ArrayList<>(Arrays.asList("ay", "bx", "cy", "ax", "cx", "aaa", "abb"))},
                new Object[]{new ArrayList<>(Arrays.asList("easy", "does", "it", "every", "ice", "eaten")), new ArrayList<>(Arrays.asList("every", "does", "ice", "easy", "it", "eaten"))},
                new Object[]{new ArrayList<>(Arrays.asList("list", "of", "words", "swims", "over", "lily", "water", "wait")), new ArrayList<>(Arrays.asList("lily", "over", "water", "swims", "of", "list", "words", "wait"))},
                new Object[]{new ArrayList<>(Arrays.asList("4", "8", "15", "16", "23", "42")), new ArrayList<>(Arrays.asList("42", "8", "16", "15", "23", "4"))},
                new Object[]{new ArrayList<>(Arrays.asList("aaa")), new ArrayList<>(Arrays.asList("aaa"))},
                new Object[]{new ArrayList<>(Arrays.asList()), new ArrayList<>(Arrays.asList())},
                new Object[]{new ArrayList<>(Arrays.asList("a", "b", "c", "xx", "yy", "zz")), new ArrayList<>(Arrays.asList("a", "b", "c", "xx", "yy", "zz"))}
        };
    }
}