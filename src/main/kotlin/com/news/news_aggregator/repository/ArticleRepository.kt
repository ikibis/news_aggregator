package com.news.news_aggregator.repository

import com.news.news_aggregator.domain.Article
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Int>