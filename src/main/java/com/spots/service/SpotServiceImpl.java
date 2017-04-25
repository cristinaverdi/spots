package com.spots.service;

import com.spots.model.Spot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpotServiceImpl implements SpotService {

    private List<Spot> spots;

   public SpotServiceImpl() {
       this.spots = new ArrayList<>();
   }


    @Override
    public List<Spot> findAll() {
        return this.spots;
    }

    /** Find spot depending on introduced search value: name or category
    or return null if it doesn't exist*/
    @Override
    public List<Spot> findSpotsBySearchValue(String searchValue) {
        List<Spot> result = new ArrayList<>();
        for (Spot spot : spots) {
            if(spot.getName().contains(searchValue) || spot.getCategory().equals(searchValue) || spot.getSubcategory().equals(searchValue)) {
                result.add(spot);
            }
        }
       return result;
    }

    @Override
    public Spot findSpotByName(String name) {
        for (Spot spot : spots) {
            if(spot.getName().equals(name)) {
                return spot;
            }
        }
        return null;
    }


    @Override
    public Spot saveSpot(Spot newSpot) {
        spots.add(newSpot);
        return newSpot;
    }
}
