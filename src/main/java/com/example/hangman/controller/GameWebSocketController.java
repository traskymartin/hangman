package com.example.hangman.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GameWebSocketController {

    @MessageMapping("/game")
    @SendTo("/topic/game")
    public String handleGameMessage(String message) {
        // Here you would handle the game logic and return updated game state
        return message;
    }
}