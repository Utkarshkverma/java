package org.example.DataApi;
import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

    @Override
    public List<String> retrieveTodos(String users) {
        return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to dance");
        
    }

}
