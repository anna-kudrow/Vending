package ru.Geekbrains.Lesson1;

public class BottleOfMilk extends Product {
    private double volume;
    private int fat;


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, int fat) {
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }


    @Override
    public String displayInfo() {
        return String.format("[MILK] %s - %s - volume: %.2f; fat: %d, %.2f rub", brand, name, volume, fat, price);
    }
}

