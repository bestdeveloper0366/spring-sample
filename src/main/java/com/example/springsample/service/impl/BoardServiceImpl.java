package com.example.springsample.service.impl;

import com.example.springsample.domain.Board;
import com.example.springsample.repository.BoardRepository;
import com.example.springsample.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public Board saveBoard(Board board) {
        return boardRepository.save(board);
    }

    @Override
    public Optional<Board> findBoardById(Long id) {
        return boardRepository.findById(id);
    }

    @Override
    public List<Board> findAll() {
        return boardRepository.findAll();
    }
}
