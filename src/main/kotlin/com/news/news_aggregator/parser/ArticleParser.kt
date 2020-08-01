package com.news.news_aggregator.parser

import com.news.news_aggregator.domain.Article
import com.news.news_aggregator.domain.Source
import org.xml.sax.SAXException
import java.io.IOException
import java.net.URL
import javax.xml.parsers.ParserConfigurationException
import javax.xml.parsers.SAXParserFactory

class ArticleParser {
    fun getArticles(source: Source): List<Article> {
        val handler = Handler()
        var result = listOf<Article>()
        val url = URL(source.url)
        val saxParserFactory = SAXParserFactory.newInstance()
        try {
            val saxParser = saxParserFactory.newSAXParser()
            saxParser.parse(url.openStream(), handler)
            result = handler.getArticlesList()
        } catch (e: ParserConfigurationException) {
            e.printStackTrace()
        } catch (e: SAXException) {
            e.printStackTrace()
        }catch (e: IOException) {
            e.printStackTrace()
        }
        return result
    }
}