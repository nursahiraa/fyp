show databases;

use sahiraDB;

CREATE TABLE population_state
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    State      VARCHAR(255),
    Date       VARCHAR(255),
    Sex        VARCHAR(255),
    Age        VARCHAR(255),
    Ethnicity  VARCHAR(255),
    Population INT
);

show tables;

INSERT INTO population_state (State, Date, Sex, Age, Ethnicity, Population)
VALUES ('Johor', '1970-01-01', 'both', 'overall', 'overall', 1325.6),
       ('Johor', '1970-01-01', 'both', '0-4', 'overall', 210.1),
       ('Johor', '1970-01-01', 'both', '5-9', 'overall', 215.7),
       ('Johor', '1970-01-01', 'both', '10-14', 'overall', 192.2),
       ('Johor', '1970-01-01', 'both', '15-19', 'overall', 152.8),
       ('Johor', '1970-01-01', 'both', '20-24', 'overall', 110.7),
       ('Johor', '1970-01-01', 'both', '25-29', 'overall', 76.9),
       ('Johor', '1970-01-01', 'both', '30-34', 'overall', 76.8),
       ('Johor', '1970-01-01', 'both', '35-39', 'overall', 59.2),
       ('Johor', '1970-01-01', 'both', '40-44', 'overall', 51.7);

select * from population_state;

