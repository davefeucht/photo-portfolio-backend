package com.throughapinhole.photoportfolio.entities;

import com.throughapinhole.photoportfolio.utils.Utils.USER_STATUS;
import java.util.Date;
import lombok.Data;

/** Implements data structure for a User. */
@Data
public class User {
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
