package com.spots.api;

import com.spots.api.errors.AlreadyExistingException;
import com.spots.model.Spot;
import com.spots.service.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/spots")
public class SpotController {
    private SpotService spotService;

    @Autowired
    public SpotController(SpotService spotService) {
        this.spotService = spotService;
    }

    //Endpoints

    @RequestMapping(value= "/all", method = RequestMethod.GET)
    private List<Spot> findAll() {
        return spotService.findAll();
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public Spot findSpotBySearchValue(@RequestParam(value="n") String searchValue) { // o @PathVariable ??
        return spotService.findSpotBySearchValue(searchValue);
    }

    @RequestMapping(value= "/save", method = RequestMethod.POST)
    public @ResponseBody Spot saveSpot( @RequestBody Spot newSpot) {
        Spot spot = spotService.findSpotByName(newSpot.getName());


        if(spot == null) {  //check that the spot doesn't exist yet, TODO: better to check by location?
           return spotService.saveSpot(newSpot);
        }else {
            throw new AlreadyExistingException("Spot already exists");
        }
    }

}
