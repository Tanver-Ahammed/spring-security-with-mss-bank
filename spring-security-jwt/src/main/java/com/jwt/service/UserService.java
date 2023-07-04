package com.jwt.service;

import com.jwt.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService() {
        this.users.add(new User(19016, "Tanver", "tanver@gmail.com", "0571-56465", "Joypurhat"));
        this.users.add(new User(19017, "Shuly", "Shuly@gmail.com", "0571-56465", "Tangail"));
        this.users.add(new User(19018, "Tariq", "Tariq@gmail.com", "0571-56465", "Tangail"));
        this.users.add(new User(19019, "Bonna", "Bonna@gmail.com", "0571-56465", "Tangail"));
        this.users.add(new User(19020, "Utsha", "Utsha@gmail.com", "0571-56465", "Tangail"));
    }

    public List<User> getUsers() {
        return this.users;
    }

}
