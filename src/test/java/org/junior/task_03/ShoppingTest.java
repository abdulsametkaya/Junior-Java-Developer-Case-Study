package org.junior.task_03;

import org.junior.exceptions.CustomException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingTest {
    Shopping testInstance = new Shopping();

    @Test
    public void shoppingCartTest() {
        String expected ="Toplam Tutar = 15 İndirim yapılmayan kalemler [3, 4, 5]";

        Integer[] arr = {5, 6, 4, 3, 4 };
        assertEquals(expected, testInstance.shoppingCart(arr));
    }

    @Test
    public void shoppingCartWithoutDiscountTest() {
        String expected ="Toplam Tutar = 110 İndirim yapılmayan kalemler [5, 6, 8, 11, 22, 28, 30]";

        Integer[] arr = {5, 6, 8, 11, 22, 28,30 };
        assertEquals(expected, testInstance.shoppingCart(arr));
    }

    @Test
    public void shoppingCartWithAllDiscountTest() {
        String expected ="Toplam Tutar = 20 İndirim yapılmayan kalemler [2]";

        Integer[] arr = {20, 16, 12, 10, 4, 2 };
        assertEquals(expected, testInstance.shoppingCart(arr));
    }

    @Test
    void illegalArrayElementLengthExceptionTest() {
        Integer[] arr = {20, 16, 12, 2032, 4, 2 };

        assertThrows(CustomException.class, ()->{
            System.out.println("illegal Array Element Length Exception Test is run");
            testInstance.shoppingCart(arr);
        });
    }


}