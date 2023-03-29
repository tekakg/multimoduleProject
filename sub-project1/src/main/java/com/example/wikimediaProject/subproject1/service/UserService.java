package com.example.wikimediaProject.subproject1.service;

import com.example.wikimediaProject.subproject1.entity.ModuleOneUser;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public ResponseEntity<String>addUser(ModuleOneUser user)
    {
        return ResponseEntity.ok("User added succesfully");
    }
}
