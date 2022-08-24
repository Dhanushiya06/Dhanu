package com.nseit.todo_person.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private int id;
    private String name;
    private int age;
    private String role;
    private long phoneNo;

}
