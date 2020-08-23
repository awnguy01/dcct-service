package com.dcct.dcctservice.models;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MemberObject {
    int id;
    String firstName;
    String middleName;
    String lastName;
    LocalDate birthDate;
    String saintName;
    String phonePrimary;
    String phoneSecondary;
    String email;
    String street;
    String city;
    String stateAbb;
    String zip;
    String nganh;
    int cap;
    LocalDate joinDate;
    Boolean isActive;
}