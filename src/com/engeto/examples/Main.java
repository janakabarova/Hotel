package com.engeto.examples;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Guest guest1 = new Guest( "Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        //print description
        System.out.println(guest1.getDescription());
        System.out.println(guest2.getDescription());
        System.out.println();

        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, false, true, 2400);

        //print description
        System.out.println(room1.getDescription());
        System.out.println(room2.getDescription());
        System.out.println(room3.getDescription());
        System.out.println();

        Booking booking1 = new Booking("Adéla", "Malíková", 1, LocalDate.of(2021, 7,
                19), LocalDate.of(2021, 7, 26));
        Booking booking2 = new Booking("Adéla", "Malíková", "Jan", "Dvořáček", 3,
                LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14));

        //print description
        System.out.println(booking1.getDescription());
        System.out.println(booking2.getDescription());
    }
}