package com.nseit.todo_person;

import com.nseit.todo_person.model.Todo;
import com.nseit.todo_person.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoPersonApplication implements CommandLineRunner {
    @Autowired
  private TodoService todoService;

    public static void main(String[] args) {
        SpringApplication.run(TodoPersonApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Todo todoOne= new Todo(1,"Arun",28,"Developer",12345);
        Todo todoTwo= new Todo(2,"Babu",35,"Project Lead",67890);
        Todo todoThree= new Todo(3,"Chitra",25,"Testing",98765);
        Todo todoFour= new Todo(4,"Divya",36,"HR",43210);
        Todo todoFive= new Todo(5,"Edward",55,"Service Dept",91825);

        todoService.addTodo(todoOne);
        todoService.addTodo(todoTwo);
        todoService.addTodo(todoThree);
        todoService.addTodo(todoFour);
        todoService.addTodo(todoFive);

        todoService.viewTodo();
        todoService.updateTodo(1);
        todoService.removeTodo(3);
        todoService.viewTodo();
    }
}

