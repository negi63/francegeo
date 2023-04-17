package examenIPME.francegeo.entities;

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
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String siren;
    private long population;
    private String name;
    private String code;
    @ManyToOne(targetEntity = Department.class)
    private Department department;
    @OneToMany(targetEntity = PostalCode.class, mappedBy = "city")
    private List<PostalCode> postalCodes = new ArrayList<>();

}
