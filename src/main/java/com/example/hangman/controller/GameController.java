package com.example.hangman.controller;

import com.example.hangman.model.GameRoom;
import com.example.hangman.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/create-room")
    public ResponseEntity<GameRoom> createRoom(@RequestBody GameRoom gameRoom) {
        return ResponseEntity.ok(gameService.createRoom(gameRoom));
    }

    @PostMapping("/join-room")
    public ResponseEntity<GameRoom> joinRoom(@RequestParam String roomId, @RequestParam String password) {
        GameRoom gameRoom = gameService.joinRoom(roomId, password);
        if (gameRoom != null) {
            return ResponseEntity.ok(gameRoom);
        } else {
            return ResponseEntity.status(401).build();
        }
    }
}