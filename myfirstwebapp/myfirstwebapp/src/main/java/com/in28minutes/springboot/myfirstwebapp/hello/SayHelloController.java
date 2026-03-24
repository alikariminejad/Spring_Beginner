package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    //"say-hello" => "Hello! What are you learning today?"
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<HTML>");
        sb.append("<TITLE>");
        sb.append("This is a title");
        sb.append("</TITLE>");
        sb.append("<BODY>");
        sb.append("<P>");
        sb.append("This is a paragraph body");
        sb.append("</P>");
        sb.append("</BODY>");
        sb.append("</HTML>");
        System.out.println(sb.toString());
        return sb.toString();
    }

    // say-hello-jsp => sayHello.jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
