package com.example.corona;


import CoronaVirusLocation.Location;
import com.example.corona.Service.CoronaVirusServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CoronaApplicationController {
    @Autowired
    CoronaVirusServiceLayer coronaVirusServiceLayer;

    @GetMapping("coronavirusafricanng.com")
    public String home (Model model){
        List<Location> locations = coronaVirusServiceLayer.getLocations();
        int totalReportedCases = locations.stream().mapToInt(stat-> stat.getLatestTotalCases()).sum();
        int totalNewCases = locations.stream().mapToInt(stat-> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("Locations", locations );
        model.addAttribute("totalReportedCases", totalReportedCases );
        model.addAttribute("totalNewCases", totalNewCases );
        return "home";
    }
}
