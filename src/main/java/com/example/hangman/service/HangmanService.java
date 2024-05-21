package com.example.hangman.service;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HangmanService {

    private Map<String, String> gameStates = new HashMap<>();

    public String startNewGame(String roomId, String word) {
        gameStates.put(roomId, word);
        return word.replaceAll(".", "_");
    }

    public String makeGuess(String roomId, char guess) {
        String word = gameStates.get(roomId);
        // Logic to update the word state based on the guess
        return word;  // Return the updated word state
    }
}