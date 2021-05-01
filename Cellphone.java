package com.company;

import java.util.ArrayList;

public class Cellphone {

    public ArrayList<String> phoneBook = new ArrayList<>();


    public String addPhoneNumberToList( String phoneNumber,ArrayList<String> phoneBook) {
     phoneBook.add(phoneNumber);
     int index = 10;
     if (phoneBook.size() > index) {
     throw new PhoneBooksFullExeption (String.format("PhoneBooksFullExeption with %d element only ",index));
     }
     if (phoneNumber!= null) {
     return phoneNumber;}
     else
     throw new InvalidNumberException(
     String.format("% s is Invalid Number",phoneNumber));
 }

    public String callNumber(String phoneNum,ArrayList<String> phoneBook) {
    if (phoneNum!= null) {
    System.out.println(String.format("Calling %s", phoneNum));
    return phoneNum;
    }
    else
    throw new InvalidNumberException(
    String.format("The phone number is  wrong %s", phoneNum));
    }
}

