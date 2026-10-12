package htwBerlin.FitTracker;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class FitTrackerEntry {
    private String name;
    private boolean registered;
    private LocalDate date;
    private double calories;
    private double carbohydrates;
    private double protein;
    private int gram;

    public FitTrackerEntry(String name, int gram, boolean registered, LocalDate date) {
        this.name = name;
        this.gram= gram;
        this.registered = registered;
        this.date = date;
    }

    public FitTrackerEntry(String name, int gram, double protein, double carbohydrates, double calories, boolean registered, LocalDate date) {
        this.name = name;
        this.gram = gram;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
        this.registered = registered;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public double getProtein() {
        return protein;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public int getGram() {
        return gram;
    }
    public boolean getRegistered() {
        return registered;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }
}