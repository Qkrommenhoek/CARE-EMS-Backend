package com.krom.CARE_EMS_API.entities;
public record ZipArea(String zipCode, String neighborhood, Integer population,
    String boundaryWkt, Double lat, Double lon) {}
    