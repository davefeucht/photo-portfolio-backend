package com.throughapinhole.photoportfolio.entities;

import com.throughapinhole.photoportfolio.utils.MediaDetails;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.Date;
import lombok.Data;

/** Immplements data structure for Media. */
@Data
public class Media {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String altText;

    private long authorId;
    private String caption;
    private Date creationDate;
    private String description;
    private String guid;
    private long id;
    private String link;
    private MediaDetails mediaDetails;
}
