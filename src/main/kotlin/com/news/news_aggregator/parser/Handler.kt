package com.news.news_aggregator.parser

import com.news.news_aggregator.domain.Article
import org.xml.sax.Attributes
import org.xml.sax.helpers.DefaultHandler

class Handler: DefaultHandler() {
    private var articlesList = listOf<Article>()
    private var bGuid = false
    private var bCategory = false
    private var bTitle = false
    private var bLink = false
    private var bDate = false

    fun getArticlesList(): List<Article> {
        return this.articlesList
    }

    override fun endElement(uri: String?, localName: String?, qName: String?) {

    }

    override fun characters(ch: CharArray?, start: Int, length: Int) {

    }

    override fun startElement(uri: String?, localName: String?, qName: String?, attributes: Attributes?) {

    }
}