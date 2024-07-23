package com.example.firstspring.todo.service;

import com.example.firstspring.todo.mapper.TodoMapper;
import com.example.firstspring.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoMapper todoMapper;

    public List<Todo> getAllTodos() {
        return todoMapper.getAllTodos();
    }
    public Todo getTodoById(Long id) {
        return todoMapper.getTodoById(id);
    }
    public void insertTodo(Todo todo) {
         todoMapper.insertTodo(todo);
    }
    public void updateTodo(Todo todo) {
        todoMapper.updateTodo(todo);
    }
    public void deleteTodoById(Long id) {
        todoMapper.deleteTodoById(id);
    }






}
