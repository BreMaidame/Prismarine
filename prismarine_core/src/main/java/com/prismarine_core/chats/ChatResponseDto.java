package com.prismarine_core.chats;

import java.time.LocalDateTime;

public record ChatResponseDto (
    // Chat identifier
    Long chatId,
    // Sender identifier 
    Long messageSender,
    // Receiver identifier
    Long messageReceiver,
    // Registration start date
    LocalDateTime dtBegin,
    // Registration update date
    LocalDateTime dtUpdate,
    // Registration end date
    LocalDateTime dtEnd
    ){

    public ChatResponseDto(Chat chat){
        this(chat.getChatId(),
        chat.getMessageSender(),
        chat.getMessageReceiver(),
        chat.getDtBegin(),
        chat.getDtUpdate(),
        chat.getDtEnd());
    }

}