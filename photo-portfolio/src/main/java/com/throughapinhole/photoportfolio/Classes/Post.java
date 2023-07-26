package com.throughapinhole.photoportfolio.Classes;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Post {
    private int id;
    private String link;
    private String modified;
    private String type;
    private String title;
    private String content;
    private int author;
    private int featuredMedia;
    private ArrayList<Integer> categories;
    private ArrayList<Integer> tags;
    private String thumbnailImage;

    public Post(String type, String title, String content, int author) {
        this.type = type;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void addCategory(int categoryId) {
        this.categories.add(categoryId);
    }
    public void removeCategory(int categoryId) {
        if (this.categories.contains(categoryId)) {
            this.categories.remove(categoryId);
        }
    }

    public void addTag(int tagId) {
        this.tags.add(tagId);
    }
    public void removeTag(int tagId) {
        if (this.tags.contains(tagId)) {
            this.tags.remove(tagId);
        }
    }

    /*
     * Not sure if we want to do this here, or in the database directly
    private generateId() {
    }

    private generateLink() {

    }
    */
}
