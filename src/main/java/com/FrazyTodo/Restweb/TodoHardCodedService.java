package com.FrazyTodo.Restweb;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardCodedService {

    private static List<Todo> todos = new ArrayList();
    private static  int idCounter = 0;

    static{
        todos.add((new Todo(++idCounter,"Frazy", "Learn to Dance", new Date(), false)));
        todos.add((new Todo(++idCounter,"Frazy", "Learn about micro Services", new Date(), false)));
        todos.add((new Todo(++idCounter,"Frazy", "Learn about angular", new Date(), false)));
    }

    public List<Todo> findAll(){
        return todos;
    }

    public Todo save(Todo todo){
        if(todo.getId()==-1 || todo.getId()==0){
            todo.setId(++idCounter);
            todos.add(todo);
        } else {
            deleteBy(todo.getId());
            todos.add(todo);
        }
        return todo;
    }

    public Todo deleteBy(long id){
        Todo todo = findById(id);

        if(todo==null) return null;

        todos.remove(todo);
        return todo;
    }

    public Todo findById(long id) {

        for(Todo todo: todos){
            if(todo.getId() == id){
                return todo;
            }
        }
        return null;
    }
}
