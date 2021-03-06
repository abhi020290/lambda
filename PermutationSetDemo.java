package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class PermutationSetDemo {
    public HashSet getSetMain() {
        return setMain;
    }

    HashSet setMain = new HashSet();

    public static void main(String[] args) {
        PermutationSetDemo p = new PermutationSetDemo();
        HashSet abc = p.demo("ABC");
        p.getSetMain().stream().forEach(System.out::println);
    }

    public HashSet demo(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {


            HashSet set = new HashSet();
            char ch = str.charAt(i);

            if (str.length() > 2) {
                sb.append(ch);
                HashSet demo = demo(str.substring(1));
                Iterator iterator = demo.iterator();
                while (iterator.hasNext()) {
                    String next = (String) iterator.next();
                    next = ch + next;
                    setMain.add(next);
                }
            } else {
                set.add(new StringBuilder().append(str.charAt(0)).append(str.charAt(1)).toString());
                set.add(new StringBuilder().append(str.charAt(1)).append(str.charAt(0)).toString());
            }
            return set;
        }

        return null;
    }
}
