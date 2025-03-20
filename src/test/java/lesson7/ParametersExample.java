package lesson7;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by lolik on 28.12.2017.
 */
public class ParametersExample {


//    @Test(enabled = false)
//    @Parameters({"email", "password"})
//    public void login(@Optional("azazaza") String email, @Optional("iLoveasdasd")String password){
//        String word1 = "ac";
//        String word2 = "ab";
//        System.out.println(word1.compareTo(word2));
//
//
//
//
//
//    }
//
//    @Test(expectedExceptions = AssertionError.class, enabled = false)
//    public void bTest(){
//        throw new AssertionError("No such element");
//    }
//
//    @Test(enabled = false)
//    public void aTest(){
//        throw new NoSuchElementException("No such element");
//    }

    @Test(dependsOnMethods = "bTest", alwaysRun = true)
    public void cTest(){}

    @Test(dependsOnMethods = "aTest", alwaysRun = true)
    public void bTest(){}  // This methot will run anyway

    @Test
    public void aTest(){
        Assert.fail(); // force test fail
    }




}
