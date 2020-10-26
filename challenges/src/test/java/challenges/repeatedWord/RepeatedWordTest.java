package challenges.repeatedWord;

import static org.junit.Assert.*;
import org.junit.Test;

public class RepeatedWordTest {

    @Test
    public void repeatedWordTests() throws Exception {
        RepeatedWord repeated = new RepeatedWord();
        String string = "Once upon a time, there was a brave princess who...";
        String output = "a";

        assertEquals(output, repeated.repeatedWord(string));
    }

    @Test
    public void repeatedWordLongerSentenceTest() throws Exception {
        RepeatedWord repeated = new RepeatedWord();
        String string = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        String output = "summer";

        assertEquals(output, repeated.repeatedWord(string));
    }

    @Test
    public void repeatedWordParagraphSentenceTest() throws Exception {
        RepeatedWord repeated = new RepeatedWord();
        String string = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String output = "it";

        assertEquals(output, repeated.repeatedWord(string));
    }

    @Test
    public void repeatedWordEmptyString() throws Exception {
        RepeatedWord repeated = new RepeatedWord();
        String string = "";

        assertNull(repeated.repeatedWord(string));
    }

    @Test
    public void noRepeatedWordsTest() throws Exception {
        RepeatedWord repeated = new RepeatedWord();
        String string = "A dog jumped over the fence while barking.";

        assertNull(repeated.repeatedWord(string));
    }

}
