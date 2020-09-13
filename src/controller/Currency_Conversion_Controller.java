package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Currency_Conversion_Controller {
    @GetMapping("/conversion")
            public String conversion(){
                return "view" ;
            }

            @PostMapping("/usd")
            public String submit(@RequestParam String usd, String rate, Model model){
                float result = Float.parseFloat(usd) * Float.parseFloat(rate);
                model.addAttribute("result1",result);
                        return "sumit";
            }
}
