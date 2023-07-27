package com.throughapinhole.photoportfolio.Classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
/**
 * Represents a Category of the CMS
 */
public class Category {
    private int id;
    /** Number of items using this Category */
    private int count;
    /** Text description of the Category */
    private String description;
    /** HTML display name of the Category */
    private String name;
    /** Text name of the Category */
    private String taxonomy;
    /** ID of the parent category. Has value -1 if there is no parent */
    private int parent = Utils.CATEGORY_NO_PARENT;

    /**
     * Creates a Category with a given description, taxonomy and name
     * @param description Description of the Category
     * @param taxonomy Fixed text name of the Category
     * @param name HTML display name of the Category
     */
    public Category(String description, String taxonomy, String name) {
        this.description = description;
        this.taxonomy = taxonomy;
        this.name = name;
    }
}
