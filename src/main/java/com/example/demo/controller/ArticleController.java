package com.example.demo.controller;

import com.example.demo.dto.ArticleForm;
import com.example.demo.entity.Article;
import com.example.demo.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;
    @GetMapping("/articles/new")
    public String NewArticleForm(){
        return "articles/new";
    }
    @PostMapping("/articles/create")
    public String CreateArticles(ArticleForm articleForm){
        System.out.println(articleForm.toString());

        Article article=articleForm.toEntity();
        System.out.println(article.toString());
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }
}
