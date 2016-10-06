package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{


    public static HashSet<Integer> createSet()
    {
        Set<Integer> integerSet = new HashSet<>();
        //напишите тут ваш код
        for (int i = 0; i < 20; i++)
        {
            integerSet.add(i);
        }
        return (HashSet<Integer>) integerSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        LinkedList<Integer> linkedList = new LinkedList<>();
        //напишите тут ваш код
        int i = 0;
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            if ((Integer) iterator.next() >= 10)
            {
                iterator.remove();
            }
        }
        return set;
    }
}
