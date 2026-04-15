package test.com.in28minutes.junit;

import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("After All");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After Each");
    }

    @Test
    void test1(){
        System.out.println("Test 1");
    }

    @Test
    void test2(){
        System.out.println("Test 2");
    }

    @Test
    void test3(){
        System.out.println("Test 3");
    }
}
