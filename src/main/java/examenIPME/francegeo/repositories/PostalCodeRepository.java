package examenIPME.francegeo.repositories;

import examenIPME.francegeo.entities.PostalCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostalCodeRepository extends JpaRepository<PostalCode,Long> {
}
