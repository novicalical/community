package novicalical.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * Created by novicalical on 2023/4/10
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){ return"index";}
    }

