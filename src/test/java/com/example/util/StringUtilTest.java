package com.example.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilTest {

    @Test
    void testStringReverse() {
        assertEquals("Ja2va", StringUtil.reverseString("av2aJ"));
    }

    @Test
    void testNullString() {
        assertNull(StringUtil.reverseString(null));
    }

    @Test
    void testEmptyString() {
        assertEquals("", StringUtil.reverseString(""));
    }

    @Test
    void testOneLetter() {
        assertEquals("f", StringUtil.reverseString("f"));
    }

    @Test
    void testOneNonLetter(){
        assertEquals("5",StringUtil.reverseString("5"));
    }

    @Test
    void testLetters(){
        assertEquals("sdfsdf", StringUtil.reverseString("fdsfds"));
    }

    @Test
    void testNonLetters(){
        assertEquals("123", StringUtil.reverseString("123"));
    }

    @Test
    void testLettersAndSpaces() {
        assertEquals("d a f",StringUtil.reverseString("f a d"));
    }

    @Test
    void testDifferentCase(){
        assertEquals("Dad", StringUtil.reverseString("daD"));
    }

    @Test
    void testSpecialCharactersAtEnds() {
        assertEquals("!dcb a?", StringUtil.reverseString("!abc d?"));
    }
}