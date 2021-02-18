package com.company.dahms;

import java.util.HashMap;

import java.util.Scanner;

public class AddressBook {
    //initial intent was to have the map store the data from person, that doesn't work, so I gotta pass it in.
    public Scanner input = new Scanner(System.in);
    HashMap<String, String> book = new HashMap();

    public AddressBook(String name, String address) {
        book.put(name, address);
    }

    public void findPerson(){
        System.out.println("Please enter a name.");

        String find = input.nextLine();

        String output = book.get(find);
        if (output == null) {
            System.out.println("Invalid input");
        } else {
            System.out.println(input+ "'s email address is: " + output);
        }

    }

    public void update(){
        System.out.println("Please enter the name of the person who's contact info you'd like to update.");
        String updateIndex = input.nextLine();
        System.out.println("Please enter the updated email.");
        String updateData = input.nextLine();

        if (book.get(updateIndex) == null){
            System.out.println("That person is not in the address book");
            update();
        }else{
            book.put(updateIndex,updateData);
        }


    }

}
