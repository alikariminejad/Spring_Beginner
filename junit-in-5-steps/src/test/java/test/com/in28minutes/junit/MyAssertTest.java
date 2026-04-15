package test.com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {
    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

    @Test
    void Test(){
        boolean test = todos.contains("AWS");
//        boolean test = todos.contains("Backend");
        boolean test2 = todos.contains("Docker");

//        assertEquals(true, test);
        assertTrue(test, "There was something wrong");
        assertFalse(test2); // assertNull, assertNotNull
        assertArrayEquals(new int[]{1,2}, new int[]{1,2});
//        assertEquals(5, todos.size(), "The size is not correct, check this!");
        assertEquals(3, todos.size(), "The size is not correct, check this!");
    }
}
