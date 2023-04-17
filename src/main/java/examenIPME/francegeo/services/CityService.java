package examenIPME.francegeo.services;

import examenIPME.francegeo.entities.City;
import examenIPME.francegeo.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getAll(){return this.cityRepository.findAll();}

    public Optional<City> getById(Long id){return this.cityRepository.findById(id);}
}
