package com.prismarine_core.user;

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
    // Idade do usuário
    private Integer userAge;

    // Construtor baseado no DTO
    public User(UserRequestDto data){
        this.userProfilePicture = data.userProfilePicture();
        this.userAge = data.userAge();
        this.userName = data.userName();
    }
}