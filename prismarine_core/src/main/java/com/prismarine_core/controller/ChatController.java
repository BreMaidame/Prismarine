package com.prismarine_core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prismarine_core.chats.ChatRepository;
import com.prismarine_core.chats.ChatRequestDto;
import com.prismarine_core.chats.ChatResponseDto;

@RestController
@RequestMapping("chat")
// Chat endpoint
public class ChatController {

    @Autowired
    private ChatRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    // Method for reading all database records
    public List<ChatResponseDto> getAll() {
        // Instantiates a new object return list.
        List<ChatResponseDto> chatList = repository.findAll()
                .stream().map(ChatResponseDto::new).toList();
        // Returns the list from database
        return chatList;

    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/get-chat")
    // Returns chat by chat identifier
    public ChatResponseDto getChat(@RequestBody ChatRequestDto chatRequestDto) {
        // Chat identifier
        Long chatId = chatRequestDto.chatId();

        return repository.findById(chatId)
                .map(ChatResponseDto::new)
                .orElseThrow(() -> new RuntimeException("Chat not found with id: " + chatId));
    }
}
