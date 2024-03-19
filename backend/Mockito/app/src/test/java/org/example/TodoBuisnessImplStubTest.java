package org.example;
import org.junit.jupiter.api.Test;

import BuisnessImpl.TodoBuisnessImpl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.example.DataApi.TodoService;
import org.example.DataApi.TodoServiceStub;
public class TodoBuisnessImplStubTest {
    
   @Test
   // && This test is using Stub
   public void test()
   {
    TodoService todoService = new TodoServiceStub();
    TodoBuisnessImpl todoBuisnessImpl = new TodoBuisnessImpl(todoService);
     List<String> filtertodos = todoBuisnessImpl.retrieveTodosRelatedToSpring("Dummy");

     assertEquals(2,filtertodos.size());
   }
}
