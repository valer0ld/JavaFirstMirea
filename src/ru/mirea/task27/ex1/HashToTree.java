package ru.mirea.task27.ex1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HashToTree {
    public static void main(String[] args) {
        Set<Integer> hash = new HashSet<>();
        hash.add(123);
        hash.add(456);
        hash.add(789);
        Set<Integer> tree = new TreeSet<>(hash);
        System.out.println(hash);
        System.out.println(tree);
    }
}
