package ks.arlind.ginRummyManager.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class TestController {
    @GetMapping
    public String getTestData() {
        return "Welcome home man";
    }
}
