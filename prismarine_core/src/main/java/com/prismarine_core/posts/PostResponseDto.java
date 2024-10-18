package com.prismarine_core.posts;

import java.time.LocalDateTime;

public record PostResponseDto(
    Long postId,
    Long userId,
    String postStatus,
    String postContent,
    LocalDateTime postCreatedAt,
    LocalDateTime dtBegin,
    LocalDateTime dtUpdate,
    LocalDateTime dtEnd) {
    
    public PostResponseDto(Post post){
        this(post.getPostId(),
            post.getUserId(),
            post.getPostStatus(),
            post.getPostContent(),
            post.getPostCreatedAt(),
            post.getDtBegin(),
            post.getDtUpdate(),
            post.getDtEnd());
    }

}
