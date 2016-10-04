package com.javarush.test.level08.lesson08.task02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 20; i++)
        {
            hashSet.add(i);
        }
        return hashSet;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        Integer number;
        while (iterator.hasNext()){
            number = iterator.next();
            if (number > 10){
                set.remove(0);
            }
            i++;
        }
        return set;
    }

    public static void main(String[] args)
    {
        HashSet<Integer> hashSet = createSet();
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Измененный список: ");
        hashSet = removeAllNumbersMoreThan10(hashSet);
        Iterator iterator1 = hashSet.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
