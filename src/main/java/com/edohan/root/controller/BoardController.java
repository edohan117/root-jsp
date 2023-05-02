package com.edohan.root.controller;

import com.edohan.root.service.board.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    public Logger log = LoggerFactory.getLogger(BoardController.class);
    @Autowired
    private BoardService service;

    @GetMapping("/list")
    public String boardList(){
        log.info("Board/List 로 들어옴");
        return "board/list";
    }
    @GetMapping("/view")
    public String boardView(){
        log.info("Board/view 로 들어옴");
        return "board/view";
    }
    @GetMapping("/modify")
    public String boardModify(){
        log.info("Board/modify 로 들어옴");
        return "board/modify";
    }
    @GetMapping("/write")
    public String boardwriteForm(){
        log.info("Board/write 로 들어옴");
        return "board/write";
    }

}
