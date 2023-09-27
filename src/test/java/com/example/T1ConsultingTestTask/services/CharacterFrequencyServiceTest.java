package com.example.T1ConsultingTestTask.services;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CharacterFrequencyServiceTest {

    @Test
    void calculateCharacterFrequencyWithTaskString() {
        CharacterFrequencyService characterFrequencyService = new CharacterFrequencyService();
        Map<Character, Integer> res = characterFrequencyService.calculateCharacterFrequency("aaaaabcccc");
        assertEquals(res.get('a'), 5);
        assertEquals(res.get('c'), 4);
        assertEquals(res.get('b'), 1);
    }

    @Test
    void calculateCharacterFrequencyWithEmptyString() {
        CharacterFrequencyService characterFrequencyService = new CharacterFrequencyService();
        Map<Character, Integer> res = characterFrequencyService.calculateCharacterFrequency("");
        assertEquals(res.size(), 0);
    }

    @Test
    void calculateCharacterFrequencyWithBigString() {
        CharacterFrequencyService characterFrequencyService = new CharacterFrequencyService();
        Map<Character, Integer> res = characterFrequencyService.calculateCharacterFrequency("aaaaaaaaaaaaaaaauuuuuuuuuuufffffffffcccccxxxxxxxxxeppfm");
        assertEquals(res.get('a'), 16);
        assertEquals(res.get('u'), 11);
        assertEquals(res.get('f'), 10);
        assertEquals(res.get('x'), 9);
        assertEquals(res.get('c'), 5);
        assertEquals(res.get('p'), 2);
        assertEquals(res.get('e'), 1);
        assertEquals(res.get('m'), 1);
    }
}