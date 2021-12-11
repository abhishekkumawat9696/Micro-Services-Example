package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

//    List<User> list = List.of(
//            new User(1311L, "Abhishek", "23525625"),
//            new User(1312L, "Manoj", "99999"),
//            new User(1314L, "Teena", "888")
//    );
    private static List<User> list=new ArrayList<>();
    static {
        list.add(new User(101L, "Abhishek", "9828132618"));
        list.add(new User(102L, "Manoj", "2352562533"));
        list.add(new User(103L, "Teena", "235256254545"));

    }




    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
