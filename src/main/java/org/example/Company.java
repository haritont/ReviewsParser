package org.example;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<String> reviews;

    public void setName(String name) {
        this.name = name;
    }

    public void setReviews(ArrayList<String> reviews) {
        this.reviews = reviews;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(name);
        for (String review:reviews){
            System.out.println(review);
        }
    }
}
