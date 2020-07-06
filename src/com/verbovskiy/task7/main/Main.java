package com.verbovskiy.task7.main;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("1 — английский \n2 — белорусский \nлюбой — русский ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            String country = "";
            String language = "";
            switch (choice) {
                case 1:
                    country = "US";
                    language = "en";
                    break;
                    case 2:
                        country = "BY";
                        language = "be";
                        break;
            }
            Locale current = new Locale(language, country);
            ResourceBundle rb = ResourceBundle.getBundle("datares.text", current);
            String s1 = rb.getString("str1");
            System.out.println(s1);
            String s2 = rb.getString("str2");
            System.out.println(s2);
        }
    }
}
