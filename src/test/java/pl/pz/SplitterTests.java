package pl.pz;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SplitterTests {

    @Test
    public void shouldSplitOnGivenString(){
        //given
        Splitter splitter = Splitter.on(", ");
        //when
        Iterable<String> strings =  splitter.split("abc, 123, IIIIII");
        //then
        assertTrue(Iterables.contains(strings, "abc"));
        assertTrue(Iterables.contains(strings, "123"));
        assertTrue(Iterables.contains(strings, "IIIIII"));
    }

    @Test
    public void shouldSplitAndRemoveEmptyStrings(){
        //given
        Splitter splitter = Splitter.on(", ").omitEmptyStrings();
        //when
        Iterable<String> strings =  splitter.split(", abc, 123, , IIIIII, ");
        //then
        assertFalse(Iterables.contains(strings, ""));
    }

    @Test
    public void shouldSplitAndRemoveWhiteSpaces(){
        //given
        Splitter splitter = Splitter.on(",").trimResults();
        //when
        Iterable<String> strings =  splitter.split(", abc, 123, , IIIIII , ");
        //then
        assertFalse(Iterables.contains(strings, " "));
        assertFalse(Iterables.contains(strings, "IIIIII "));
    }
}
