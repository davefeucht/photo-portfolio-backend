package com.throughapinhole.photoportfolio.entities;

import lombok.Data;

/**
 * Implements data structure for a User.
 */
@Data
public class User {
  private long id;
  private String email;
  private String name;
  private String password;
}
