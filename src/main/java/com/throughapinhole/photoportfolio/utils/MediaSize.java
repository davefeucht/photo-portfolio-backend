package com.throughapinhole.photoportfolio.utils;

import lombok.Data;

/** Implements data structure for Media Size. */
@Data
public class MediaSize {
    private int id;
    private String name;
    private String file;
    private int width;
    private int height;
    private String sourceUrl;
}
