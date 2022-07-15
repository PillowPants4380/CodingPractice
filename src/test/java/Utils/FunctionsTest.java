package Utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {

    @Test
    @DisplayName("hasBadTests")
    void hasBad() {
        assertAll(() -> assertEquals(true, Functions.hasBad("badxx")),
                () -> assertEquals(true, Functions.hasBad("xbadxx")),
                () -> assertEquals(false, Functions.hasBad("xxbadxx")),
                () -> assertEquals(false, Functions.hasBad("code")),
                () -> assertEquals(true, Functions.hasBad("bad")),
                () -> assertEquals(false, Functions.hasBad("ba")));
    }

    @Test
    @DisplayName("atFirstTests")
    void atFirst(){
        assertEquals("He", Functions.atFirst("Hello"));
        assertEquals("H@", Functions.atFirst("H"));
        assertEquals("@@", Functions.atFirst(""));
    }

    @Test
    @DisplayName("lastCharsTest")
    void lastChars(){
        assertEquals("@@", Functions.lastChars("", ""));
        assertEquals("ls", Functions.lastChars("last", "chars"));
    }

    @Test
    @DisplayName("contCatTest")
    void conCat(){
        assertEquals("abcat", Functions.conCat("abc", "cat"));
        assertEquals("dogcat", Functions.conCat("dog", "cat"));
        assertEquals("cat", Functions.conCat("", "cat"));
    }

    @Test
    @DisplayName("lastTwoTest")
    void lastTwo(){
        assertEquals("acb", Functions.lastTwo("abc"));
        assertEquals("codign", Functions.lastTwo("coding"));
        assertEquals("eh", Functions.lastTwo("he"));
        assertEquals("", Functions.lastTwo(""));
    }

    @Test
    @DisplayName("seeColorTest")
    void seeColor(){
        assertEquals("red", Functions.seeColor("redxx"));
        assertEquals("red", Functions.seeColor("redblue"));
        assertEquals("", Functions.seeColor("xxblue"));
        assertEquals("blue", Functions.seeColor("bluexx"));
        assertEquals("", Functions.seeColor("xxred"));
    }

    @Test
    @DisplayName("frontAgainTest")
    void frontAgainTest(){
        assertEquals(true, Functions.frontAgain("eee"));
        assertEquals(false, Functions.frontAgain("edi"));
        assertEquals(true, Functions.frontAgain("edited"));
        assertEquals(true, Functions.frontAgain("ee"));
        assertEquals(false, Functions.frontAgain(" "));
        assertEquals(false, Functions.frontAgain("a"));
    }

    @Test
    @DisplayName("rotateLeft3Test")
    void rotateLeft3Test(){
        assertArrayEquals(new int[] {2, 3, 1}, ArrayFunctions.rotateLeft3(new int[] {1, 2, 3}));
    }
}