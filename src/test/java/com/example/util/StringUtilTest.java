package com.example.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {

    @Test
    void testStringReverse() {
        assertEquals("Java", StringUtil.reverseString("avaJ"));
    }
}