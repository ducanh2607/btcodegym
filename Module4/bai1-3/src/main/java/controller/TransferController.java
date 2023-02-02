package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TransferController {
    @GetMapping(value = "/transfer")
    public String transfer(){
        return "money";
    }
    @PostMapping(value = "/bai1")
    public String bai1(@RequestParam ("money") double money, @RequestParam("from") double from, @RequestParam("to") double to, Model model){
            model.addAttribute("result", money*to/from);
            return "money";
    }


}
