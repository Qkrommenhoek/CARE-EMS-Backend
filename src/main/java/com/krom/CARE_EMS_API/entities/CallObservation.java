package com.krom.CARE_EMS_API.entities;

import java.time.Instant;
public record CallObservation(String zipCode, Instant time,
    Integer observed, Integer forecast) {}
