package com.news.news_aggregator.service

import com.news.news_aggregator.parser.ArticleParser
import com.news.news_aggregator.domain.Article
import com.news.news_aggregator.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(private val articleRepository: ArticleRepository, private val parser: ArticleParser) {
    fun getNews(): MutableIterable<Article> {
        return articleRepository.findAll()
    }

    fun addArticles(news: List<Article>) {
        articleRepository.saveAll(news)
    }
}