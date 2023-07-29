package com.throughapinhole.photoportfolio.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class SiteInfo {
    private String description;
    private String gmt_offset;
    private String home;
    private int site_icon;
    private String site_icon_url;
    private int site_logo;
    private String timezone_string;
    private String url;
}
