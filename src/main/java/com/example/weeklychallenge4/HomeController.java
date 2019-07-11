package com.example.weeklychallenge4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping ("/index")
public String homePage(){
        return "Profile";
    }
    @RequestMapping("/corejava")
    public String coreJava(){
        return "CoreJava";
    }
    @RequestMapping("/about")
    public String aboutPage() {
        return "About";
    }
    @RequestMapping("/github")
    public String gitHub() {
        return "Github";
    }
    @RequestMapping("/hub")
    public String hubPage() {
        return "Hub";
    }
    @RequestMapping("/javaee")
    public String javaEE() {
        return "JavaEE";
    }
    @RequestMapping("/polymorphsim")
    public String poly() {
        return "Polymorphism";
    }
}
