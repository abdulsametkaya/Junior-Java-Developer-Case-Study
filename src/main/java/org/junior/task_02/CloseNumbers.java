package org.junior.task_02;

import org.junior.exceptions.CustomException;
import org.junior.exceptions.ExceptionMessages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloseNumbers {

   /* 2.	Yakın Numaralar Problemi
    Dışardan parametre olarak integer sayılardan oluşan bir array alacağız. Bu array içerisindeki mutlak olarak
    en yakın sayıları tespit etmemiz ve sıralı şekilde yazdırmamız gerekiyor farkımız 0 dan büyük olmalı. Örneğin:
    Parametre olarak A= { 3, 1, 5, 23, 2, 4, 9, 10, 15, 31 }  min fark = |2-1| = 1 veya |5-4| = 1 demek oluyor bizim
    arrayimizdeki yakınlık seviyemiz minum 1 o zaman uygulamamızın çıktısı şu şekilde olmalı

        1 2
        2 3
        3 4
        4 5
        9 10

    Eğer listemiz B = { 32, 41, 12 , 15, 21, 32, 48, 35} şekilde olsaydı mutlak en küçük farkımız: |12 - 15| = 3
    Çıktımız: String array olarak : D = {"12 15", "32 35"} şeklinde olmalı.
    Kısıtlar: Arrayimizin boyu  1 < n < 1000    arrayimizin elemanları ise -20.000 < i < 20.000 */


    public static List<String> closeNumbersMethod(int[] arr) {
        int differance = Integer.MAX_VALUE;
        int lastDif = 0;
        List<String> result = new ArrayList<>();

        if (!(1<arr.length && arr.length<1000)){
            throw new CustomException(ExceptionMessages.ILLEGAL_ARRAY_LENGTH);
        }

        for (int i : arr) {
            if (!(-20000 < i && i < 20000)) {
                throw new CustomException(ExceptionMessages.ILLEGAL_ARRAY_ELEMENT_LENGTH);
            }
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] - arr[i + 1] != 0) {
                lastDif = -(arr[i] - arr[i + 1]);

                if (lastDif < differance) {
                    differance = lastDif;
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (-(arr[i] - arr[i + 1]) == differance) {
                result.add("" + arr[i] + " " + arr[i + 1]);
            }
        }
        return result;
    }
}
