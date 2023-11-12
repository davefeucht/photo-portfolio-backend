package com.throughapinhole.photoportfolio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Data;

@Entity
@Data
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String link;
    private Date modified;
    private String type;
    private String title;
    private String content;
    private long authorId;
    private long featuredMediaId;
}
