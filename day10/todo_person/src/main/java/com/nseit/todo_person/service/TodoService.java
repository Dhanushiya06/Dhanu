package com.nseit.todo_person.service;

import com.nseit.todo_person.model.Todo;
import com.nseit.todo_person.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public void addTodo(Todo todo) {
        ArrayList<Todo> todos = todoRepository.getTodos();
        todos.add(todo);
    }

    public void viewTodo() {
        for (Todo todo : todoRepository.getTodos()) {
            System.out.println(todo.getId() + "-" + todo.getName()
                    + "-" + todo.getAge() + "-" + todo.getRole() + "-" + todo.getPhoneNo());
        }
    }

    public void updateTodo(int id) {
        for (Todo todo : todoRepository.getTodos()) {
            if (id == todo.getId()) {
                todo.setAge(47);
                break;
            }
        }
    }

    public void removeTodo(int id) {
        for (Todo todo : todoRepository.getTodos()) {
            if (id == todo.getId()) {
                todoRepository.getTodos().remove(todo);
                break;
            }
        }
    }
}
