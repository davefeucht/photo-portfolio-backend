package com.throughapinhole.photoportfolio.entities;

import java.util.Date;
import lombok.Data;

@Data
public class Page {
    private long id;
    private String link;
    private Date modified;
    private String type;
    private String title;
    private String content;
    private long authorId;
    private long featuredMediaId;
}
