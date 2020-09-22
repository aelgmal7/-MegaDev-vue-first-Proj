package com.example.postsBackEnd;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("posts")
public class Post {
    @Id
    private String id;
    private String title;
    private String Description;



    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return Description;
    }


    public Post(String id, String title, String description) {
        this.id = id;
        this.title = title;
        Description = description;
    }
}
