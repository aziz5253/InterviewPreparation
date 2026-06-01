package com.hibernatedemo.hibernate.entity;

import jakarta.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Embedded

    @AttributeOverrides({
            @AttributeOverride(name="street", column=@Column(name="HOME_STREET")),
            @AttributeOverride(name="city", column=@Column(name="HOME_CITY"))
    })
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
