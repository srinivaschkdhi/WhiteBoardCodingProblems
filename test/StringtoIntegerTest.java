import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringtoIntegerTest{

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testfirstNonWhiteSpaceCharacter(){
     char actualChar = StringtoInteger.findNonWhiteSpaceChar("+-2");
     char expectedChar = '-';
     assertEquals(expectedChar, actualChar);
    }

    @Test
    void checkIfValid(){
        boolean actualRes = StringtoInteger.ifConversionPossible("+-2");
        assertTrue(actualRes);
    }

    @ParameterizedTest
    @CsvSource(value = {"-42,1","42,0"})
    void findDigitIndex(String input,int output){
        int acutalRes = StringtoInteger.findDigitIndex(input);
        assertEquals(output, acutalRes);
    }

    @Test
    void isintrange(){
        boolean actualRes = StringtoInteger.isInIntRange(-912834700);
        assertTrue(actualRes);
    }







}