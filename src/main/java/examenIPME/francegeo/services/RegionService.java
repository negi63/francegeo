package examenIPME.francegeo.services;

import examenIPME.francegeo.entities.Region;
import examenIPME.francegeo.repositories.RegionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionService {
    private final RegionRepository regionRepository;

    @Autowired
    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    public List<Region> getAll(){return this.regionRepository.findAll();}

    public Optional<Region> getByCode(Long id){return this.regionRepository.findById(id);}
}
