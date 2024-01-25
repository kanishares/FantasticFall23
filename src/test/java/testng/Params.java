package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Params {

    @Test
    @Parameters({"name", "age"})
    void testMethod(String name, int age){
        System.out.println("Name: " + name + "\n" + "Age: " +age);
    }

}
