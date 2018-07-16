package com.sunny.dhakan.service;

import java.util.List;

import com.sunny.dhakan.entity.Article;

public interface IArticleService {
     List<Article> getAllArticles();
     Article getArticleById(long articleId);
     boolean addArticle(Article article);
     void updateArticle(Article article);
     void deleteArticle(Article article);
}
