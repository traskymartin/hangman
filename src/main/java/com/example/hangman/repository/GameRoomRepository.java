package com.example.hangman.repository;

import com.example.hangman.model.GameRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRoomRepository extends JpaRepository<GameRoom, Long> {
    GameRoom findByRoomId(String roomId);
}