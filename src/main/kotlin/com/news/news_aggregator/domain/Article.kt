package com.news.news_aggregator.domain

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "articles")
data class Article(
        @Id
        @JsonProperty(value = "id")
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0L,

        @JsonProperty(value = "sourceId")
        @Column(name = "sourceId")
        val sourceId: Long = 0L,

        @JsonProperty(value = "title")
        @Column(name = "title")
        val title: String = "",

        @JsonProperty(value = "link")
        @Column(name = "link")
        val link: String = "",

        @JsonProperty(value = "category")
        @Column(name = "category")
        val category: String = "",

        @JsonProperty(value = "dateTime")
        @Column(name = "dateTime")
        val dateTime: LocalDateTime = LocalDateTime.MIN,

        @JsonProperty(value = "guid")
        @Column(name = "guid")
        val guid: Long = 0L
)