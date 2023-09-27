package com.example.T1ConsultingTestTask.controllers;

import com.example.T1ConsultingTestTask.services.CharacterFrequencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/character-frequency")
public class CharacterFrequencyController {

    private final CharacterFrequencyService characterFrequencyService;

    @Autowired
    public CharacterFrequencyController(CharacterFrequencyService characterFrequencyService) {
        this.characterFrequencyService = characterFrequencyService;
    }

    @GetMapping()
    public Map<Character, Integer> characterFrequency(@RequestParam("inputString") String inputString) {
        return characterFrequencyService.calculateCharacterFrequency(inputString);
    }
}
