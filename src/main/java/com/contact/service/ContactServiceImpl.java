package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

//    List<Contact> list = List.of(
//            new Contact(1L, "amit@gmail.com", "Amit", 1311L),
//            new Contact(2L, "anil@gmail.com", "Anil", 1311L),
//            new Contact(3L, "rohan@gmail.com", "Rohan", 1312L),
//            new Contact(4L, "sameer@gmail.com", "Sameer", 1314L)
//    );

    private static List<Contact> list=new ArrayList<>();
    static {
        list.add(new Contact(1L, "amit@gmail.com", "Amit", 101L));
        list.add(new Contact(2L, "anil@gmail.com", "Anil", 102L));
        list.add(new Contact(3L, "rohan@gmail.com", "Rohan", 103L));
        list.add(new Contact(4L, "sameer@gmail.com", "Sameer", 102L));
        list.add(new Contact(4L, "sameer@gmail.com", "Sameer", 103L));
        list.add(new Contact(4L, "kaajal@gmail.com", "kajal", 103L));

    }

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
