package com.news.news_aggregator.domain

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Source(
        @Id
        @JsonProperty(value = "id")
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0L,

        @JsonProperty(value = "url")
        @Column(name = "url")
        val url: String = "",

        @JsonProperty(value = "title")
        @Column(name = "title")
        val title: String = "",

        @JsonProperty(value = "itemTag")
        @Column(name = "itemTag")
        val itemTag: String = "",

        @JsonProperty(value = "itemTitleTag")
        @Column(name = "itemTitleTag")
        val itemTitleTag: String = "",

        @JsonProperty(value = "itemLinkTag")
        @Column(name = "itemLinkTag")
        val itemLinkTag: String = "",

        @JsonProperty(value = "itemCategoryTag")
        @Column(name = "itemCategoryTag")
        val itemCategoryTag: String = "",

        @JsonProperty(value = "itemPubDateTag")
        @Column(name = "itemPubDateTag")
        val itemPubDateTag: String = ""
)