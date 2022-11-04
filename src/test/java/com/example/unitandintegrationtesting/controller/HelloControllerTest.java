package com.example.unitandintegrationtesting.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {

        HelloController controller = new HelloController(); //Arrange
        String response = controller.Hello("World"); //Act
        assertEquals("Hello, World", response); //Assert
    }
}