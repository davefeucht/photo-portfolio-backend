package com.throughapinhole.photoportfolio.entities;

import com.throughapinhole.photoportfolio.utils.Utils.USER_STATUS;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Data;

/** Implements data structure for a User. */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String login;
    private String password;
    private String email;
    private Date registeredDate;
    private String activationKey;
    private USER_STATUS status;
    private String displayName;
    private String firstName;
    private String lastName;
    private String description;
}
