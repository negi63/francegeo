package examenIPME.francegeo.services;

import examenIPME.francegeo.entities.Department;
import examenIPME.francegeo.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAll(){return this.departmentRepository.findAll();}

    public Optional<Department> getById(Long id){return this.departmentRepository.findById(id);}
}
