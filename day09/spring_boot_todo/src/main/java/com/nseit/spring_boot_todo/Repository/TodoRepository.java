package com.nseit.spring_boot_todo.Repository;

import com.nseit.spring_boot_todo.Model.Todo;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Getter
@Repository
public class TodoRepository {
   private ArrayList<Todo> todos = new ArrayList<>();

}
