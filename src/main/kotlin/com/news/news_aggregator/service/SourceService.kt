package com.news.news_aggregator.service

import com.news.news_aggregator.parser.ArticleParser
import com.news.news_aggregator.domain.Source
import com.news.news_aggregator.repository.SourceRepository
import org.springframework.stereotype.Service

@Service
class SourceService(
        private val sourceRepository: SourceRepository,
        private val parser: ArticleParser,
        private val articleService: ArticleService
) {
    fun addSource(source: Source) {
        sourceRepository.save(source)
        findArticlesFromSource(source)
    }

    fun findArticlesFromSource(source: Source) {
        val articles = parser.getArticles(source)
        articleService.addArticles(articles)
    }

    fun getAllSources() = sourceRepository.findAll()
}