package com.throughapinhole.photoportfolio.entities;

import lombok.Data;

@Data
public class SiteInfo {
    private String description;
    private String gmtOffset;
    private long siteIcon;
    private long siteLogo;
    private String url;
}
