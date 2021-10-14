package com.engeto.examples;

public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private boolean doesTheRoomHaveBalcony = false;
    private boolean seaView = false;
    private int pricePerNight;
    private String yesBalcony;
    private String yesSeaView;

    public Room(int roomNumber, int numberOfBeds, boolean doesTheRoomHaveBalcony, boolean seaView, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.doesTheRoomHaveBalcony = doesTheRoomHaveBalcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isDoesTheRoomHaveBalcony() {
        return doesTheRoomHaveBalcony;
    }

    public void setDoesTheRoomHaveBalcony(boolean doesTheRoomHaveBalcony) {
        this.doesTheRoomHaveBalcony = doesTheRoomHaveBalcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getDescription() {

        if (doesTheRoomHaveBalcony==true) {
            yesBalcony = "pokoj má balkón";
        } else {
            yesBalcony = "pokoj nemá balkón";
        }
        if (seaView==true) {
            yesSeaView = "má výhled na moře";
        } else {
            yesSeaView = "nemá výhled na moře";
        }
        return "Pokoj číslo"+roomNumber+" má "+numberOfBeds+" lůžko za cenu "+pricePerNight+" Kč za noc, "+yesBalcony+
                " a "+yesSeaView+".";
    }


    public void setDescription(int roomNumber, int numberOfBeds, boolean doesTheRoomHaveBalcony, boolean seaView,
                               int pricePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.doesTheRoomHaveBalcony = doesTheRoomHaveBalcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }
}
