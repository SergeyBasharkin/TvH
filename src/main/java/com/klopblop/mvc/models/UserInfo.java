package com.klopblop.mvc.models;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Admin on 24.09.2016.
 */
//Не законченный
@Entity
@Table(name = "h_users")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Email
    @Column(unique = true)
    private String email;

    private String hashPassword;


    @NotNull
    private String name;



    // Public methods

    public UserInfo() { }

    public UserInfo(long id) {
        this.id = id;
    }

    public UserInfo(String email, String hashPassword, String name) {
        this.email = email;
        this.hashPassword = hashPassword;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
