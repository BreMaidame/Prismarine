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
// Persistence entity from user class
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Auto generated user id
    private Long userId;
    // User name
    private String userName;
    // User profile picture
    private String userProfilePicture;
    // User contact number
    private String userTelephone;
    // User email
    private String userEmail;
    // User password
    private String userPassword;
    // User date birth
    private LocalDate userDateBirth;
    // User record creation date
    private LocalDateTime createDt;
    // Registration start date
    private LocalDateTime dtBegin;
    // Registration update date
    private LocalDateTime dtUpdate;
    // Registration end date
    private LocalDateTime dtEnd;
    

    // DTO based constructor
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