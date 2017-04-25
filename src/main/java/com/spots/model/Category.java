package com.spots.model;


/**
 * Categories classify a business based on its level of sustainability
 * A user cannot add a new category. We establish them by default.
 * A User assigns a  suggested category from this list to a spot when a new spot is created.
 * A Spot belongs only to one Category. TODO decide if we want to allow that a spot can have multiple categories
 */

public enum Category {

    //TODO: save as table in db
    SLOW_FOOD, SHARING_ECONOMY, CRAFTMANSHIP, CONCIOUS_FASHION, SUSTAINABLE_ENERGY, ORGANIC_FOOD, ZERO_WASTE, CONSUMER_COOPERATIVE, URBAN_FARMING, COOPERATIVE, SOCIAL_ECONOMY

}
