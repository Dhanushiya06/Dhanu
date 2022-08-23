package com.nseit.spring_boot_todo.Model;

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
    boolean isCompleted;
}
