package examenIPME.francegeo.entities;

import com.fasterxml.jackson.annotation.JsonView;
import examenIPME.francegeo.views.View;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @JsonView({View.RegionResponseView.class, View.DepartmentResponseView.class})
    private String name;
    @JsonView({View.RegionResponseView.class, View.DepartmentResponseView.class})
    private String code;
    @ManyToOne(targetEntity = Region.class)
    @JsonView(View.DepartmentResponseView.class)
    private Region region;
    @OneToMany(targetEntity = City.class, mappedBy = "department")
    private List<City> cities = new ArrayList<>();


}
