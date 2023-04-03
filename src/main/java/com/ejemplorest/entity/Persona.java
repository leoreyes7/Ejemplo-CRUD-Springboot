package com.ejemplorest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer person_id;
    private Integer person_rut;
    private String person_firstname;
    private String person_lastname;
    private String person_mail;

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public Integer getPerson_rut() {
        return person_rut;
    }

    public void setPerson_rut(Integer person_rut) {
        this.person_rut = person_rut;
    }

    public String getPerson_firstname() {
        return person_firstname;
    }

    public void setPerson_firstname(String person_firstname) {
        this.person_firstname = person_firstname;
    }

    public String getPerson_lastname() {
        return person_lastname;
    }

    public void setPerson_lastname(String person_lastname) {
        this.person_lastname = person_lastname;
    }

    public String getPerson_mail() {
        return person_mail;
    }

    public void setPerson_mail(String person_mail) {
        this.person_mail = person_mail;
    }

}

