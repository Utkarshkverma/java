package org.example;
import org.junit.jupiter.api.Test;

import BuisnessImpl.TodoBuisnessImpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.example.DataApi.TodoService;
import org.example.DataApi.TodoServiceStub;
@SuppressWarnings("unused")
public class TodoBuisnessImplMockTest {
    
   @Test
   // && This test is using Mockito

   // ? Mocking means to create obljects that  simulate the behavior of another object (real or virtual) but still allowing you to make assertions about
   public void test()
   {
    TodoService todoServiceMock = mock(TodoService.class);
    List<String> list = Arrays.asList("Learn Spring MVC","Learn Spring","Learn to dance");
    when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(list);
    TodoBuisnessImpl todoBuisnessImpl = new TodoBuisnessImpl(todoServiceMock);
     List<String> filtertodos = todoBuisnessImpl.retrieveTodosRelatedToSpring("Dummy");

     assertEquals(2,filtertodos.size());
   }

   @Test
   public void todoEmpty()
   {
    TodoService todoServiceMock = mock(TodoService.class);
    List<String> list = new ArrayList<>();
    when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(list);

    TodoBuisnessImpl todoBuisnessImpl = new TodoBuisnessImpl(todoServiceMock);
    List<String> filtertodos = todoBuisnessImpl.retrieveTodosRelatedToSpring("Dummy");

    assertEquals(0, filtertodos.size());
   }
}
