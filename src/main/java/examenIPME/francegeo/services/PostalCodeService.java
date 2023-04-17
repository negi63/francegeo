package examenIPME.francegeo.services;

import examenIPME.francegeo.entities.PostalCode;
import examenIPME.francegeo.repositories.PostalCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostalCodeService {
    private final PostalCodeRepository postalCodeRepository;

    @Autowired
    public PostalCodeService(PostalCodeRepository postalCodeRepository) {
        this.postalCodeRepository = postalCodeRepository;
    }

    public List<PostalCode> getAll(){return this.postalCodeRepository.findAll();}

    public Optional<PostalCode> getById(Long id){return this.postalCodeRepository.findById(id);}
}
