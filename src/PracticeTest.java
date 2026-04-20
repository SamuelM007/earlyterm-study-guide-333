import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testLongestWordByCharPeterPiper(){
        // Arrange
        String[] words = {"peter","piper","picked","a", "peck","of","pickled","peppers", "peppering"};
        // Act
        String actual = Practice.longestWordByChar(words, 'p');
        // Assert
        assertEquals("peppering", actual);
    }
    

    // TODO: Make tests for each problem you solve
    
}


