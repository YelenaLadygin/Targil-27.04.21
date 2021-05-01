package com.company;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;
import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {
// 4
        String name = "hi hi hi";
        int s;
        try {
            s = countChar(name);
            if (s != 0) {
                System.out.println("Number characters is (including spaces) " + countChar(name));
            } else throw new CountCharException("The wrong element");
        } catch (CountCharException ex) {
            System.out.println(ex);
        }

   //7
        Person getPersonName = new Person();
        Field f = getPersonName.getClass().getDeclaredField("name");
        f = getPersonName.getClass().getDeclaredField("name");
        f.setAccessible(true);
        System.out.println(getPersonName);
    }

    //4
    private static int countChar(String character) {
        int counter = character.length();
        return counter;
    }
}













