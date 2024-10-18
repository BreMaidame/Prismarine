package com.prismarine_core.chats;

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

@Table(name = "chats")
@Entity(name = "chats")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "chatId")
public class Chat {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    // Chat identifier
    private Long chatId;
    // Sender identifier 
    private Long messageSender;
    // Receiver identifier 
    private Long messageReceiver;
    // Registration start date
    private LocalDateTime dtBegin;
    // Registration update date
    private LocalDateTime dtUpdate;
    // Registration end date
    private LocalDateTime dtEnd;

    // DTO based constructor
    public Chat(ChatRequestDto data){
        this.messageSender = data.messageSender();
        this.messageReceiver = data.messageReceiver();
        this.dtBegin = data.dtBegin();
        this.dtUpdate = data.dtUpdate();
        this.dtEnd = data.dtEnd();
    }
}
