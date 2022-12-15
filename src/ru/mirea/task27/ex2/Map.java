package ru.mirea.task27.ex2;

import java.util.*;

public class Map{
    HashMap<String, String> map;
    public HashMap<String, String> createMap()
    {
        map = new HashMap<>();
        map.put("AAA", "aaa");
        map.put("AAA", "bbb");
        map.put("CCC", "ccc");
        map.put("DDD", "aaa");
        map.put("EEE", "ggg");
        map.put("JJJ", "jjj");
        map.put("III", "iii");
        map.put("GGG", "bbb");
        map.put("LLL", "lll");
        map.put("MMM", "mmm");
        return map;
    }

    public int getSameLastNameCount()
    {
        HashMap<String, String> tmp = map;
        Set<String> hash = map.keySet();
        Object[] keyAr = hash.toArray();
        String last = null;
        int counter = 0;
        for(int y = 0; y < keyAr.length; y++)
        {
            if (keyAr[y] != null) last = (String) keyAr[y];
            keyAr[y] = null;
            for(int i = 0; i < keyAr.length; i++)
            {
                if(Objects.equals((String) keyAr[i], last))
                {
                    keyAr[i] = null;
                    counter++;
                }
            }
        }
        return counter;
    }

    public int getSameFirstNameCount()
    {
        Object[] valueAr = map.values().toArray();
        String last = null;
        int counter = 0;
        for(int y = 0; y < valueAr.length; y++)
        {
            if (valueAr[y] != null) last = (String) valueAr[y];
            valueAr[y] = null;

            for(int i = 0; i < valueAr.length; i++)
            {
                if(Objects.equals((String) valueAr[i], last))
                {
                    valueAr[i] = null;
                    counter++;
                }
            }
        }
        return counter;
    }
}
