package com.javarush.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "world", name = "country_language")
public class CountryLanguage {

    @Id()
    private Integer id;
}
