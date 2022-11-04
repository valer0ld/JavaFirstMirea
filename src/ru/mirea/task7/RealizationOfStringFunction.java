package ru.mirea.task7;

import java.util.Arrays;

public class RealizationOfStringFunction implements StringFunc{

    @Override
    public int length(String s) {
        return s.length();
    }

    @Override
    public String oddString(String s) {
        String t = "";
        for(int i = 1; i < s.length(); i++) if (i % 2 == 1) t += s.charAt(i);
        return t;
    }

    @Override
    public String invert(String s) {
        char t;
        char[] ch = s.toCharArray();
        for(int i = 0; i < s.length() / 2; i++)
        {
            t =  ch[s.length() - i - 1];
            ch[s.length() - i - 1] = ch[i];
            ch[i] = t;
        }
        return new String(ch);
    }
}
