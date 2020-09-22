package com.example.postsBackEnd;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PostModel {
    @Id
    private String id;
    private String title;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public PostModel(String id, String title) {
        this.id = id;
        this.title = title;
    }
}

