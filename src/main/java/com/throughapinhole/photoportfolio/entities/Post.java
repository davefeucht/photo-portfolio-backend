package com.throughapinhole.photoportfolio.entities;

import com.throughapinhole.photoportfolio.utils.Utils.EntityType;

import java.util.ArrayList;
import java.util.Date;
import lombok.Data;

/** Represents a Post of the CMS. */
@Data
public class Post {
    private long id;

    /** Date/Time Post was last modified. */
    private Date modified;
    /** Type of Post. */
    private EntityType type;
    /** Text title of Post. */
    private String title;
    /** Text content of Post. */
    private String content;
    /** User ID of author of Post. */
    private long authorId;

    /** Media ID of featured Media of Post. */
    private long featuredMediaId;

    /** List of Category IDs assigned to the Post. */
    private ArrayList<Integer> categoryIds;
    /** List of Tag IDs assigned to the Post. */
    private ArrayList<Integer> tagIds;
    /** Link to thumbnail image. */
    private String thumbnailImage;

    /**
        * Creates a Post with a given type, title, content and author. 
        * @param type Type of the Post
        * @param title Text title of the Post
        * @param content Text content of the Post
        * @param authorId User ID of the author of the Post
        */
    public Post(EntityType type, String title, String content, int authorId) {
        this.type = type;
        this.title = title;
        this.content = content;
        this.authorId = authorId;
    }

    /**
     * Adds a Category ID to the list of Categories for the Post.
     *
     * @param categoryId Category ID of the Category to add
     */
    public void addCategory(int categoryId) {
        this.categoryIds.add(categoryId);
    }

    /**
     * Removes a Category ID from the list of Categories for the Post.
     *
     * @param categoryId Category ID of the Category to remove
     */
    public void removeCategory(int categoryId) {
        if (this.categoryIds.contains(categoryId)) {
            this.categoryIds.remove(categoryId);
        }
    }

    /**
     * Adds a Tag ID to the list of Tags for the Post.
     *
     * @param tagId Tag ID of the Tag to add
     */
    public void addTag(int tagId) {
        this.tagIds.add(tagId);
    }

    /**
     * Removes a Tag ID from the list of Tags for the Post.
     *
     * @param tagId Tag ID of the Tag to remove
     */
    public void removeTag(int tagId) {
        if (this.tagIds.contains(tagId)) {
            this.tagIds.remove(tagId);
        }
    }
}
