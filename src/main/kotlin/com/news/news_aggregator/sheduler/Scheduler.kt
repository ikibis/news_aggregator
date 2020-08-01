package com.news.news_aggregator.sheduler

import com.news.news_aggregator.service.SourceService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class Scheduler(private val sourceService: SourceService) {
    @Scheduled(fixedRate = 600000)
    fun getNewArticles() {
        val sources = sourceService.getAllSources()
        sources.forEach{source ->
            sourceService.findArticlesFromSource(source)
        }
    }
}