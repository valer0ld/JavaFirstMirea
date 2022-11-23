package ru.mirea.task14.ex9;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDictionary {
    public static void main(String[] args) {
        Letter[] letterDictionary = new Letter[26];
        Pattern letters = Pattern.compile("[a-zA-Z]");
        for(int i = 0; i < 26; i++) letterDictionary[i] = new Letter(Character.toString((char)(97 + i)));
        Matcher matcher = letters.matcher("One Piece is a Japanese manga series written and illustrated by Eiichiro Oda.");
        while(matcher.find())
        {
            for(int i = 0; i < 26; i++)
            {
                if (letterDictionary[i].getLetter().equalsIgnoreCase(matcher.group())) letterDictionary[i].add();
            }
        }
        System.out.println(Arrays.toString(letterDictionary));
    }
}
