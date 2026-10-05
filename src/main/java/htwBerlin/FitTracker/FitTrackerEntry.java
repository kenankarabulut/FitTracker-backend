package htwBerlin.FitTracker;

import java.util.List;

public class FitTrackerEntry {
    private int age;
    private int height;
    private Gender gender;

    public FitTrackerEntry(int age, Gender gender, int height) {
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}