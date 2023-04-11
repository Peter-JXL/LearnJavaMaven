package com.peterjxl.learnjavamavn.demo1;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testMain() {
       HelloWorld helloWorld = new HelloWorld();
       HelloWorld.main(new String[10]);
    }
}