/*
 * Copyright (C) 2017 Andrea Binello ("andbin")
 *
 * This file is part of the "Java Gson Demos" project and is licensed
 * under the MIT License. See one of the license files included in the root
 * of the project for the full text of the license.
 */

package net.andbin.gsondemos.basic;

import static net.andbin.gsondemos.ToStringUtils.stdToStringBuilder;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {}

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return stdToStringBuilder(this)
                .append("firstName", getFirstName())
                .append("lastName", getLastName())
                .append("birthYear", getBirthYear())
                .toString();
    }
}
