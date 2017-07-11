/*
 * Copyright (C) 2017 Andrea Binello ("andbin")
 *
 * This file is part of the "Java Gson Demos" project and is licensed
 * under the MIT License. See one of the license files included in the root
 * of the project for the full text of the license.
 */

package net.andbin.gsondemos.basic;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
 * This demo shows how to activate the "pretty printing" feature of Gson.
 */
public class PrettyPrintingDemo {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()   // Activates the "pretty printing" feature
                .create();

        Person person = new Person("George", "Boole", 1815);

        System.out.println("ORIGINAL PERSON:");
        System.out.println(person);

        String json = gson.toJson(person);

        System.out.println();
        System.out.println("GENERATED JSON:");
        System.out.println(json);

        Person person2 = gson.fromJson(json, Person.class);

        System.out.println();
        System.out.println("DESERIALIZED PERSON:");
        System.out.println(person2);
    }
}
