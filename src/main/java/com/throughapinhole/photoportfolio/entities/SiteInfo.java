package com.throughapinhole.photoportfolio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class SiteInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String description;

    private String gmtOffset;
    private long siteIcon;
    private long siteLogo;
    private String url;
}
