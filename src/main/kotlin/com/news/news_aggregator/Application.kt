package com.news.news_aggregator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class NewsAggregatorApplication

fun main(args: Array<String>) {
	runApplication<NewsAggregatorApplication>(*args)
}
