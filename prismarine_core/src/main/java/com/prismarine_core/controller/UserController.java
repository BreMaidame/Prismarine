package com.prismarine_core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prismarine_core.user.User;
import com.prismarine_core.user.UserRepository;
import com.prismarine_core.user.UserRequestDto;
import com.prismarine_core.user.UserResponseDto;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveUser(@RequestBody UserRequestDto data) {
        User userData = new User(data);
        repository.save(userData);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    // Método para leitura de todos os registros na base de dados.
    public List<UserResponseDto> getAll() {
        // Instancia uma nova lista de objeto de retorno.
        List<UserResponseDto> userList = repository.findAll()
                .stream().map(UserResponseDto::new).toList();
        // Retorna a lista da base de dados.
        return userList;

    }
}
