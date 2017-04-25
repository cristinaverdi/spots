package com.spots.service;

import com.spots.model.Spot;
import com.spots.model.User;

import java.util.List;

public interface SpotService {

    List<Spot> findAll();

    /** Find spot depending on introduced search value: name or category
     or return null if it doesn't exist*/

    List<Spot> findSpotsBySearchValue(String searchValue);

    Spot findSpotByName(String name);

    Spot saveSpot(Spot newSpot);

}
