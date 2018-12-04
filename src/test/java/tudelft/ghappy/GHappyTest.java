package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.mirror.Mirror;

public class GHappyTest {

    @ParameterizedTest(name="str {0},result {1}")
    @CsvSource({ "xxggxx,true" ,"xxgxx,false","xxggyygxx,false","gxxggxx,false"})
    public void testGHappy(String str,boolean expectedResult){

        boolean result = new GHappy().gHappy(str);

        Assertions.assertTrue(expectedResult == result);
        //Assertions.assertEquals(expectedResult, result);

    }
}
