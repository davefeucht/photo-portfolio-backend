package com.throughapinhole.photoportfolio.entities;

import com.throughapinhole.photoportfolio.utils.MediaDetails;
import java.util.Date;
import lombok.Data;

/**
 * Immplements data structure for Media.
 */
@Data
public class Media {
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
