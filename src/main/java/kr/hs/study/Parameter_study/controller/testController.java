package kr.hs.study.Parameter_study.controller;

import kr.hs.study.Parameter_study.dto.test5;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {

    // HttpServletRequest
    @GetMapping("/http")
    public String http(HttpServletRequest req) {
        String id = req.getParameter("id");
        String pass = req.getParameter("pass");
        String name = req.getParameter("name");
        String content = req.getParameter("content");

        System.out.println("id : " + id);
        System.out.println("pass : " + pass);
        System.out.println("name : " + name);
        System.out.println("content : " + content);

        return "result";
    }

    // WebRequest
    @GetMapping("/web")
    public String web(WebRequest req) {
        String id = req.getParameter("id");
        String pass = req.getParameter("pass");
        String name = req.getParameter("name");
        String content = req.getParameter("content");

        System.out.println("id : " + id);
        System.out.println("pass : " + pass);
        System.out.println("name : " + name);
        System.out.println("content : " + content);

        return "result";
    }

    // @PathVariable
    @GetMapping("/path/{id}/{pass}/{name}/{content}")
    public String path(@PathVariable String id,
                        @PathVariable String pass,
                        @PathVariable String name,
                        @PathVariable String content) {
        System.out.println("id : " + id);
        System.out.println("pass : " + pass);
        System.out.println("name : " + name);
        System.out.println("content : " + content);

        return "result";
    }

    // @RequestParam
    @GetMapping("/req")
    public String req(@RequestParam("id") String id,
                        @RequestParam("pass") String pass,
                        @RequestParam("name") String name,
                        @RequestParam("content") String content) {
        System.out.println("id : " + id);
        System.out.println("pass : " + pass);
        System.out.println("name : " + name);
        System.out.println("content : " + content);

        return "result";
    }

    // @ModelAttribute
    @GetMapping("/mod")
    public String mod(@ModelAttribute test5 t5) {

        System.out.println("id : " + t5.getId());
        System.out.println("pass : " + t5.getPass());
        System.out.println("name : " + t5.getName());
        System.out.println("content : " + t5.getContent());

        return "result";
    }

}
