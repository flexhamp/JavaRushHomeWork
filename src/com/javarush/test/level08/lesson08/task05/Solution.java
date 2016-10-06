package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createMap();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        removeTheFirstNameDuplicates((HashMap<String, String>) map);

        System.out.println("----------------------------------------");
        while (iterator.hasNext())
        {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Iterator0", "aa");
        map.put("Iterator1", "aa");
        map.put("Iterator2", "bb");
        map.put("Iterator3", "bb");
        map.put("Iterator4", "vv");
        map.put("Iterator5", "vv");
        map.put("Iterator6", "vv");
        map.put("Iterator7", "cc");
        map.put("Iterator8", "cc");
        map.put("Iterator9", "acc");

        return (HashMap<String, String>) map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> entry = iterator.next();
            removeItemFromMapByValue(map, entry.getValue());
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext())
        {
            if (iterator.next().getValue().equals(value) && i > 0)
            {
                iterator.remove();
            }
            if(iterator.next().getValue().equals(value) && i == 0){
                i++;
            }
            else {}
        }


//        for (Map.Entry<String, String> pair: copy.entrySet())
//        {
//            if (pair.getValue().equals(value))
//                map.remove(pair.getKey());
//        }
    }
}
