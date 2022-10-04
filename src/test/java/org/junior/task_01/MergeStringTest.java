package org.junior.task_01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringTest {

    MergeString testInstance = new MergeString();

    @ParameterizedTest
    @CsvSource(value= {"haratres,hrte,aars,","skaamyeats,samet,kayas,"})
    void mergeTwoSameLengthStringTest(String expected,String param1,String param2) {
        assertEquals(expected, testInstance.mergeMethod(param1,param2));
    }

    @ParameterizedTest
    @CsvSource(value= {"dteensetme,deneme,test,","dliefnfgetrhent,different,length,"})
    void mergeTwoDifferentLengthStringTest(String expected,String param1,String param2) {
        assertEquals(expected, testInstance.mergeMethod(param1,param2));
    }


}