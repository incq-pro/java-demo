package pro.incq.cleancode.kata.wordwrapper;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static pro.incq.cleancode.kata.wordwrapper.WordWrapper.*;

public class WordWrapTest {
    @Test
    public void WrapNullReturnsEmptyString() throws Exception {
        assertThat(wrap(null, 10), is(""));
    }

    @Test
    public void WrapEmptyStringReturnsEmptyString() throws Exception {
        assertThat(wrap("", 10), is(""));
    }

    @Test(expected = WordWrapper.InvalidArgument.class)
    public void LengthLessThanOneShouldThrowInvalidArgument() throws Exception {
        wrap("xxx", 0);
    }

    @Test
    public void OneShortWordDoesNotWrap() throws Exception {
        assertThat(wrap("word", 5), is("word"));
    }

    @Test
    public void WordLongerThanLengthBreaksAtLength() throws Exception {
        assertThat(wrap("longword", 4), is("long\nword"));
        assertThat(wrap("longerword", 6), is("longer\nword"));
    }

    @Test
    public void WordLongerThanTwiceLengthShouldBreakTwice() throws Exception {
        assertThat(wrap("verylongword", 4), is("very\nlong\nword"));
    }

    @Test
    public void TwoWordsLongerThanLimitShouldWrap() throws Exception {
        assertThat(wrap("word word", 6), is("word\nword"));
        assertThat(wrap("wrap here", 6), is("wrap\nhere"));
    }

    @Test
    public void ThreeWordsEachLongerThanLimitShouldWrap() throws Exception {
        assertThat(wrap("word word word", 6), is("word\nword\nword"));
    }

    @Test
    public void ThreeWordsJustOverTheLimitShouldBreakAtSecond() throws Exception {
        assertThat(wrap("word word word", 11), is("word word\nword"));
    }

    @Test
    public void TwoWordsTheFirstEndingAtTheLimit() throws Exception {
        assertThat(wrap("word word", 4), is("word\nword"));
    }

}