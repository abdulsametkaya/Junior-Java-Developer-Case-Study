package org.junior.task_02;

import org.junior.exceptions.CustomException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CloseNumbersTest {

    CloseNumbers testInstance = new CloseNumbers();

    @Test
    public void closestNumbersTest() {
        List<String> expected = new ArrayList<>();
        expected.add("12 15");
        expected.add("32 35");

        int[] arr = { 32, 41, 12 , 15, 21, 32, 48, 35};
        assertEquals(expected, testInstance.closeNumbersMethod(arr));
    }

    @Test
    public void closestNegativeNumbersTest() {
        List<String> expected = new ArrayList<>();
        expected.add("-13 -12");


        int[] arr = { 32, 41, 12, -12, 15, 21, 32, -13, 48, 35};
        assertEquals(expected, testInstance.closeNumbersMethod(arr));
    }



    @Test
    void illegalArrayElementLengthExceptionTest() {
        int[] arr = { 32, 41, 12 , 15, 21332, 32, 48, 35};

        assertThrows(CustomException.class, ()->{
            System.out.println("illegal Array Element Length Exception Test is run");
            testInstance.closeNumbersMethod(arr);
        });
    }



}