package BuisnessImpl;

import java.util.ArrayList;
import java.util.List;

import org.example.DataApi.TodoService;

public class TodoBuisnessImpl {
    private TodoService todoService;

    public TodoBuisnessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user)
    {
        List<String> filtertodos = new ArrayList<>();
        List<String> todos = todoService.retrieveTodos(user);

        for(String todo : todos)
        {
            if(todo.contains("Spring"))
            {
                filtertodos.add(todo);
            }
        }

        return filtertodos;
    }
}
