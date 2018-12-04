package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name="str {0},cipherResult {1}")
    @CsvSource({ "abc,def"})
    public void testCaesarCipher(String str,String cipherstr){

        String cipherResult = new CaesarShiftCipher().CaesarShiftCipher(str,3);

        //Assertions.assertTrue(expectedResult == result);
        Assertions.assertEquals(cipherstr, cipherResult);

    }

}
