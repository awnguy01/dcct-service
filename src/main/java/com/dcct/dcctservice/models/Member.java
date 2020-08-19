package com.dcct.dcctservice.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Member {
    String firstName;
    String lastName;
    String nganh;
    int cap;
    LocalDateTime birthDate;
    String phone;
    String email;
}