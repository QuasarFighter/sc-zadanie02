package pl.pz;

import com.google.common.base.Joiner;
import org.junit.Test;

import static org.junit.Assert.*;

public class JoinerTests {
    @Test
    public void shouldJoinTwoStringsWithACharacter(){
        //given
        Joiner joiner = Joiner.on('b');
        String s1 = "a", s2 = "c";
        //when
        String actual = joiner.join(s1, s2);
        //then
        assertEquals("abc", actual);
    }

    @Test
    public void shouldJoinStringsWithACharacter(){
        //given
        Joiner joiner = Joiner.on('b');
        String s1 = "a", s2 = "c", s3 = "d";
        //when
        String actual = joiner.join(s1, s2, s3);
        //then
        assertEquals("abcbd", actual);
    }

    @Test
    public void shouldJoinStringsWithAString(){
        //given
        Joiner joiner = Joiner.on("abc");
        String s1 = "1", s2 = "2", s3 = "3";
        //when
        String actual = joiner.join(s1, s2, s3);
        //then
        assertEquals("1abc2abc3", actual);
    }

    @Test
    public void shouldSkipNullsWhenJoining(){
        //given
        Joiner joiner = Joiner.on("").skipNulls();
        String s1 = "1", s2 = null, s3 = "3";
        //when
        String actual = joiner.join(s1, s2, s3);
        //then
        assertEquals("13", actual);
    }

    @Test
    public void shouldReplaceNullsWhenJoining(){
        //given
        Joiner joiner = Joiner.on("").useForNull("NULL");
        String s1 = "a", s2 = null, s3 = "c";
        //when
        String actual = joiner.join(s1, s2, s3);
        //then
        assertEquals("aNULLc", actual);
    }
}
