package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       String regex= "ab+c";
       // pureString.matches(regex)
        String emailRegex= "[a-zA-Z0-9]+@gmail.com";


        Pattern pattern =Pattern.compile(emailRegex);
        Matcher matcher= pattern.matcher("anur@gmail.com");

       if(matcher.matches())
           System.out.println("valid");
       else
           System.out.println("Invalid");
    }
}