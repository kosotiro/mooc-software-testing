package tudelft.mirror;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {



    //empty String is annotated with \'\'
    @ParameterizedTest(name="str {0},result {1}")
    @CsvSource({ "abXYZba,ab" ,"abaaa,a","aba,aba","a,a","abba,abba","abcd,\'\'","aa,aa","abbacddba,ab","aaaaabaaa,aaa","abcba,abcba" })
    public void testmirrorEnds(String str,String expectedResult){

        String result = new Mirror().mirrorEnds(str);
        System.out.println(result);
        Assertions.assertEquals(expectedResult, result);
    }

}
