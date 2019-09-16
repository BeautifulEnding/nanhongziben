package com.example.demotwo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller
//Controller和RestController的区别，要显示html就要用Controller
//@RequestMapping("/static/")加了这个就可以访问静态html页面。但是显示出来的html没有用到css里面的内容
public class IndexController {

    @RequestMapping("/")
    String index(){
        return "index";
    }
    @RequestMapping("/index.html")
    String index2(){
        return "index";
    }
}

