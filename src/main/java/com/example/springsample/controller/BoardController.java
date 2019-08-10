package com.example.springsample.controller;

import com.example.springsample.domain.Board;
import com.example.springsample.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/hello")
    public String helloWorld() {

        return "hello-world";
    }

    @GetMapping("/write")
    public String showWriteBoardForm(Board board) {
        return "write-board";
    }

    @PostMapping("/write/add")
    public String saveBoard(@Valid Board board, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "write-board";
        }
        boardService.saveBoard(board);
        return "redirect:/board/list";
    }

    @GetMapping("/list")
    public String showListBoardForm(Model model) {
        model.addAttribute("boards", boardService.findAll());
        return "basic-list-board";
    }




}
