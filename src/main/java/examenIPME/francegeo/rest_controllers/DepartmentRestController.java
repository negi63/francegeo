package examenIPME.francegeo.rest_controllers;

import com.fasterxml.jackson.annotation.JsonView;
import examenIPME.francegeo.entities.Department;
import examenIPME.francegeo.services.DepartmentService;
import examenIPME.francegeo.views.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/department")
public class DepartmentRestController {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentRestController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }


    @GetMapping
    @JsonView(View.DepartmentResponseView.class)
    public List<Department> getDepartmentList() {
        return this.departmentService.getAll();
    }

}
