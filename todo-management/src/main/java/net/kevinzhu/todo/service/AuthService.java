package net.kevinzhu.todo.service;

import net.kevinzhu.todo.dto.LoginDto;
import net.kevinzhu.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    String login(LoginDto loginDto);
}
