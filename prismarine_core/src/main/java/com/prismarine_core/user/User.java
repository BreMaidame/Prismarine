package com.prismarine_core.user;

import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "users")
@Entity(name = "users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "userId")
// Entidade de persistencia da classe users
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Anotações denominadas para representar id unico auto gerado
    private Long userId;
    // Nome do usuário
    private String userName;
    // Imagem de perfil do usuário
    private String userProfilePicture;
    // Telefone de contato do usuário
    private String userTelephone;
    // E-mail do usuário
    private String userEmail;
    // Senha do usuário
    private String userPassword;
    // Data de nascimento do usuário
    private LocalDate userDateBirth;
    // Data de criação de registro do usuário
    private LocalDateTime createDt;
    // Data de inicio do registro
    private LocalDateTime dtBegin;
    // Data de atualização do registro
    private LocalDateTime dtUpdate;
    // Data de fim do registro
    private LocalDateTime dtEnd;
    

    // Construtor baseado no DTO
    public User(UserRequestDto data){
        this.userName = data.userName();
        this.userProfilePicture = data.userProfilePicture();
        this.userTelephone = data.userTelephone();
        this.userEmail = data.userEmail();
        this.userPassword = data.userPassword();
        this.userDateBirth = data.userDateBirth();
        this.createDt = data.createDt();
        this.dtBegin = data.dtBegin();
        this.dtUpdate = data.dtUpdate();
        this.dtEnd = data.dtEnd();
    }
}