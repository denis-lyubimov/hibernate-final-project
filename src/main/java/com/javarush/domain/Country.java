package com.javarush.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;



@Entity
@Table(schema = "world", name = "country")
public class Country {

    @Id
    @Column(name = "id", columnDefinition = "int default 0")
    private Integer id;

    @Column(name = "name")

}
