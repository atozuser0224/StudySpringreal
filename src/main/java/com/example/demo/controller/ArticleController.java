package com.example.demo.controller;

import com.example.demo.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles/new")
    public String NewArticleForm(){
        return "articles/new";
    }
    @PostMapping("/articles/create")
    public String CreateArticles(ArticleForm articleForm){
        System.out.println(articleForm.toString());
        return "";
    }
}
