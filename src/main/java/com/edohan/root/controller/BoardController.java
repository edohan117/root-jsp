package com.edohan.root.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    public Logger log = LoggerFactory.getLogger(BoardController.class);
    @GetMapping("/list")
    public String boardList(){
        log.info("Board/List 로 들어옴");
        return "board/list";
    }
}
