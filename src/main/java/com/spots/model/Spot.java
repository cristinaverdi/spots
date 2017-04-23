package com.spots.model;

import java.util.Date;

public class Spot {

    private String name;
    private String description;
    private String category;
    //TODO: add location, contributorId, rating and usersWhoVoted, creationDate


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
