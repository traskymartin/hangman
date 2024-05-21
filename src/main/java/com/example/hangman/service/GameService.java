package com.example.hangman.service;

import com.example.hangman.model.GameRoom;
import com.example.hangman.repository.GameRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GameService {

    @Autowired
    private GameRoomRepository gameRoomRepository;

    public GameRoom createRoom(GameRoom gameRoom) {
        gameRoom.setRoomId(UUID.randomUUID().toString());
        return gameRoomRepository.save(gameRoom);
    }

    public GameRoom joinRoom(String roomId, String password) {
        GameRoom gameRoom = gameRoomRepository.findByRoomId(roomId);
        if (gameRoom != null && gameRoom.getPassword().equals(password)) {
            return gameRoom;
        }
        return null;
    }
}