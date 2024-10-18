package com.prismarine_core.user;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record UserResponseDto(
    Long userId,
    // User name
    String userName,
    // User profile picture
    String userProfilePicture,
    // User contact number
    String userTelephone,
    // User email
    String userEmail,
    // User password
    String userPassword,
    // User date birth
    LocalDate userDateBirth,
    // User record creation date
    LocalDateTime createDt,
    // Registration start date
    LocalDateTime dtBegin,
    // Registration update date
    LocalDateTime dtUpdate,
    // Registration end date
    LocalDateTime dtEnd) {
    
    public UserResponseDto(User user){
        this(user.getUserId(),
            user.getUserName(),
            user.getUserProfilePicture(),
            user.getUserTelephone(),
            user.getUserEmail(),
            user.getUserPassword(),
            user.getUserDateBirth(),
            user.getCreateDt(),
            user.getDtBegin(),
            user.getDtUpdate(),
            user.getDtEnd());
    }

}
