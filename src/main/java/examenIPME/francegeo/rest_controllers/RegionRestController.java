package examenIPME.francegeo.rest_controllers;

import com.fasterxml.jackson.annotation.JsonView;
import examenIPME.francegeo.entities.Region;
import examenIPME.francegeo.services.RegionService;
import examenIPME.francegeo.views.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/region")
public class RegionRestController {
    private final RegionService regionService;

    @Autowired
    public RegionRestController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping
    @JsonView(View.RegionResponseView.class)
    public List<examenIPME.francegeo.entities.Region> getRegionList() {
        return this.regionService.getAll();
    }

    @GetMapping(path = "{id}")
    @JsonView(View.RegionResponseView.class)
    public Optional<Region> getRegion(@PathVariable Long id) {
        return this.regionService.getById(id);
    }
}
