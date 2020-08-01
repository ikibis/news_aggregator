package com.news.news_aggregator.controller

import com.news.news_aggregator.domain.Source
import com.news.news_aggregator.service.SourceService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class SourceController(private val sourceService: SourceService) {
    @PostMapping("/add_source", produces = ["application/json"])
    @ResponseBody()
    fun addSource(@RequestBody source: Source) {
        sourceService.addSource(source)

    }
}