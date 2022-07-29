package com.cg.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondUnitTestingProgram 
{
    @Test
    void print()
    {
    	System.out.println("Hello Students!");
    }
    @Test
    @BeforeEach
    void accept()
    {
    	System.out.println("@BeforeEach-executes before each test method in this class");
    }
    
    static void display()
    {
    	System.out.println("@BeforeEach-executes once before all the test method in this class");
    }
    @Test
    void print1()
    {
    	System.out.println("Hello folks!");
    }
}
