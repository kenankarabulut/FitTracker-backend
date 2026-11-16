package htwBerlin.FitTracker;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class FitTrackerEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int gram;
    private double calories;
    private double carbohydrates;
    private double protein;
    private LocalDate date;




    public FitTrackerEntry(Long id, String name, int gram, double protein, double carbohydrates, double calories, LocalDate date) {
        this.id = id;
        this.name = name;
        this.gram = gram;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
        this.date = date;
    }

    public FitTrackerEntry() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

}