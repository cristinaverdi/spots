package com.spots.model;
import java.util.Date;

public class Spot {

    private String name;
    private String description;
    private Category category;
    private Subcategory subcategory;
    private Date creationDate;
    //TODO: add location, contributorId, rating and usersWhoVoted, can belong to one or more categories and subcategories?


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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
