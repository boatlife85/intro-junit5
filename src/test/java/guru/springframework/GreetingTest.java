package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before - I am only called Once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each....");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void HelloWorld1() {
        System.out.println(greeting.helloWorld("John"));
    }

    @Test
    void HelloWorld2() {
        System.out.println(greeting.helloWorld("Sam"));
    }


    @AfterEach
    void tearDown() {
        System.out.print("In After Each.......");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("After!!! ***** - I am only called Once!!!");
    }
}