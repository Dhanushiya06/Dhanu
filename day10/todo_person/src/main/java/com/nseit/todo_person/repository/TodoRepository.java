package com.nseit.todo_person.repository;

import com.nseit.todo_person.model.Todo;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Getter
@Repository
public class TodoRepository {
    ArrayList<Todo> todos = new ArrayList<>();

}
