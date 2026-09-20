package com.krom.CARE_EMS_API.dto;


public record ZipAreaDTO(
    String zipCode,
    String neighborhood,
    Integer population,
    String boundaryWkt,
    Double lat,
    Double lon
) {}

