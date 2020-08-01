package com.news.news_aggregator.repository

import com.news.news_aggregator.domain.Source
import org.springframework.data.repository.CrudRepository

interface SourceRepository: CrudRepository<Source, Int>