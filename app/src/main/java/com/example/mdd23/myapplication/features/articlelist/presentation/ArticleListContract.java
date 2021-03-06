package com.example.mdd23.myapplication.features.articlelist.presentation;

import com.example.mdd23.myapplication.features.articlelist.domain.ArticleSummary;

import java.util.List;

/**
 * Created by mdd23 on 9/2/2016.
 */
public interface ArticleListContract {
    interface Presenter {
        void loadArticles();
        void openArticleDetail(ArticleSummary article);
    }

    interface View {
        void showListOfArticles(List<ArticleSummary> articleSummaries);
        void showError();
        void showArticleDetail(long articleId);
    }
}
