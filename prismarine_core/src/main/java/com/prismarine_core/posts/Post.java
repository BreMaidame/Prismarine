package com.prismarine_core.posts;

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

@Table(name = "posts")
@Entity(name = "posts")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "postId")
// Entidade de persistencia da classe post
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Anotações denominadas para representar id unico auto gerado
    private Long postId;
    // Identificador do usuário
    private Long userId;
    // Estado da postagem
    private String postStatus;
    // Conteúdo da postagem
    private String postContent;
    // Data de criação da postagem
    private LocalDateTime postCreatedAt;
    // Data de criação do registro
    private LocalDateTime dtBegin;
    // Data de atualização do registro
    private LocalDateTime dtUpdate;
    // Data de fim do registro
    private LocalDateTime dtEnd;
    

    // Construtor baseado no DTO
    public Post(PostRequestDto data){
        this.userId = data.userId();
        this.postStatus = data.postStatus();
        this.postContent = data.postContent();
        this.postCreatedAt = data.postCreatedAt();
        this.dtBegin = data.dtBegin();
        this.dtUpdate = data.dtUpdate();
        this.dtEnd = data.dtEnd();
    }
}