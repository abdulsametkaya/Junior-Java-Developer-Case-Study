package org.junior.task_01;

import org.junior.exceptions.CustomException;
import org.junior.exceptions.ExceptionMessages;

public class MergeString {

    /*1.	Merge String
    Fonksiyonumuz string olarak 2 parametre alacak. String a ve String b. Amacımız bu iki stringi tek bir
     stringte sırasıyla birleştirmek.
    Örneğin:
    String a = hrte
    String b = aars
    Çıktı: haratres
    Kısıtlar
    a ve b nin boyuları 1< a, b < 2500 olmalıdır*/

    public static String mergeMethod(String str1, String str2) {
        String result = "";

        if ((str1.length() < 1 && str2.length() < 1) || (str1.length() >2500 && str2.length() > 2500)) {
            throw new CustomException(ExceptionMessages.ILLEGAL_LENGTH);
        }

        for (int i = 0; i < str1.length(); i++) {
            result += str1.substring(i, i + 1);

            for (int j = i; j < str2.length(); i++) {
                result += str2.substring(j, j + 1);
                break;
            }
        }


        return result;
    }


    //if you want same length strings
    public static String mergeMethodWithSameLength(String str1, String str2) {
        String result = "";

        if (str1.length() < 1 || str2.length() > 2500) {
            throw new CustomException(ExceptionMessages.ILLEGAL_LENGTH);
        }

        if (str1.length() != str2.length()) {
            throw new CustomException(ExceptionMessages.NOT_EQUAL_LENGTH);
        }

        for (int i = 0; i < str1.length(); i++) {
            result += str1.charAt(i);
            result += str2.charAt(i);
        }

        return result;
    }


}
