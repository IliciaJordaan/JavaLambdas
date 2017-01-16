package questions.question1;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StringAndNumberExercisesTest {

    @Test
    public void noLowercaseLettersInAnEmptyString() {
        assertEquals(0, StringAndNumberExercises.countLowercaseLetters(""));
    }

    @Test
    public void countsLowercaseLetterExample() {
        assertEquals(3, StringAndNumberExercises.countLowercaseLetters("aBcDeF"));
    }

    @Test
    public void supportsNoLowercaseLetters() {
        assertEquals(0, StringAndNumberExercises.countLowercaseLetters("ABCDEF"));
    }

    @Test
    public void shouldGetDistinctWordsInList() {
        List<String> wordList = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
        List<String> distinctWords = StringAndNumberExercises.getDistinctWordsInList(wordList);
        assertEquals(Arrays.asList("A", "B", "C", "D"), distinctWords);

    }

    @Test
    public void noStringReturnedForEmptyList() {
        assertFalse(StringAndNumberExercises.mostLowercaseString(Collections.emptyList()).isPresent());
    }

    @Test
    public void findsMostLowercaseString() {
        Optional<String> result = StringAndNumberExercises.mostLowercaseString(Arrays.asList("a", "abc", "ABCde"));
        assertEquals(result, Optional.of("abc"));
    }

    @Test
    public void countOccurrencesInList() {
        List<String> names = Lists.newArrayList("John", "Paul", "George", "John", "Paul", "John");
        Map<String, Long> counts = StringAndNumberExercises.countWordOccurrencesInList(names);

        assertEquals(3, counts.size());
        assertEquals(Long.valueOf(3), counts.get("John"));
        assertEquals(Long.valueOf(2), counts.get("Paul"));
        assertEquals(Long.valueOf(1), counts.get("George"));
    }

    @Test
    public void addsEmptyList() {
        int result = StringAndNumberExercises.addUp(Lists.newArrayList());
        assertEquals(0, result);
    }

    @Test
    public void addsListWithValues() {
        int result = StringAndNumberExercises.addUp(Lists.newArrayList(1, 3, -2));
        assertEquals(2, result);
    }

}
