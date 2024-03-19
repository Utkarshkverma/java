package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import javax.management.RuntimeErrorException;

public class ListTest {

    @Test
    public void test()
    {
        List mockList = mock(List.class);
        when(mockList.size()).thenReturn(2);

        assertEquals(2, mockList.size());
    }

    @Test
    public void returnMultipleVal()
    {
        List mockList = mock(List.class);
        when(mockList.size()).thenReturn(2).thenReturn(3);
        assertEquals(2, mockList.size());
        assertEquals(3, mockList.size());
    }


    @Test(expected = RuntimeException.class)
    public void returnException()
    {
        List  mockList = mock(List.class);
        when(mockList.size()).thenThrow(new RuntimeException("Smthg"));
        mockList.size();
    }



}
