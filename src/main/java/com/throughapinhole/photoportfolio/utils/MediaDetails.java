package com.throughapinhole.photoportfolio.utils;

import lombok.Data;

/** Implements data structure for Media Details. */
@Data
public class MediaDetails {
    private long id;
    private int width;
    private int height;
    private String file;
    private String mediaType;
    private MediaSize[] sizes;
}
