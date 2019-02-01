package com.clockworkjava.herokuDemo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Daniel_D'AGE on 01.02.2019.
 */

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
