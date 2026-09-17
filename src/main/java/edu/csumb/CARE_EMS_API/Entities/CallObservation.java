package edu.csumb.CARE_EMS_API.Entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data 
@Entity 
public class CallObservation {

    private String zipCode;
    private Instant time;
    private Integer observed;
    private Integer forecast;
    @ManyToOne
    @JoinColumn(name = "zip_code", referencedColumnName = "zipCode")
    private ZipArea zipArea;
}
