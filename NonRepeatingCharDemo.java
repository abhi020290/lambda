package com.company;

public class NonRepeatingCharDemo {
    public static void main(String[] args) {
        System.out.println(nonRepeatingCharDemo());
    }

    public static String nonRepeatingCharDemo(){
      String str = "raccare";
        for(int i =0 ; i < str.length();i++){
          if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
              return String.valueOf(str.charAt(i));
          }
      }
      return null;
    }
}
