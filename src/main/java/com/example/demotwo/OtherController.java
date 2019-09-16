package com.example.demotwo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller

public class OtherController {

    @RequestMapping("/404.html")
    String four(){
        return "404";
    }
    @RequestMapping("/scenic_overview.html")
    String scenic_overview(){
        return "scenic_overview";
    }

    @RequestMapping("/about.html")
    String about(){
        return "about";
    }
    @RequestMapping("/contact.html")
    String contact(){
        return "contact";
    }
    @RequestMapping("/fund.html")
    String fund(){
        return "fund";
    }
    @RequestMapping("/admin.html")
    String admin(){
        return "admin";
    }
    @RequestMapping("/map.html")
    String map(){
        return "map";
    }
    @RequestMapping("/news.html")
    String news() {
        return "news";
    }
    @RequestMapping("/news_show.html")
    String news_show() {
        return "news_show";
    }
    @RequestMapping("/photo.html")
    String photo() {
        return "photo";
    }
    @RequestMapping("/invest.html")
    String invest() {
        return "invest";
    }


}

