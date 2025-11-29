package org.example.Comment.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
@Getter
@AllArgsConstructor
public class Person {
    private int id;
    private String username;
    private String address;
    private int Age;
    private LocalDate Birthday;
    private LocalDate inCompanytime;
    private int telephone;
    private Boolean isCompany;
}
