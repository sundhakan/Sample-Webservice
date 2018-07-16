package com.sunny.dhakan.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sunny.dhakan.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>  {
	Article findByArticleId(long articleId);
    List<Article> findByTitleAndCategory(String title, String category);
}
