package com.github.paicoding.forum.service.article.conveter;

import com.github.paicoding.forum.api.model.vo.article.SearchArticleReq;
import com.github.paicoding.forum.service.article.repository.params.SearchArticleParams;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SearchArticleMapper {
    SearchArticleMapper INSTANCE = Mappers.getMapper( SearchArticleMapper.class );

    SearchArticleParams toSearchParams(SearchArticleReq req);
}
