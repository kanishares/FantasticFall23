package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @DataProvider(name = "testData")
    public Object[][] testData(){
        return new Object[][] {
                {"valid login", 12},
                {"valid login", 11},
                {"invalid login", 10},
                {"invalid login", 9},
        };
    }

    @Test(dataProvider = "testData")
    public void test1(String login, int num){
        System.out.println(login + " " + num);
    }

}
