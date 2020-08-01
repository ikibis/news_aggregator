package com.news.news_aggregator.controller

import com.news.news_aggregator.service.ArticleService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class ArticleController(private val articleService: ArticleService) {
    @GetMapping("/", produces = ["application/json"])
    @ResponseBody()
    fun getNews() = articleService.getNews()
}