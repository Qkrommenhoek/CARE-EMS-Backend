package edu.csumb.CARE_EMS_API.Entities;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data 
@Entity 
public class ZipArea{
    @Id
    private String zipCode;
    
    private String neighborhood;
    private Integer population;

    @Column(columnDefinition = "text")
    private String boundaryWkt;

    private Double lat;
    private Double lon;

    @OneToMany(mappedBy = "zipArea", cascade = CascadeType.ALL)
    private List<CallObservation> observations;
}