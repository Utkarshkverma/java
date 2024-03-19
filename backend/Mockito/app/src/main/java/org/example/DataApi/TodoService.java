package org.example.DataApi;

import java.util.List;

// todo :  Create TodoService Stub
// todo : Test TOdoBuisnessImpl using TodoServiceStub

// ? : Stub is nothing but the class which return some dummy data

// ~ Problem of using a stub ~
// ! Dynaminc conditions
// ! Service Definition

public interface TodoService {
  public List<String> retrieveTodos(String users);
}
