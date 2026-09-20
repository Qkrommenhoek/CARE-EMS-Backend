CREATE TABLE zip_area (
    zip_code      varchar(5) PRIMARY KEY,
    neighborhood  text,
    population    integer,
    boundary_wkt  text,
    lat           double precision,
    lon           double precision
);

CREATE TABLE call_observation (
    zip_code     varchar(5)  NOT NULL REFERENCES zip_area (zip_code),
    observed_at  timestamptz NOT NULL,
    observed     integer,
    forecast     integer,
    PRIMARY KEY (zip_code, observed_at)
);

CREATE INDEX ix_call_observation_observed_at ON call_observation (observed_at);