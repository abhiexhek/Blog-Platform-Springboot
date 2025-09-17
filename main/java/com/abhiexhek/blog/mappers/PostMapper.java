package com.abhiexhek.blog.mappers;

import com.abhiexhek.blog.domain.CreatePostRequest;
import com.abhiexhek.blog.domain.UpdatePostRequest;
import com.abhiexhek.blog.domain.dto.CreatePostRequestDto;
import com.abhiexhek.blog.domain.dto.PostDto;
import com.abhiexhek.blog.domain.dto.UpdatePostRequestDto;
import com.abhiexhek.blog.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);
}
