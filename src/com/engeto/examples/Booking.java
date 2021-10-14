package com.engeto.examples;

import java.time.LocalDate;

public class Booking {
    private String name;
    private String surname;
    private String name1;
    private String surname1;
    private int roomNumber;
    private LocalDate datumPrijezdu;
    private LocalDate datumOdjezdu;
    private Boolean workingStay;
    private Boolean recreationalStay;

    public Booking(String name, String surname, int roomNumber, LocalDate datumPrijezdu, LocalDate datumOdjezdu) {
        this.name = name;
        this.surname = surname;
        this.roomNumber = roomNumber;
        this.datumPrijezdu = datumPrijezdu;
        this.datumOdjezdu = datumOdjezdu;
    }

    public Booking(String name, String surname, String name1, String surname1, int roomNumber, LocalDate datumPrijezdu,
                   LocalDate datumOdjezdu) {
        this(name, surname, roomNumber, datumPrijezdu, datumOdjezdu);
        this.name = name;
        this.surname = surname;
        this.name1 = name1;
        this.surname1 = surname1;
        this.roomNumber = roomNumber;
        this.datumPrijezdu = datumPrijezdu;
        this.datumOdjezdu = datumOdjezdu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getDatumPrijezdu() {
        return datumPrijezdu;
    }

    public void setDatumPrijezdu(LocalDate datumPrijezdu) {
        this.datumPrijezdu = datumPrijezdu;
    }

    public LocalDate getDatumOdjezdu() {
        return datumOdjezdu;
    }

    public void setDatumOdjezdu(LocalDate datumOdjezdu) {
        this.datumOdjezdu = datumOdjezdu;
    }

    public String getDescription() {
       if (roomNumber==1 || roomNumber==2) {
            name1 = "";
            surname1 = "";
        }
       return "Rezervace pro "+name+" "+surname+","+name1+" "+surname1+" na pokoj číslo "+roomNumber
                +" od "+datumPrijezdu+" do "+datumOdjezdu+".";
    }

    public void setDescription(String name, String surname, String name1, String surname1, int roomNumber,
                               LocalDate datumPrijezdu, LocalDate datumOdjezdu) {
        this.name = name;
        this.surname = surname;
        this.name1 = name1;
        this.surname1 = surname1;
        this.roomNumber = roomNumber;
        this.datumPrijezdu = datumPrijezdu;
        this.datumOdjezdu = datumOdjezdu;
    }

}
