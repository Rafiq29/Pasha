package Homework.July_29.Second_HW;

import Homework.July_29.Third_HW.Building;

public class Room extends Building {
    private int number;
    private String type;
    private int width;
    private int height;

    public Room(int number, String type, int width, int height, String city, String street) {
        super(city, street);
        this.number = number;
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "The room number is: " + number +
                "type is: " + type +
                "width: " + width +
                "height: " + height;
    }
}
