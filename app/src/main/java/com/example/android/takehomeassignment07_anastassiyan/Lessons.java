package com.example.android.takehomeassignment07_anastassiyan;

/**
 * Created by anastasianossal on 3/24/18.
 */

public class Lessons {
    String name;
    String duration;
    int image;

    public Lessons(String name, String duration, int image) {
        this.name = name;
        this.duration = duration;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public int getImage() {
        return image;
    }
}
