package com.example.springsample.service;

import com.example.springsample.domain.Board;

import java.util.List;
import java.util.Optional;

public interface BoardService {
    Board saveBoard(Board board);
    Optional<Board> findBoardById(Long id);
    List<Board> findAll();
}
