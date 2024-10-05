package com.prismarine_core.user;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record UserResponseDto(
    Long userId,
    // Nome de usuário
    String userName,
    // Foto de perfil do usuário
    String userProfilePicture,
    // Telefone de contato do usuário
    String userTelephone,
    // Email de contato do usuário
    String userEmail,
    // Senha de acesso do usuário
    String userPassword,
    // Data de nascimento do usuário
    LocalDate userDateBirth,
    // Data de criação do registro
    LocalDateTime createDt,
    // Data de início do registro
    LocalDateTime dtBegin,
    // Data de atualização do registro
    LocalDateTime dtUpdate,
    // Data de fim do registro
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
