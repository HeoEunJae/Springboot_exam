package com.boarder.hej;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/boarder")
    @ResponseBody
    public String Index(){
        return "index";
    }


    @RequestMapping("/")
    public String root(){
        return "redirect:/article/list";
    }
}
