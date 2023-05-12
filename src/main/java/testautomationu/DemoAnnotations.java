package testautomationu;

import org.testng.annotations.*;

public class DemoAnnotations {

    @BeforeMethod
    public void beforeMethod(){

    }


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Chrome - Set Up System Property");
    }

    @BeforeTest
    public void beforeTest(){

    }

    @BeforeClass
    public void beforeClass(){

    }

    @BeforeMethod
    public void beforeMethod(){

    }

    @Test
    public void test(){

    }

    @AfterSuite
    public void afterSuite(){

    }

    @AfterTest
    public void afterTest(){

    }

    @AfterClass
    public void afterClass(){

    }

    @AfterMethod
    public void afterMethod(){

    }






}
