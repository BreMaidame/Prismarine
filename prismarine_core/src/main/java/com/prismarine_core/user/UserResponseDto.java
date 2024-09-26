package com.prismarine_core.user;

public record UserResponseDto(Long userId, String userName, String userProfilePicture, Integer userAge) {
    
    public UserResponseDto(User user){
        this(user.getUserId(),
            user.getUserName(),
            user.getUserProfilePicture(),
            user.getUserAge());
    }

}
