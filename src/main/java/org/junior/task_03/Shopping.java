package org.junior.task_03;

import org.junior.exceptions.CustomException;
import org.junior.exceptions.ExceptionMessages;
import java.util.*;


public class Shopping {

    /*3.	Alışveriş Sepeti
    Dışardan parametere olarak integer bir array alınacak. Bu araydeki her bir değer sepetimizdeki ürünleri ifade ediyor.
    Eğer sepetimdeki üründen sonraki gelen ürünün fiyatı daha düşük ise o ürünün fiyatı kadar indirim uygulanacaktır.
    Örneğin A = {5, 6, 4, 3, 4 }  2. ürün birinci üründen büyük olduğu için birinci ürüne indirim uygulanmaz ama 3. ürün
     2. üründen ucuz olduğu için 2. ürüne 4 lira indirim uygulanır. Aynı şekilde 4. ürün 3. üründen ucuz olduğu için
     3 lira indirim uygulanır. Yani sepetimizdeki ürünlerin indirim uygulandıktan sonraki fiyatları şu şekilde olur:
     B = { 5, 2, 1, 3, 4 }
    Sonuçlara sizlerden istenen
    a.	Sepetimizin son tutarının hesaplanması.
    b.	Sepetimizde indirim uygulanmayan elamanların küçükte büyüğe yazdırılması.

    Örnek çıktı: Toplam tutar: 15,  İndirim yapılmayan kalemler, C = {3, 4, 5}

    Kısıtlar: Arrayimizin boyu  1 < n < 100    arrayimizin elemanları ise 0 < i < 2.000
    */

    public static String shoppingCart(Integer[] arr) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        if (!(1<arr.length && arr.length<100)){
            throw new CustomException(ExceptionMessages.ILLEGAL_ARRAY_LENGTH);
        }
        for (Integer each : arr) {
            if (!(0 < each && each < 2000)) {
                throw new CustomException(ExceptionMessages.ILLEGAL_ARRAY_ELEMENT_LENGTH);
            }
        }

        for(int i = 0; i< arr.length-1; i++){
            list.add(arr[i]);

                if(arr[i]> arr[i+1]){
                    list.remove(Integer.valueOf(arr[i]));
                    arr[i] = arr[i] - arr[i+1];

            }
            sum += arr[i];
        }

        list.add(arr[arr.length-1]);
        sum+= arr[arr.length-1];
        Collections.sort(list);

        return "Toplam Tutar = " + sum + " İndirim yapılmayan kalemler " + list;

    }


}


