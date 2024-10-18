package com.prismarine_core.posts;

import java.time.LocalDateTime;

public record PostRequestDto (
    Long userId,
    String postStatus,
    String postContent,
    LocalDateTime postCreatedAt,
    LocalDateTime dtBegin,
    LocalDateTime dtUpdate,
    LocalDateTime dtEnd){
}
