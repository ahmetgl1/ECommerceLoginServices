package entities.concretes;

import entities.abstracts.IEntity;


public class Customer implements IEntity {


    private int id;
    private String name;
    private String surName;
    private String eposta;
    private String password;


    public Customer(int id, String name, String surName, String eposta, String password) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.eposta = eposta;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
