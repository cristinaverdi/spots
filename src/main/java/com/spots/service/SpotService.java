package com.spots.service;

import com.spots.model.Spot;
import com.spots.model.User;

public interface SpotService {

    /** Find spot depending on introduced search value: name or category
     or return null if it doesn't exist*/
    Spot findSpotBySearchValue(String searchValue);

    Spot findSpotByName(String name);

    Spot saveSpot(Spot newSpot);

}
