/*Description:
--------------------------------------
Model Class houses Data Logic
Interacts with DB/performs CRUD operations
--------------------------------------
--------------------------------------
Returns Data to Controller*/


package com.backend.springboot.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//Generates User table in DB
@Entity
public class User {

    //Create fields for User Object


    //Auto Generate ID
    //Auto Increment ID
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String name;
    private String email;


    //Getters & Setters to access fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
