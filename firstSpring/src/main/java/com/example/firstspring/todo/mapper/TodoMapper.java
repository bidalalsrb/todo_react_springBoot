package com.example.firstspring.todo.mapper;

import com.example.firstspring.todo.model.Todo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TodoMapper {

@Select("SELECT  * from todos")
List<Todo> getAllTodos();

@Select("SELECT * from todos where id = #{id}")
Todo getTodoById(Long id);

@Insert("insert into todos (title,completed) values (#{title}, #{completed})")
@Options(useGeneratedKeys = true, keyProperty = "id")
void insertTodo(Todo todo);

@Update("update todos set title = #{title}, completed =#{completed} where id =#{id}")
void updateTodo(Todo todo);

@Delete("delete from todos where id=#{id}")
void deleteTodoById(Long id);


}
