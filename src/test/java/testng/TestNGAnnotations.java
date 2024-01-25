package testng;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeClass
    void beforeClass(){
        System.out.println("Before Class executed!");
    }

    @Test
    void test1(){
        System.out.println("Test 1 executed!");
    }
    @Test
    void test2(){
        System.out.println("Test 2 executed!");
    }
    @AfterClass
    void afterClass(){
        System.out.println("After Class executed!");
    }

    @BeforeTest
    void test3(){
        System.out.println("Before Test1");

    }
    @AfterTest
    void test4(){
        System.out.println("After test 1");
    }

    @BeforeMethod
    void test5(){
        System.out.println("Before method");
    }
    @AfterMethod
    void test6(){
        System.out.println("After method");
    }


}
