package com.klopblop.mvc.models;

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
    private String email;

    @NotNull
    private String name;

    // Public methods

    public UserInfo() { }

    public UserInfo(long id) {
        this.id = id;
    }

    public UserInfo(String email, String name) {
        this.email = email;
        this.name = name;
    }

}
